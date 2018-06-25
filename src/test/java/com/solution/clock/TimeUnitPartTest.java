package com.solution.clock;

import com.solution.view.Color;
import com.solution.view.Lamp;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeUnitPartTest {

    @Test
    void testTimeUnitPartHoursFirstRow() {
        TimeUnitPart timeUnitPart = new TimeUnitPart(
                asList(new Lamp(Color.RED),
                        new Lamp(Color.RED),
                        new Lamp(Color.RED),
                        new Lamp(Color.RED)),
                (units) -> units / 5);
        assertAll(
                () -> assertEquals("OOOO", timeUnitPart.display(2)),
                () -> assertEquals("ROOO", timeUnitPart.display(7)),
                () -> assertEquals("RROO", timeUnitPart.display(10)),
                () -> assertEquals("RRRO", timeUnitPart.display(15)),
                () -> assertEquals("RRRR", timeUnitPart.display(20))
        );
    }
}
