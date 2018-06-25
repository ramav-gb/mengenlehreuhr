package com.solution;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MengenlehreuhrTest {

    private Mengenlehreuhr mengenlehreuhr;

    @BeforeEach
    void setup() {
        mengenlehreuhr = new Mengenlehreuhr();
    }
    @Test
    void testDisplayStringWithAllOff() {
        String displayString = mengenlehreuhr.getDisplayString(0, 0, 1);
        assertEquals("O\n" +
                "OOOO\n" +
                "OOOO\n" +
                "OOOOOOOOOOO\n" +
                "OOOO", displayString);
    }

    @Test
    void testDisplayStringAtMidnight() {
        String displayString = mengenlehreuhr.getDisplayString(0, 0, 0);
        assertEquals("Y\n" +
                "OOOO\n" +
                "OOOO\n" +
                "OOOOOOOOOOO\n" +
                "OOOO", displayString);
    }

    @Test
    void testDisplayStringAt123001() {
        String displayString = mengenlehreuhr.getDisplayString(12, 30, 1);
        assertEquals("O\n" +
                "RROO\n" +
                "RROO\n" +
                "YYRYYROOOOO\n" +
                "OOOO", displayString);
    }

    @AfterEach
    void teardown() {
        mengenlehreuhr = null;
    }
}
