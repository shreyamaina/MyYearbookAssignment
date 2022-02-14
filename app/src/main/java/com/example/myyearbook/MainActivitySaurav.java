package com.example.myyearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivitySaurav extends AppCompatActivity {


    Button btn4;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_saurav);
        btn4 = (Button) findViewById(R.id.button5);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent S = new Intent(MainActivitySaurav.this,SauravPlanAfterGrad.class);
                startActivity(S);
            }
        });
    }
}