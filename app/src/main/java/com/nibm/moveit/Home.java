package com.nibm.moveit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    private Button location;
    private Button schedule;
    private Button details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        location = (Button) findViewById(R.id.btn_location);
        schedule = (Button) findViewById(R.id.btn_schedule);
        details = (Button) findViewById(R.id.btn_details);

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLocation();
            }
        });

        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
            }
        });
    }

    public void openLocation()
    {
        Intent intent = new Intent(this, SearchLocation.class);
        startActivity(intent);
    }

    public void openSchedule()
    {
        Intent intent = new Intent(this, SearchSchedule.class);
        startActivity(intent);
    }

    public void openLogin()
    {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}
