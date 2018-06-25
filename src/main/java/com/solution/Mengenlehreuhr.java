package com.solution;

import com.solution.clock.time.Hours;
import com.solution.clock.time.Minutes;
import com.solution.clock.time.Seconds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

public class Mengenlehreuhr {

    private static final Logger LOGGER = LoggerFactory.getLogger(Mengenlehreuhr.class);

    private static final String TIME_UNIT_DELIMITER = "\n";


    String getDisplayString(int hours, int minutes, int seconds) {

        return new Seconds().display(seconds) + TIME_UNIT_DELIMITER +
                new Hours().display(hours) + TIME_UNIT_DELIMITER +
                new Minutes().display(minutes);
    }

    String getDisplayStringOfCurrentTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return this.getDisplayString(localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond());
    }

    public static void main(String[] args) {
        Mengenlehreuhr berlinClock = new Mengenlehreuhr();
        LOGGER.info(" ------ Current local time displayed below (based on system time) --- ");
        System.out.println(berlinClock.getDisplayStringOfCurrentTime());
        LOGGER.info(" ------ display 12:10:03 --- ");
        System.out.println(berlinClock.getDisplayString(12, 10, 3));
    }
}
