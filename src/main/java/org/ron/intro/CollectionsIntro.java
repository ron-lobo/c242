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
        ci.arrays();
        ci.lists();
        ci.sets();
        ci.maps();
    }

    private void maps() {
        System.out.println("\nMaps");
        Map<String, Engine> driver2EngineMap1 = new HashMap<>();
        Map<String, Engine> driver2EngineMap2 = new TreeMap<>();

        loadMap(driver2EngineMap1);
        loadMap(driver2EngineMap2);
        driver2EngineMap1.put("V", e5);

        showMap("HashMap", driver2EngineMap1);
//        showMap("TreeMap", driver2EngineMap2);
    }

    private void showMap(String name, Map<String, Engine> driver2EngineMap) {
        System.out.printf("map: %s, size=%d%n", name, driver2EngineMap.size());
        for (String driver : driver2EngineMap.keySet()) {
            System.out.printf("  driver: %s, engine: %s %n", driver, driver2EngineMap.get(driver));
        }
        System.out.println();
        for (Map.Entry<String, Engine> entry : driver2EngineMap.entrySet()) {
            System.out.printf("  driver: %s, engine: %s %n", entry.getKey(), entry.getValue());
        }
//        System.out.println();
//        driver2EngineMap.forEach((k,v) -> System.out.printf(" driver: %s, engine: %s%n", k, v));
    }

    private void loadMap(Map<String, Engine> map) {
        map.put("Jungkook", e1);
        map.put("V", e2);
        map.put("RM", e3);
        map.put("Jimin", e4);
        map.put("Suga", e5);
//        map.put("Suga", e4);
//        map.put("Suga", e3);
    }

    private void sets() {
        System.out.println("\nSets");
        Set<String> drivers1 = new HashSet<>();
        Set<String> drivers2 = new TreeSet<>();

        drivers1.add("V");

        setHelper("HashSet", drivers1);
        setHelper("TreeSet", drivers2);

        Set<Integer> intSet = Set.of(33, 55, 777, 9999, -12345);
        Comps.printoutCollection("intSet", intSet);
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
        Comps.printoutCollection(name, drivers);
        System.out.println(" new size = " + drivers.size());
    }

    public List<Engine> getEngines() {
        return List.of(e1, e2, e3, e4, e5);
    }

    private void lists() {
        System.out.println("\nLists");
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

//        intList1 = Collections.unmodifiableList(intList1);
        Comps.manipulateList("ArrayList", intList1);
        Comps.manipulateList("LinkedList", intList2);
        Comps.manipulateList("TreeList", intList3);

//        List<Engine> emptyAndUnmodifyable = List.of();
        List<Engine> unmodifyable = List.of(e1, e2, e3, e5, e4);
        List<Engine> modifyable = new ArrayList<>(unmodifyable);
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
        Comps.printoutCollection(text, list);
    }

    private void arrays() {
        System.out.println("Arrays");
        final int[] ints1 = new int[]{3, 55, 99, -7};
        int[] ints2 = new int[6];
        double doubles[] = new double[]{3, 55, 99, -7};

        ints1[0] = 333;

        for (int i = 0; i < ints1.length; i++) {
            System.out.printf("ints1: i=%d, ints[i]=%d%n", i, ints1[i]);
        }

        for (int i : ints2) {
            System.out.printf("ints2: value=%d%n", i);
        }

        for (double d : doubles) {
            System.out.println(d);
        }

        Car[] cars = new Car[999];
    }
}
