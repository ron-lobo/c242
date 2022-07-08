package org.ron.luckyNumberServer;

import org.springframework.stereotype.Component;

@Component
public class DepA {

    public int processValue(int i) {
        return Math.abs(i);
    }
}
