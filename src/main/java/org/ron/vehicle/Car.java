package org.ron.vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Car {

    private final String make;
    private final String model;
    private Engine engine;
    private String colour;
    private int speed;
    private List<String> wheels = new ArrayList<>();

    public Car(String make, String model) {
        this(make, model, null, "white");
    }

    public Car(String make, String model, Engine engine, String colour) {
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.colour = colour;
        wheels.addAll(List.of("wheel1", "wheel2", "wheel3", "wheel4"));
    }

    @Override
    public String toString() {
        return getClass() + ": make = " + make +
                ", model = " + model +
                ", engine = " + engine +
                ", colour = " + colour +
                ", speed = " + speed +
                ", wheels = " + wheels;
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

    public List<String> getWheels() {
        return Collections.unmodifiableList(wheels);
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