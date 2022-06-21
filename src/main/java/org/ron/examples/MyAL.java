package org.ron.examples;

public class MyAL {

    private int maxCapacity = 10;
    private int[] data = new int[maxCapacity];
    private int size = 0;

    public int get(int index) {
        return data[index];
    }

    public void add(int i) {
        size += 1;
        if (size == maxCapacity) {
            maxCapacity *= 2;
            int[] newData = new int[maxCapacity];
            // copy from data -> newData
            data = newData;
        }
        data[size] = i;
    }

    public void add(int i, int index) {
    }

    public void remove(int index) {

    }

    public int size() {
        return size;
    }
}
