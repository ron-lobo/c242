package org.ron.intro;

import org.ron.vehicle.Car;
import org.ron.vehicle.Engine;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapsIntro {

    private Map<Car, Engine> car2EngineMap = new HashMap<>();
    private Car car = new Car("VW", "Beetle");
    private Engine engine = new Engine("S", 4, 1200);
    private Engine engineB = new Engine("S", 4, 1300);

    public static void main(String[] args) {
        MapsIntro mapsIntro = new MapsIntro();
        // mapsIntro.testHashMap();
        mapsIntro.carEngineMap();
    }

    private void carEngineMap() {
        populateMap();

        Car car1 = new Car("VW", "Beetel");
        System.out.println("equals? " + car1.equals(car) + "; " + car.hashCode() + ", " + car1.hashCode());

        System.out.println("using car1:     engine=" + car2EngineMap.get(car1));
        System.out.println("using car:      engine=" + car2EngineMap.get(car));

        System.out.println(car2EngineMap.size());
        car2EngineMap.put(car, engineB);
        System.out.println(car2EngineMap.size());

        System.out.println("using car:      engine=" + car2EngineMap.get(car));
    }

    private void populateMap() {
        car2EngineMap.put(car, engine);
    }

    private void testHashMap() {

        Random random = new Random();

        Map<Integer, Double> myMap = new HashMap<>();
        int numElements = 1000000;
        long startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            myMap.put(i, random.nextDouble());
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("map.put: duration=" + duration + "ns, avg=" + duration / numElements + "ns");


        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            myMap.get(random.nextInt(numElements));
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("map.get: duration=" + duration + "ns, avg=" + duration / numElements + "ns");

        int key = random.nextInt(numElements);
        double val = myMap.get(key);
        System.out.printf("key=%d, val=%f", key, val);
    }


}
