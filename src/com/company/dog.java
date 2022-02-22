package com.company;

public class dog extends Animal{
    private int age;
    public dog(String name) {
        super(name);
    }

    @Override
    public int Age() {
        return age;
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC15");
    }
}
