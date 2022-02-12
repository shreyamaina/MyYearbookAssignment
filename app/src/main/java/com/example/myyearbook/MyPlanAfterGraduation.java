package com.example.myyearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyPlanAfterGraduation extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_plan_after_graduation);

        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            class NextActivity {
            }

            @Override
            public void onClick(View v) {
                Intent i = new Intent (getApplicationContext(),MainActivityZach.class);
                startActivity(i);
            }
        })
    ;}
}