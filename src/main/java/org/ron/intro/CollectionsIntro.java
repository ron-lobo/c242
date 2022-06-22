package org.ron.intro;

import org.apache.commons.collections4.list.TreeList;
import org.ron.vehicle.Car;
import org.ron.vehicle.Engine;

import java.util.*;


public class CollectionsIntro {

    private Random random = new Random();
    private Engine e1 = new Engine("V", 4, 2000);
    private Engine e2 = new Engine("V", 6, 2400);
    private Engine e3 = new Engine("V", 8, 3000);
    private Engine e4 = new Engine("S", 4, 1200);
    private Engine e5 = new Engine("S", 6, 1600);

    public static void main(String[] args) {
        CollectionsIntro ci = new CollectionsIntro();
//        ci.arrays();
        ci.lists();
//        ci.sets();
        ci.maps();
    }

    private void maps() {
    }

    private void sets() {
        Set<String> drivers1 = new HashSet<>();
        Set<String> drivers2 = new TreeSet<>();

        drivers1.add("V");

        setHelper("HashSet", drivers1);
        setHelper("TreeSet", drivers2);
    }

    private void setHelper(String name, Set<String> drivers) {
        System.out.println("set: " + name + ", size = " + drivers.size());
        drivers.add("Jungkook");
        drivers.add("V");
        drivers.add("Suga");
        drivers.add("RM");
        drivers.add("Jungkook");
        drivers.add("Jimin");
        drivers.add("Jungkook");
        for (String driver : drivers) {
            System.out.println("  " + driver);
        }
        System.out.println(" new size = " + drivers.size());
    }

    private void lists() {
//         ArrayList<Integer> intList = new ArrayList<>(); // don't do this
        List<Integer> intList1 = new ArrayList<>();
        List<Integer> intList2 = new LinkedList<>();
        List<Integer> intList3 = new TreeList<>();

        listHelper("ArrayList", intList1);
        listHelper("LinkedList", intList2);
        listHelper("TreeList", intList3);

        removeDuplicates("ArrayList", intList1);
        removeDuplicates("LinkedList", intList2);
        removeDuplicates("TreeList", intList3);
    }

    private void removeDuplicates(String name, List<Integer> intList) {
        Set<Integer> intSet = new HashSet<>(intList);
        System.out.printf("list %s contains %d items, #unique=%d %n", name, intList.size(), intSet.size());

        intList.clear();
        intList.addAll(intSet);
    }

    private void listHelper(String text, List<Integer> list) {
        while (random.nextDouble() > 0.1) {
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
