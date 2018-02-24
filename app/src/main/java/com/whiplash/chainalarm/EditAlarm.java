    package com.whiplash.chainalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

import java.util.Calendar;

    public class EditAlarm extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final AlarmManager am = (AlarmManager) getSystemService(ALARM_SERVICE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_alarm);

        Button createAlarm = (Button) findViewById(R.id.create);
        final TimePicker alarmTimePicker = (TimePicker) findViewById(R.id.timePicker);
        final Intent alarmIntent = new Intent(this, AlarmReciever.class);

        createAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                cal.set(Calendar.HOUR_OF_DAY, alarmTimePicker.getCurrentHour());
                cal.set(Calendar.MINUTE, alarmTimePicker.getCurrentMinute());
                //Alarm newAlarm = new Alarm(new Double(alarmTimePicker.getCurrentHour()),new Double(alarmTimePicker.getCurrentMinute()));
                 //newAlarm.getClass());
                PendingIntent pending_intent = PendingIntent.getBroadcast(EditAlarm.this, 0, alarmIntent, PendingIntent.FLAG_UPDATE_CURRENT);
                am.set(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), pending_intent);
            }
        });
    }

}
