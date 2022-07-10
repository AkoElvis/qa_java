package com.example;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void getSoundCatReturnsMeow() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals(expectedSound, actualSound);
    }

    @Test
    public void getFoodCatListContainsMeat() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = cat.getFood();
        assertEquals(expectedEatMeat, actualEatMeat);


    }

}
