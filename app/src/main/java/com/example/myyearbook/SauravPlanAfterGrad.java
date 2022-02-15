package com.example.myyearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SauravPlanAfterGrad extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saurav_plan_after_grad);
        Button butn ;
        butn = (Button) findViewById(R.id.button);
        butn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(SauravPlanAfterGrad.this, MainActivity.class);
                startActivity(next);
            }
        });
    }
}