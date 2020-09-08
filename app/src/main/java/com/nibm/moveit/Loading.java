package com.nibm.moveit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.skyfishjy.library.RippleBackground;

public class Loading extends AppCompatActivity {

    RippleBackground bus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        bus = (RippleBackground) findViewById(R.id.loading);
        bus.startRippleAnimation();
        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 Intent intent = new Intent(Loading.this, Home.class);
                 startActivity(intent);
            }
        });

    }
}
