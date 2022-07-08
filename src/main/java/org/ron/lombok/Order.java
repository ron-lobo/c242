package org.ron.lombok;

import org.ron.vehicle.Car;
import org.ron.vehicle.Engine;

import java.util.List;
import java.util.Objects;

public class Order {

    private int i;
    private double d;
    private String s;
    private Engine engine;
    private List<Car> cars;
    private boolean isOk;

    public Order(int i, double d, String s, Engine engine, List<Car> cars, boolean isOk) {
        this.i = i;
        this.d = d;
        this.s = s;
        this.engine = engine;
        this.cars = cars;
        this.isOk = isOk;
    }

    @Override
    public String toString() {
        return "Order{" +
                "i=" + i +
                ", d=" + d +
                ", s='" + s + '\'' +
                ", engine=" + engine +
                ", cars=" + cars +
                ", isOk=" + isOk +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return i == order.i && Double.compare(order.d, d) == 0 && isOk == order.isOk && Objects.equals(s, order.s) && Objects.equals(engine, order.engine) && Objects.equals(cars, order.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, d, s, engine, cars, isOk);
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public boolean isOk() {
        return isOk;
    }

    public void setOk(boolean ok) {
        isOk = ok;
    }
}
