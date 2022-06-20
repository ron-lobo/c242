package org.ron.examples;

public class Car {

    private final String make;
    private final String model;
    private Engine engine;
    private String colour;
    private int speed;

    public Car(String make, String model) {
        this(make, model, null, "white");
    }

    public Car(String make, String model, Engine engine, String colour) {
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return getClass() + ": make = " + make +
                ", model = " + model +
                ", engine = " + engine +
                ", colour = " + colour +
                ", speed = " + speed;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine e) {
        engine = e;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
