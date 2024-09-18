package com.btcag.bootcamp;

import java.util.Scanner;

public class Fibonaccifolge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie das Limit ein, bis zu dem die Fibonacci-Zahlen ausgegeben werden sollen: ");
        int limit = scanner.nextInt();

        int zahl = 0, zahl1 = 1;

        System.out.println("Die Fibonacci-Zahlen bis " + limit + " sind:");
        while (zahl <= limit) {
            System.out.print(zahl + " ");
            int folge = zahl;
            zahl = zahl1;
            zahl1 = folge + zahl1;
        }
    }
}
