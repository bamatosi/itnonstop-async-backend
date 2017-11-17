package net.matosiuk.itnonstop.async;

import org.springframework.stereotype.Component;

@Component
public class Configuration {

    // Max time REST service will hold before returning data
    private static final Integer sleepMaxTime = 4000;

    public long getRandomSleepTime() {
        return new Double(sleepMaxTime * Math.random()).longValue();
    }
}
