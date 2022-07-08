package org.ron.luckyNumberServer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LuckyNumberServiceTest {

    @Mock
    private LuckyNumberDBImpl luckyNumberDB;
    @Mock
    private DepA depA;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getNum() {
        Mockito.when(depA.processValue(Mockito.anyInt())).thenReturn(99).thenReturn(88).thenThrow(RuntimeException.class);

        LuckyNumberServiceImpl luckyNumberService = new LuckyNumberServiceImpl(luckyNumberDB, depA);
        int i = luckyNumberService.getNum();
        assertEquals(i, 99);

        Mockito.verify(luckyNumberDB).getDbVal();
        Mockito.verify(depA, Mockito.times(1)).processValue(Mockito.anyInt());
    }
}
