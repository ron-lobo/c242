package org.ron.intro;

import org.ron.vehicle.Engine;
import org.ron.vehicle.EngineComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comps {

    public static void main(String[] args) {
        Comps comps = new Comps();
        CollectionsIntro ci = new CollectionsIntro();

        List<Engine> engines = new ArrayList<>(ci.getEngines());
        System.out.println(engines.size());
//        engines.clear();
//        System.out.println(engines.size());

//        CollectionsIntro.manipulateList("Engines", engines);

        CollectionsIntro.printoutCollection("Engines", engines);
        Collections.sort(engines);
        CollectionsIntro.printoutCollection("Engines", engines);
        Collections.reverse(engines);
        CollectionsIntro.printoutCollection("Engines", engines);
        System.out.println();

        engines.sort(new EngineComparator());
        System.out.println("sort by cylinders & cc");
        CollectionsIntro.printoutCollection("Engines", engines);
    }
}
