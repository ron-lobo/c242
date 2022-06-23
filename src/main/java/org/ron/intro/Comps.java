package org.ron.intro;

import org.ron.vehicle.Engine;
import org.ron.vehicle.EngineComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Comps {

    public static void main(String[] args) {
        CollectionsIntro ci = new CollectionsIntro();
        List<Engine> engines = new ArrayList<>(ci.getEngines());
        manipulateList("Engines", engines);
        System.out.println();
        engines.sort(new EngineComparator());
        System.out.println("sort by type, cylinders & cc");
        printoutCollection("Engines", engines);
    }

    public static void manipulateList(String name, List<? extends Comparable> intList) {
        Collections.sort(intList);
        printoutCollection("sorted " + name, intList);
        Collections.reverse(intList);
        printoutCollection("reverse sorted " + name, intList);
        Collections.shuffle(intList);
        printoutCollection("shuffled " + name, intList);
    }

    public static void printoutCollection(String text, Collection<?> collection) {
        System.out.println("collection name = " + text + ", size = " + collection.size());
        final String SEPARATOR = ", ";
        StringBuilder sb = new StringBuilder();
        for (Object i : collection) {
            sb.append(i).append(SEPARATOR);
        }
        sb.deleteCharAt(sb.lastIndexOf(SEPARATOR));
        System.out.println(sb);
    }
}
