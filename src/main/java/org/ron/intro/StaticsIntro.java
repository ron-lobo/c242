package org.ron.intro;

import org.ron.examples.Fibonacci;

public class StaticsIntro {

    private int i;
    private static double d = 2;
    private static final String s = setVal();

    // 4 access modifiers
    public char c1;
    protected char c2;
    private char c3;
    char c4;

    static {
        System.out.println("initialising StaticsIntro class;  s=" + s);
    }

    public static void main(String[] args) {
        System.out.println("Hello (from main())");

        StaticsIntro si1 = new StaticsIntro();
        StaticsIntro si2 = new StaticsIntro();
//        si2.setI(999);
        si2.i = 999;
        d = 55;

        System.out.println("si1 = " + si1.i + ", " + si1.d);
        System.out.println("si2 = " + si2.i + ", " + si2.d);

        long l = Fibonacci.getFib(123);
    }

    public StaticsIntro() {
        i = 1;
        // s = "c242";
    }

    public int getI() {
        return i;
    }

    public void setI(int newVal) {
        i = newVal;
    }

    public static String getS() {
        return s;
    }

    private static String setVal() {
        return "class C242";
    }

    public String doSomething(boolean b) {
        int v = i;
        if (b) v += d;
        return s + " " + v;
    }
}
