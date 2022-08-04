package com.example;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {

    //проверяем что метод getFood() для Feline возвращает список еды для "Хищник"
    @Test
    public void checkGetFoodFelineReturnsMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = feline.eatMeat();
        assertEquals(expectedEatMeat, actualEatMeat);
    }

    //проверяем что метод getFamily() для Feline возвразает "Кошачьи"
    @Test
    public void checkGetFamilyReturnsFeline() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals(expectedFamily, actualFamily);
    }

    //проверяем что метод getKittens, выполненный без параметра, вернет 1 по умолчанию
    @Test
    public void checkGetKittensDefaultReturnsOne() {
        Feline feline = new Feline();
        int expectedNumberOfKittens = 1;
        int actualNumberOfKittens = feline.getKittens();
        assertEquals(expectedNumberOfKittens, actualNumberOfKittens);
    }

}
