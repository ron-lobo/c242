package org.ron.lombok;

import org.ron.vehicle.Engine;

import java.util.ArrayList;

public class Misc {

    public static void main(String[] args) {
        OrderR orderR = new OrderR(123, 3.14, "hi", new Engine("V", 6, 3000), new ArrayList(), true);
        System.out.println(orderR);
        System.out.println(orderR.engine());
        System.out.println(orderR.s());

        OrderL orderL = new OrderL(123, 3.14, "hi", new Engine("V", 6, 3000), new ArrayList(), true);
        System.out.println(orderR);
        System.out.println(orderR.engine());
        System.out.println(orderR.s());
        orderL.setOk(false);
        System.out.println(orderR);
    }
}
