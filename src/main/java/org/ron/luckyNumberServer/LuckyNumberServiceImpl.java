package org.ron.luckyNumberServer;

import java.util.Random;

public class LuckyNumberServiceImpl implements LuckyNumberService {

    private final LuckyNumberDB luckyNumberDB;
    private final DepA depA;

    private Random random = new Random();

    public LuckyNumberServiceImpl(LuckyNumberDB luckyNumberDB, DepA depA) {
        this.luckyNumberDB = luckyNumberDB;
        this.depA = depA;
    }

    @Override
    public int getNum() {
        return depA.processValue(luckyNumberDB.getDbVal() + random.nextInt());
    }
}
