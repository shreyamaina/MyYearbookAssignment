package com.example.myyearbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityZach extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_zach);

        final TextView text = (TextView) findViewById(R.id.textView12);
        Button button = (Button) findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.setText("This text has changed");

                Intent z = new Intent(getApplicationContext(), MyPlanAfterGraduationZach.class);
                startActivity(z);

            }



        });


    }
}