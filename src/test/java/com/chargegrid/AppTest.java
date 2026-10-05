package com.chargegrid;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void nameIsChargeGrid() {
        assertEquals("ChargeGrid", App.name());
    }
}