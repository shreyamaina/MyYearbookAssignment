package com.example.myyearbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MyPlanAfterGraduationZach extends AppCompatActivity {
Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_plan_after_graduation_zach);

        btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent (MyPlanAfterGraduationZach.this,MainActivitySaurav.class);
                startActivity(k);
            }
        });
    }
}