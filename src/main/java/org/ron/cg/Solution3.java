package org.ron.cg;

import java.util.Scanner;

class Solution3 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // method1
        char c = String.valueOf((char) ('A' + n - 1)).charAt(0);
        String s = "";
        for (int i = 0; i < n; i++) {
            s += c;
        }
        System.out.println(s);


        // method2
        System.out.println(String.valueOf((char) ('A' + n - 1)).repeat(n));
    }
}
