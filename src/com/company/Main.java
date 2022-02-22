package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        dog dog = new dog("Rex");
        Cat cat = new Cat("Kendis");
        Circle circle = new Circle("Circle", 13);
        Triangle triangle = new Triangle("Triangle", 4, 6, 3);
        Square square = new Square("Square", 10);
        System.out.println(circle.getName() + "Perimeters -> " + circle.calculatePerimeters());
        System.out.println(triangle.getName() + "Perimeters -> " + triangle.calculatePerimeters());
        System.out.println(square.getName() + "Perimeters -> " + square.calculatePerimeters());
        System.out.println("-----------------------------------------------------------------");
        Drawbale[] drawbales = {circle, triangle, square, cat, dog};
        for (Drawbale draw : drawbales) {
            if (draw instanceof Figure) {
                if (draw instanceof Animal) {
                System.out.println(((Figure) draw).getName() + "  ---  " + ((Figure) draw).calculatePerimeters() + ((Animal) draw).getName());
            }
        }
            draw.draw();
        }
    }
}