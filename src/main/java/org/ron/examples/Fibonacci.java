package org.ron.examples;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter a number: ");
            int i = s.nextInt();
            long n = getFib(i);
            System.out.println(i + "th value in the series is: " + n);
        }
    }

    public static long getFib(int n) {
        if (n <= 2) return 1;
        long a = 1, b = 1;
        for (int i = 3; i < n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        return a + b;
    }
}

// 1  2  3  4  5  6  7   8
// 1, 1, 2, 3, 5, 8, 13, 21 ...
