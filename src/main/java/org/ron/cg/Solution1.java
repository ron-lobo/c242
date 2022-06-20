package org.ron.cg;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution1 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();

        int sum = 0;
        for (int p = 0; p < x; p++) {
            sum += Math.pow(n, p);
        }
        System.out.println(sum);

        System.out.println(IntStream.range(0, x).map(p -> (int) Math.pow(n, p)).sum());
    }
}
