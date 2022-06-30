package org.ron.luckyNumberServer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LuckyNumberServerTest {

    @Mock
    private ILuckyNumberHelper luckyNumberHelper;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getLuckyNumber() {
        Mockito.when(luckyNumberHelper.getNumber()).thenReturn(99);

        LuckyNumberServer luckyNumberServer = new LuckyNumberServer(luckyNumberHelper);
        int i = luckyNumberServer.getLuckyNumber();
        assertTrue(i > 0);
    }
}
