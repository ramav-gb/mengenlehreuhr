package com.solution.clock;

import com.solution.view.Lamp;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

public class TimeUnitPart implements TimeUnit {
    private static final String LAMPS_DELIMITER = "";

    private final List<Lamp> lamps;
    private final LampsOnFunction lampsOnFunction;

    public TimeUnitPart(List<Lamp> lamps, LampsOnFunction lampsOnFunction) {
        this.lamps = lamps;
        this.lampsOnFunction = lampsOnFunction;
    }

    public String display(int units) {
        ArrayList<Lamp> lampsClone = clonedLamps();

        range(0, lampsOnFunction.calculateLampsOnFor(units)).
                forEach((index) -> lampsClone.get(index).switchOn());

        return lampsClone.stream().
                map(Lamp::toString).
                collect(joining(LAMPS_DELIMITER));
    }

    /**
     * Make sure we don't work with internal lamps, copy lamps, so both concurrent threads
     * and consequent calls by single thread works with a local copy
     */
    private ArrayList<Lamp> clonedLamps() {
        ArrayList<Lamp> lampsCopy = new ArrayList<>(lamps.size());
        lamps.forEach((lamp) -> lampsCopy.add(lamp.copy()));
        return lampsCopy;
    }
}