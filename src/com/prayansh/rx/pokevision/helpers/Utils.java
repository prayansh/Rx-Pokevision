package com.prayansh.rx.pokevision.helpers;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.MINUTES;
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by Prayansh on 2016-07-27.
 */
public class Utils {
    public static Map<TimeUnit, Integer> getTimeTillExpiration(Integer expiration) {
        Integer now = (int) (System.currentTimeMillis() / 1000);
        Integer timeInSeconds = expiration - now;
        Map<TimeUnit, Integer> result = new HashMap<>();
        result.put(MINUTES, timeInSeconds / 60);
        timeInSeconds %= 60;
        result.put(TimeUnit.SECONDS, timeInSeconds);
        return result;
    }

    public static String printTime(Map<TimeUnit, Integer> time) {
        String expiry = "";
        if (time.get(MINUTES) != null)
            expiry += time.get(MINUTES);
        expiry += ":";
        if (time.get(SECONDS) != null) {
            int seconds = time.get(SECONDS);
            if (seconds < 10)
                expiry += "0";
            expiry += seconds;
        }
        return expiry;
    }
}
