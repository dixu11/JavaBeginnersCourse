package com;

import java.util.Random;

public class Losowanie {
    public static void main(String[] args) {
        double x = Math.random() * 5;

        if (x > 3) System.out.println("Duża liczba"); // można w jednej linii

        System.out.println(x);
    }
}
