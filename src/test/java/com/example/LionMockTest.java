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

//подключаем мокито
@RunWith(MockitoJUnitRunner.class)

public class LionMockTest {

    @Mock
    private Feline feline;

    //проверяем что метод doesHaveMane(), выполненный для объекта с некорректными параметрами, вернет эксепшн
    @Test(expected = Exception.class)
    public void checkDoesHaveManeIncorrectValueCorrectException() throws Exception {
        Lion lion = new Lion(" ", feline);
        lion.doesHaveMane();
    }

    //проверяем что при создании объекта с некорректными параметрами вернется эксепшн
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

    //проверяем что метод getFood() для Lion возвращает список еды для "Хищник"
    @Test
    public void checkGetFoodLionReturnsMeat() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = lion.getFood();
        assertEquals(expectedEatMeat, actualEatMeat);
    }

    //проверяем что метод getKittens, выполненный без параметра, вернет 1 по умолчанию
    @Test
    public void checkGetKittensLionDefaultReturnsOne() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expected = 1;
        int actual = lion.getKittens();
        assertEquals(expected, actual);
    }

}
