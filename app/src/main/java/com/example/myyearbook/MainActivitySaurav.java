package com.example.myyearbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivitySaurav extends AppCompatActivity {


    Button btn4;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_saurav);
        createNotificationChannel();
        btn4 = (Button) findViewById(R.id.button5);
        btn4.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View view) {


                Intent S = new Intent(MainActivitySaurav.this,SauravPlanAfterGrad.class);
                startActivity(S);

            }
        });
    }

    public void onPause(){
        super.onPause();
//        Toast.makeText(MainActivitySaurav.this, "", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivitySaurav.this, Reminder.class);
        PendingIntent pen = PendingIntent.getBroadcast(MainActivitySaurav.this, 0 , intent , 0);
        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        long onPause = System.currentTimeMillis();
        long thirtySecondsInMills = 1000 * 30;
        alarmManager.set(AlarmManager.RTC_WAKEUP,onPause + thirtySecondsInMills,pen);

    }
    private void createNotificationChannel(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            CharSequence name = "JustReminder";
            String description = "sjabfajbf";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel("ComeBack!!", name, importance);
            channel.setDescription(description);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);


        }


    }
}