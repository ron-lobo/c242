package org.ron.vehicle;

public class Engine {

    private final String type;  // V or S
    private final int numCylinders;
    private final int cc;

    public Engine(String type, int numCylinders, int cc) {
        this.type = type;
        this.numCylinders = numCylinders;
        this.cc = cc;
    }

    public String getType() {
        return type + numCylinders;
    }

    public int getCc() {
        return cc;
    }

    public int getNumCylinders() {
        return numCylinders;
    }

    public String toString() {
        return getClass().getSimpleName() + " {" + getType() + ", numCylinders=" + numCylinders + ", cc=" + cc + "}";
    }
}
