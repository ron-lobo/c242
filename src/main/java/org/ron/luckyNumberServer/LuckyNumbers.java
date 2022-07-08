package org.ron.luckyNumberServer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
// @Configuration
public class LuckyNumbers {

    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(LuckyNumbers.class);
        LuckyNumberServer luckyNumberServer = appContext.getBean(LuckyNumberServer.class);
        System.out.println(luckyNumberServer.getLuckyNumber());
    }

    @Bean
    private LuckyNumberServer getLuckyNumberServer(LuckyNumberHelper luckyNumberHelper) {
        return new LuckyNumberServer(luckyNumberHelper);
    }

    //    @Bean
    private LuckyNumberHelper getLuckyNumberHelper(LuckyNumberService luckyNumberService) {
        return new LuckyNumberHelperImpl(luckyNumberService);
    }

    //    @Bean
    private LuckyNumberService getLuckyNumberService(LuckyNumberDB luckyNumberDB) {
        DepA depA = new DepA();
        return new LuckyNumberServiceImpl(luckyNumberDB, depA);
    }

    //    @Bean
    private LuckyNumberDB getLuckyNumberDB() {
        return new LuckyNumberDBImpl(new DepB());
    }

    @Bean
    private DepB getDepB() {
        return new DepB();
    }

    //    @Bean
    private DepA getDepA() {
        return new DepA();
    }
}
