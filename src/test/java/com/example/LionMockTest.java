package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class LionMockTest {

    @Mock
    private Feline feline;

    @Test(expected = Exception.class)
    public void checkDoesHaveManeIncorrectValueCorrectException() throws Exception {
        Lion lion = new Lion(" ", feline);
        lion.doesHaveMane();
    }

    @Test(expected = AssertionError.class)
    public void checkLionCreationIncorrectSexCorrectException() throws AssertionError {
        try {
            Lion lion = new Lion(" ", feline);
            Assert.fail("Expected AssertionError");
        }
        catch (Exception thrown) {
            Assert.assertNotEquals("Используйте допустимые значения пола животного - самей или самка", thrown.getMessage());
        }
    }

    @Test
    public void checkGetFoodLionReturnsMeat() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = lion.getFood();
        assertEquals(expectedEatMeat, actualEatMeat);
    }

    @Test
    public void checkGetKittensLionDefaultReturnsOne() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expected = 1;
        int actual = lion.getKittens();
        assertEquals(expected, actual);
    }

}
