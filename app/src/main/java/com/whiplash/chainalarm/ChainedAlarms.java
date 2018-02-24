package com.whiplash.chainalarm;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jeffreyjacob on 2/23/18.
 */

public class ChainedAlarms extends Alarm {
    private HashMap<String, Alarm> alarms;

    public ChainedAlarms (double h, double m) {
        super(h, m);
        alarms = new HashMap<>();
    }

    public void chainAlarm (Alarm alarm2add) {
        alarms.put(alarm2add.getID(), alarm2add);
    }

    public void removeAlarmFromChain (Alarm alarm2remove) {
        alarms.remove(alarm2remove.getID());
    }

}
