package org.ron.vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Car car = (Car) obj;
        return Objects.equals(make, car.make) &&
                Objects.equals(model, car.model) &&
                Objects.equals(engine, car.engine) &&
                Objects.equals(colour, car.colour) &&
                Objects.equals(wheels, car.wheels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, engine, colour, wheels);
    }

//    @Override
//    public int hashCode() {
//        // return 0;
//        // return make.hashCode() + model.hashCode() + engine.hashCode() + colour.hashCode() + wheels.hashCode();
//        final int PRIME = 97;
//        int result = 1;
//        result = result * PRIME + (make == null ? 0 : make.hashCode());
//        result = result * PRIME + (model == null ? 0 : model.hashCode());
//        result = result * PRIME + (engine == null ? 0 : engine.hashCode());
//        result = result * PRIME + (colour == null ? 0 : colour.hashCode());
//        result = result * PRIME + (wheels == null ? 0 : wheels.hashCode());
//        return result;
//    }

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
