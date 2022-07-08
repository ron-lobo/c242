package org.ron.luckyNumberServer;

import org.springframework.stereotype.Controller;

@Controller
public class LuckyNumberHelperImpl implements LuckyNumberHelper {

    private LuckyNumberService luckyNumberService;

    public LuckyNumberHelperImpl(LuckyNumberService luckyNumberService) {
        this.luckyNumberService = luckyNumberService;
    }

    public int getNumber() {
        return Math.abs(luckyNumberService.getNum());
    }
}
