package com.example.myyearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MyPlanAfterGraduation extends AppCompatActivity {

    Button btn2;
    WebView weblink;
    Button btn15;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_plan_after_graduation);


        btn2 = (Button) findViewById(R.id.nextbutton);
        btn15 = (Button) findViewById(R.id.btnlink);


        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View vi) {
                Intent j = new Intent (MyPlanAfterGraduation.this,MainActivityZach.class);
                startActivity(j);
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View linkedin) {
                gotoURL("https://www.linkedin.com/in/shreya-mainali");
            }
        });

        ;}

    private void gotoURL(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
    ;}


