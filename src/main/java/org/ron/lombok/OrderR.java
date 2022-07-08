package org.ron.lombok;

import org.ron.vehicle.Car;
import org.ron.vehicle.Engine;

import java.util.List;

public record OrderR(int i,
                     double d,
                     String s,
                     Engine engine,
                     List<Car> cars,
                     boolean isOk) {
}
