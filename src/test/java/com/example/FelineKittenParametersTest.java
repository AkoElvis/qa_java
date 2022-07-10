package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineKittenParametersTest {

    private final int checked;
    private final int expected;

    public FelineKittenParametersTest(int checked, int expected) {
        this.checked = checked;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][]{
                {-1, -1},
                {0, 0},
                {2, 2},
                {-2, -2},
                {2147483647, 2147483647},
                {-2147483647, -2147483647},
                {2147483646, 2147483646},
                {-2147483646, -2147483646}
        };
        }

    @Test
    public void checkGetKittensReturnsTheEnteredNumber() {
        Feline feline = new Feline();
        int actual = feline.getKittens(checked);
        assertEquals(expected, checked);
    }
}
