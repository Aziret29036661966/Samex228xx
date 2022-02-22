package com.company;

public class Triangle extends Figure {
    private int sidea, sideb, sidec;

    public Triangle(String name, int sidea, int sideb, int sidec) {
        super(name);
        this.sidea = sidea;
        this.sideb = sideb;
        this.sidec = sidec;
    }

    @Override
    public int calculatePerimeters() {
        return sidea + sideb + sidec;
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDD3A");
    }
}
