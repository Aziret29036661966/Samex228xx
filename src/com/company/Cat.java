package com.company;

public class Cat extends Animal{
    private int age;
    public Cat(String name) {
        super(name);
    }

    @Override
    public int Age() {
        return age;
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC08");
    }
}
