package com.whiplash.chainalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by jeffreyjacob on 2/14/18.
 */

public class Alarm extends BroadcastReceiver {
    // Class to represent an alarm in the ChainAlarm app
    private double hour;
    private double min;
    private String ID;

    public Alarm (Double h, Double m) {
        hour = h;
        min = m;
        ID = h.toString() + ":" + m.toString();
    }

    public double getHour() {
        return hour;
    }

    public double getMin() {
        return min;
    }

    public void setHour(double newHour) {
        hour = newHour;
    }

    public void setMin(double newMin) {
        min = newMin;
    }

    public String getID() {
        return ID;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("In Reciever", this.getID());
    }
}
