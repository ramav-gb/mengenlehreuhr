package com.solution.clock;

import java.util.List;

import static java.util.stream.Collectors.joining;

public abstract class AbstractTimeUnit implements TimeUnit {
    private static final String TIME_UNITS_PART_DELIMITER = "\n";

    protected List<? extends TimeUnit> timeUnitParts;

    @Override
    public String display(int units) {

        return timeUnitParts.stream().
                map(timeUnitPart -> timeUnitPart.display(units)).
                collect(joining(TIME_UNITS_PART_DELIMITER));
    }
}
