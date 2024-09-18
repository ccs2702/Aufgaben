package com.btcag.bootcamp;

import java.util.Scanner;

public class Divisionscheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte den Divisor eingeben:");

        int input2 = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Bis zu welcher Zahl?");

        int input3 = scanner1.nextInt();

        while (input3 >= input2) {
            input3 = input3 - input2 ;
        System.out.println(input3);
    }
}
}
