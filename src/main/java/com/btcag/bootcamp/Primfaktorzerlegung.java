package com.btcag.bootcamp;

import java.util.Scanner;

public class Primfaktorzerlegung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahl für den Primtest eingeben: ");

        long input = scanner.nextLong();
        long input2 = input -1;
        boolean isPrim = true;

        while (input2 > 1) {
            long result = input % input2;
            isPrim = result > 0;
            input2--;
        }
        System.out.println(isPrim);
    }
}
