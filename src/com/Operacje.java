package com;

import java.util.Random;

public class Operacje {
    public static void main(String[] args) {
        double test = Math.random();
        double wiek = test * 90 + 10;
        double waga = test * 50 + 100;
        double wzrost = test * 100 + 150; // od 150 do 200

        System.out.printf("Test %.2f\n", test);
        System.out.printf("Wiek: %.0f\n", wiek);
        System.out.printf("Waga: %.0f\n", waga);
        System.out.printf("Wzrost: %.0f\n", wzrost);

        if (wzrost>200 && waga > 100) { // jeden & zadziała inaczej
            System.out.println("Jesteś ogromny!");
        }
        if (wzrost > 200 || waga > 100) {
            System.out.println("Nie będę się z Tobą bił");
        }
        if (!(wiek < 70)) {
            System.out.println("Już nie taki młodzieniaczek");
        }
    }
}
