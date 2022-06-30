package org.ron.luckyNumberServer;

public class LuckyNumberServer {

    private ILuckyNumberHelper luckyNumberHelper;

    public static void main(String[] args) {
        DepA depA = new DepA();
        DepB depB = new DepB();
        LuckyNumberDB luckyNumberDB = new LuckyNumberDB(depB);
        LuckyNumberService luckyNumberService = new LuckyNumberService(luckyNumberDB, depA);
        ILuckyNumberHelper luckyNumberHelper = new LuckyNumberHelperImpl(luckyNumberService);
        LuckyNumberServer luckyNumberServer = new LuckyNumberServer(luckyNumberHelper);
        System.out.println(luckyNumberServer.getLuckyNumber());
    }

    public LuckyNumberServer(ILuckyNumberHelper luckyNumberHelper) {
        this.luckyNumberHelper = luckyNumberHelper;
    }

    public int getLuckyNumber() {
        return luckyNumberHelper.getNumber();
    }
}
