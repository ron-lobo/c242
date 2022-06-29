package org.ron.examples;

import org.ron.intro.InnerClasses;

import java.util.ArrayList;
import java.util.List;

public class Misc {

    public static void main(String[] args) {
        method1("0 vals");
        method1("1 val", 5);
        method1("5 vals", 1, 2, 3, 4, 5);
        method2(new int[]{1, 2, 3, 4, 5});
    }

    private static void method2(int[] vals) {
    }

    private static void method1(String s, int... vals) {
        System.out.print(s + "   ");
        for (int i : vals) {
            System.out.print(i + " : " + i * i + ";  ");
        }
        System.out.println();
    }

    public void ternaryOpDemo(int x, int y) {
        int z;
        if (x == y) {
            z = 5;
        } else {
            z = 9;
        }
        int z1 = x == y ? 5 : 9;
    }

    public boolean compWinner(int userMove, int compMove) {
        if (userMove == 1) {
            return (compMove == 2); //if user picks 1 and comp picks 2 then comp wins so this will return a true, else comp chose 3 and lost so false
        } else if (userMove == 2) {
            return (compMove == 3);
        } else {
            return (compMove == 1);
        }
    }

    public boolean compWinner1(int userMove, int compMove) {
        return userMove == 1 ? compMove == 2 : userMove == 2 ? compMove == 3 : compMove == 1;
    }

    public boolean compWinner2(int userMove, int compMove) {
        if (userMove == 3) {
            return compMove == 1;
        } else {
            return compMove == userMove + 1;
        }
    }

    public boolean compWinner3(int userMove, int compMove) {
        return compMove == (userMove + 1) % 3;
    }


    public static List<Integer> generatePercentageList(List<String> dogBreeds) {
        List<Integer> percentages = new ArrayList<>();
        return percentages;
    }

    private void inner() {
        InnerClasses ic = new InnerClasses();
        InnerClasses.Student student = ic.new Student(2, "Draco M");
//        System.out.println("student: " + s0.id + ", " + s0.name);

        InnerClasses.Employee e0 = new InnerClasses.Employee(321, "Minerva");
//        System.out.println("employee: " + e0.id + ", " + e0.name);
    }
}
