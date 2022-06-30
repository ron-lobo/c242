package org.ron.luckyNumberServer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LuckyNumberServerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getLuckyNumber() {
        DepA depA = new DepA();
        DepB depB = new DepB();
        LuckyNumberDB luckyNumberDB = new LuckyNumberDB(depB);
        LuckyNumberService luckyNumberService = new LuckyNumberService(luckyNumberDB, depA);
        LuckyNumberHelper luckyNumberHelper = new LuckyNumberHelper(luckyNumberService);
        LuckyNumberServer luckyNumberServer = new LuckyNumberServer(luckyNumberHelper);
        int i = luckyNumberServer.getLuckyNumber();
        assertTrue(i >= 0);
    }
}