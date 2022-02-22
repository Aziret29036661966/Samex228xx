package com.company;

public abstract class Figure implements Drawbale {
    private String name;

    public Figure(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
    public abstract int calculatePerimeters();


}
