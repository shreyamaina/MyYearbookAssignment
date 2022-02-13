package com.example.myyearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyPlanAfterGraduation extends AppCompatActivity {

    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_plan_after_graduation);

        btn2 = (Button) findViewById(R.id.nextbutton);




        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View vi) {
                Intent j = new Intent (MyPlanAfterGraduation.this,MainActivityZach.class);
                startActivity(j);
            }
        })
    ;}
}