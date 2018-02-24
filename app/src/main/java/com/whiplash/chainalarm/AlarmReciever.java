package com.whiplash.chainalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.TimePicker;

/**
 * Created by jeffreyjacob on 2/24/18.
 */

public class AlarmReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Test", "ALARMREC");
    }
}
