package com.example;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void checkGetFoodFelineReturnsMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = feline.eatMeat();
        assertEquals(expectedEatMeat, actualEatMeat);
    }

    @Test
    public void checkGetFamilyReturnsFeline() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void checkGetKittensDefaultReturnsOne() {
        Feline feline = new Feline();
        int expectedNumberOfKittens = 1;
        int actualNumberOfKittens = feline.getKittens();
        assertEquals(expectedNumberOfKittens, actualNumberOfKittens);
    }

}
