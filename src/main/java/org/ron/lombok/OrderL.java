package org.ron.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.ron.vehicle.Car;
import org.ron.vehicle.Engine;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class OrderL {

    private final int i;
    private final double d;
    private String s;
    private Engine engine;
    private List<Car> cars;
    private boolean isOk;
}
