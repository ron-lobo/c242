package org.ron.vehicle;

public class Engine implements Comparable<Engine> {

    private final String type;  // V or S
    private final int numCylinders;
    private final int cc;

    public Engine(String type, int numCylinders, int cc) {
        this.type = type;
        this.numCylinders = numCylinders;
        this.cc = cc;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || !(obj instanceof Engine))
            return false;
        Engine e = (Engine) obj;
        return (type == e.type || (type != null && type.equals(e.type))) &&
                getNumCylinders() == e.getNumCylinders() &&
                getCc() == e.getCc();
    }

    public String getType() {
        return type;
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

    @Override
    public int compareTo(Engine e) {
        return Integer.compare(cc, e.cc);
//        if (this.cc == e.cc) {
//            return 0;
//        } else if (this.cc < e.cc) {
//            return -1;
//        } else {
//            return 1;
//        }
    }
}