package org.ron.luckyNumberServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class LuckyNumberServiceImpl implements LuckyNumberService {

    @Autowired
    private LuckyNumberDB luckyNumberDB;
    private DepA depA;
    private Random random = new Random();

    @Autowired
    public LuckyNumberServiceImpl() {
    }

    public LuckyNumberServiceImpl(LuckyNumberDB luckyNumberDB, DepA depA) {
        this.luckyNumberDB = luckyNumberDB;
        this.depA = depA;
    }

    @Autowired
    public void setDepA(DepA depA) {
        this.depA = depA;
    }

    @Override
    public int getNum() {
        return depA.processValue(luckyNumberDB.getDbVal() + random.nextInt());
    }
}
