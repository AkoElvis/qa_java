package com.example;

import java.util.List;

public class Lion {

    //объявляем непубличный экземпляр класса Feline, но не присваеваем ему значение, чтобы изолировать Feline от Lion
    private Feline feline;
    boolean hasMane;

    //теперь конструктор принимает экземпляр класса Feline как параметр
    public Lion(String sex, Feline feline) throws Exception {
        //добавляем ключевое слово this, тк у переменных feline одинаковые имена
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }
    //это объявление более не нужно, его закомментируем
    //Feline feline = new Feline();

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
