package com.example;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class CatTest {

    //проверяем что метод getSound() для Cat возвращает "Мяу"
    @Test
    public void checkGetSoundCatReturnsMeow() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals(expectedSound, actualSound);
    }

    //проверяем что метод getFood для Cat возвращает список еды для "Хищник"
    @Test
    public void checkGetFoodCatListContainsMeat() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = cat.getFood();
        assertEquals(expectedEatMeat, actualEatMeat);


    }

}
