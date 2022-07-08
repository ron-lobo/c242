package org.ron.luckyNumberServer;

import org.springframework.stereotype.Repository;

@Repository
public class LuckyNumberDBImpl implements LuckyNumberDB {

    private final DepB depB;

    public LuckyNumberDBImpl(DepB depB) {
        this.depB = depB;
    }

    @Override
    public int getDbVal() {
        return 99;
    }
}
