package org.ron.intro;

import org.ron.vehicle.Car;
import org.ron.vehicle.Engine;

import java.util.ArrayList;
import java.util.List;

public class Equality {

    public static void main(String[] args) {
        Equality equality = new Equality();
        equality.intro();
        equality.objectEquality();
        equality.listEquality();
    }

    private void listEquality() {
        List<String> letters1 = List.of("A", "B", "C");
        List<String> letters2 = List.of("A", "B", "C");
        List<String> letters3 = new ArrayList<>();
        letters3.add("A");
        letters3.add("C");
        letters3.add("B");
        System.out.println("l1, l2: " + letters1.equals(letters2));
        System.out.println("l1, l3: " + letters1.equals(letters3));
        System.out.println("l2, l3: " + letters2.equals(letters3));
    }

    private void objectEquality() {
        CollectionsIntro ci = new CollectionsIntro();
        List<Engine> engines = ci.getEngines();
        Engine eV8_3000 = new Engine("V", 8, 3000);
        System.out.println("engines list contains v8-3000: " + engines.contains(eV8_3000));

        Car c1 = new Car("VW", "Beetle");
        Car c2 = new Car("Ford", "Fiesta", eV8_3000, "red");
        List<Car> cars = List.of(c1, c2);
        System.out.println("cars list contains Ford-Fiesta: " + cars.contains(
                new Car("Ford", "Fiesta")));
        System.out.println("cars list contains Ford-Fiesta: " + cars.contains(
                new Car("Ford", "Fiesta", null, "red")));
        System.out.println("cars list contains Ford-Fiesta: " + cars.contains(
                new Car("Ford", "Fiesta", new Engine("V", 8, 3000), "red")));
    }

    private void intro() {
        int i = 5;
        int l = 10;
        testEquality(i, l);
        l -= 5;
        testEquality(i, l);

        Engine e1 = new Engine("V", 4, 2000);
        Engine e2 = new Engine("V", 4, 2000);
        Engine e3 = new Engine("V", 8, 3000);
        Engine e4 = new Engine(null, 8, 3000);
        Engine e5 = new Engine(null, 8, 3000);
//        testEquality(e1, e1);
        testEquality(e1, e2);
        System.out.println("equals1: " + e1.equals(e1));
        System.out.println("equals2: " + e1.equals(e2));
        System.out.println("equals3: " + e1.equals(e3));
        System.out.println("equals4: " + e1.equals(e4));
        System.out.println("equals5: " + e4.equals(e1));
        System.out.println("equals6: " + e4.equals(e5));
        System.out.println("equals7: " + e1.equals(null));
        System.out.println("equals8: " + e1.equals("hello"));
    }

    public static void testEquality(Object o1, Object o2) {
        System.out.println("testEquality: o1 = " + o1);
        System.out.println("testEquality: o2 = " + o2);
        System.out.println("testEquality: ==" + (o1 == o2));
        System.out.println("testEquality: equals()" + (o1.equals(o2)));
        System.out.println();
    }
}
