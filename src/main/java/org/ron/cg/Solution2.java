package org.ron.cg;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution2 {

    public static void main(String[] args) {
        while (true) {
            System.out.print("calling main1() : ");
            main1(args);
            System.out.print("calling main2() : ");
            main2(args);
            System.out.println();
        }
    }

    public static void main1(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for (int i = s.length() - 1; i >= 0; i -= 2) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }

    public static void main2(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(IntStream.iterate(s.length() - 1, i -> i >= 0, i -> i -= 2)
                .mapToObj(i -> s.charAt(i) + "")
                .collect(Collectors.joining()));
    }
}
