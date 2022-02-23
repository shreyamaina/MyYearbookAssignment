package com.example.myyearbook;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityZach extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_zach);

        final TextView text = (TextView) findViewById(R.id.textView12);
        Button button = (Button) findViewById(R.id.button4);

        Button sharebutton = (Button) findViewById(R.id.sharebutton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.setText("This text has changed");

                Intent z = new Intent(getApplicationContext(), MyPlanAfterGraduationZach.class);
                startActivity(z);

            }



        });

        sharebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri imageUri = Uri.parse("android.resource://My_Yearboo/drawable/ic_launcher_foreground");

                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
                shareIntent.setType("image/jpeg");
                startActivity(Intent.createChooser(shareIntent, null));

            }
        });


    }
}