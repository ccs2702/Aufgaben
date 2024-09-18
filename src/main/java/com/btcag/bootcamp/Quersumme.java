package com.btcag.bootcamp;

import java.util.Scanner;

public class Quersumme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahl eingeben: ");

        long input = scanner.nextLong();
        long result= input;



        System.out.println("Die Quersumme ist: " + result);
    }
}
