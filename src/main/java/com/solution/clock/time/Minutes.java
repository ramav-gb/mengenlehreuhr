package com.solution.clock.time;

import com.solution.clock.AbstractTimeUnit;
import com.solution.clock.TimeUnit;
import com.solution.clock.TimeUnitPart;
import com.solution.view.Color;
import com.solution.view.Lamp;

import java.util.List;

import static java.util.Arrays.asList;

public class Minutes extends AbstractTimeUnit implements TimeUnit {
    public Minutes() {
        timeUnitParts = this.createParts();
    }

    private List<? extends TimeUnit> createParts() {
        return asList(
                createTopPart(),
                createBottomPart());
    }

    private TimeUnitPart createTopPart() {
        return new TimeUnitPart(
                asList(new Lamp(Color.YELLOW),
                        new Lamp(Color.YELLOW),
                        new Lamp(Color.RED),
                        new Lamp(Color.YELLOW),
                        new Lamp(Color.YELLOW),
                        new Lamp(Color.RED),
                        new Lamp(Color.YELLOW),
                        new Lamp(Color.YELLOW),
                        new Lamp(Color.RED),
                        new Lamp(Color.YELLOW),
                        new Lamp(Color.YELLOW)),
                (units) -> units / 5);
    }

    private TimeUnitPart createBottomPart() {
        return new TimeUnitPart(
                asList(new Lamp(Color.YELLOW),
                        new Lamp(Color.YELLOW),
                        new Lamp(Color.YELLOW),
                        new Lamp(Color.YELLOW)),
                (units) -> units % 5);
    }
}
