package org.ron.intro;

import org.apache.commons.collections4.list.TreeList;
import org.ron.vehicle.Car;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class CollectionsIntro {

    private Random random = new Random();

    public static void main(String[] args) {
        CollectionsIntro ci = new CollectionsIntro();
//        ci.arrays();
        ci.lists();
    }

    private void lists() {
//         ArrayList<Integer> intList = new ArrayList<>(); // don't do this
        List<Integer> intList1 = new ArrayList<>();
        List<Integer> intList2 = new LinkedList<>();
        List<Integer> intList3 = new TreeList<>();

        listHelper("ArrayList", intList1);
        listHelper("LinkedList", intList2);
        listHelper("TreeList", intList3);
    }

    private void listHelper(String text, List<Integer> list) {
        while (random.nextDouble() > 0.15) {
            list.add(random.nextInt(10));
        }
        list.add(0, 555);
        if (list.size() > 2) list.add(list.size() / 2, 777);
        System.out.println("list name = " + text + ", size = " + list.size());
        for (Integer i : list) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    private void arrays() {
        int[] ints1 = new int[]{3, 55, 99, -7};
        int[] ints2 = new int[6];
        double doubles[] = new double[]{3, 55, 99, -7};

        for (int i = 0; i < ints2.length; i++) {
            System.out.printf("i=%d, ints[i]=%d%n", i, ints2[i]);
        }

        for (double d : doubles) {
            System.out.println(d);
        }

        Car[] cars = new Car[999];
    }
}
