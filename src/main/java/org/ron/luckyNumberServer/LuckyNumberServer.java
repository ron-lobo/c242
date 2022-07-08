package org.ron.luckyNumberServer;

public class LuckyNumberServer {

    private LuckyNumberHelper luckyNumberHelper;

    public static void main(String[] args) {
        var depA = new DepA();
        DepB depB = new DepB();
        LuckyNumberDB luckyNumberDB = new LuckyNumberDBImpl(depB);
        LuckyNumberService luckyNumberService = new LuckyNumberServiceImpl(luckyNumberDB, depA);
        LuckyNumberHelper luckyNumberHelper = new LuckyNumberHelperImpl(luckyNumberService);
        LuckyNumberServer luckyNumberServer = new LuckyNumberServer(luckyNumberHelper);
        System.out.println(luckyNumberServer.getLuckyNumber());
    }

    public LuckyNumberServer(LuckyNumberHelper luckyNumberHelper) {
        this.luckyNumberHelper = luckyNumberHelper;
    }

    public int getLuckyNumber() {
        return luckyNumberHelper.getNumber();
    }
}
