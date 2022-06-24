package org.ron.intro;

import org.ron.vehicle.Car;
import org.ron.vehicle.Engine;

import java.util.List;

public class Equality {

    public static void main(String[] args) {
        Equality equality = new Equality();
//        equality.method1();
        equality.method2();
    }

    private void method2() {
        CollectionsIntro ci = new CollectionsIntro();
        List<Engine> engines = ci.getEngines();
        Engine eV8_3000 = new Engine("V", 8, 3000);
        System.out.println("engines list contains v8-3000: " + engines.contains(eV8_3000));

        Car c1 = new Car("VW", "Beetle");
        Car c2 = new Car("Ford", "Fiesta");
        List<Car> cars = List.of(c1, c2);
        System.out.println("cars list contains Ford-Fiesta: " + cars.contains(new Car("Ford", "Fiesta")));


    }

    private void method1() {
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
