package com.solution.clock.time;

import com.solution.clock.AbstractTimeUnit;
import com.solution.clock.TimeUnit;
import com.solution.clock.TimeUnitPart;
import com.solution.view.Color;
import com.solution.view.Lamp;

import java.util.Collections;

import static java.lang.Math.abs;

public class Seconds extends AbstractTimeUnit implements TimeUnit {
    public Seconds() {
        timeUnitParts = Collections.singletonList(this.createPart());
    }

    private TimeUnitPart createPart() {
        return new TimeUnitPart(
                Collections.singletonList(new Lamp(Color.YELLOW)),
                (units) -> abs((units % 2) - 1));
    }

}
