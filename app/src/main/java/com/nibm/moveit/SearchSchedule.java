package com.nibm.moveit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SearchSchedule extends AppCompatActivity {

    private Button back;
    private EditText search;
    private Button schedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_schedule);

        back = (Button) findViewById(R.id.backbtn);
        search = (EditText) findViewById(R.id.searchtxt);
        schedule = (Button) findViewById(R.id.schedulebtn);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
            }
        });
    }

    public void openHome()
    {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}
