package org.ron.vehicle;

import java.util.Comparator;

public class EngineComparator implements Comparator<Engine> {

    @Override
    public int compare(Engine e1, Engine e2) {
        int result = e1.getType().compareTo(e2.getType());
        if (result == 0) {
            result = Integer.compare(e1.getNumCylinders(), e2.getNumCylinders());
            if (result == 0) {
                result = Integer.compare(e1.getCc(), e2.getCc());
            }
        }
        return result;
    }
}
