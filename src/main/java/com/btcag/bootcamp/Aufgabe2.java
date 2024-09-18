package com.btcag.bootcamp;

import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahlen eingeben:");

        String input = scanner.nextLine();
        String  result= "";
        int zahl = input.length();

        while (zahl > 0) {
             result = result + input.charAt(zahl -1);
             zahl--;
        }
        System.out.println(result);
    }
}
