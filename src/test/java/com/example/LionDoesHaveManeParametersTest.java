package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

//запускаем тест с параметризацией
@RunWith(Parameterized.class)

public class LionDoesHaveManeParametersTest {
    Feline feline = new Feline();
    private final String sex;
    private final boolean expected;

    public LionDoesHaveManeParametersTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }
    //прописываем тестовые данные
    @Parameterized.Parameters
    public static Object[][] getSex() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    //проверяем, что метод doesHaveMane(), выполненный для объекта с корректными параметрами, вернет корректный ответ true/false
    @Test
    public void checkDoesHaveManeReturnsCorrectValue() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(expected, lion.doesHaveMane());
    }

}
