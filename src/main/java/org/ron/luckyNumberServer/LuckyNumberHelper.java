package org.ron.luckyNumberServer;

public class LuckyNumberHelper {

    private LuckyNumberService luckyNumberService;

    public LuckyNumberHelper(LuckyNumberService luckyNumberService) {
        this.luckyNumberService = luckyNumberService;
    }

    public int getNumber() {
        return Math.abs(luckyNumberService.getNum());
    }
}
