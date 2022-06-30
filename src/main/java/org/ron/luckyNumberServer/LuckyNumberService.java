package org.ron.luckyNumberServer;

import java.util.Random;

public class LuckyNumberService {

    private final LuckyNumberDB luckyNumberDB;
    private final DepA depA;

    private Random random = new Random();

    public LuckyNumberService(LuckyNumberDB luckyNumberDB, DepA depA) {
        this.luckyNumberDB = luckyNumberDB;
        this.depA = depA;
    }

    public int getNum() {
        return luckyNumberDB.getDbVal() + random.nextInt();
    }
}
