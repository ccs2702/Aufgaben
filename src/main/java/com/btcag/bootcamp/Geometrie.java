package com.btcag.bootcamp;

import java.util.Scanner;

public class Geometrie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A) Bitte Zahlen eingeben:");

        int input = scanner.nextInt();
        System.out.println(3.14 * (input * input));

        Scanner newscanner = new Scanner(System.in);
        Scanner newscanner1 = new Scanner(System.in);
        System.out.println("B) Bitte 2 Zahlen eingeben:");

        int input2 = newscanner.nextInt();
        int input3 = newscanner1.nextInt();
        System.out.println(input2 * input3);

    }
}
