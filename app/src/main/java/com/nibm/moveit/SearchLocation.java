package com.nibm.moveit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SearchLocation extends AppCompatActivity {

    private Button back;
    private EditText route;
    private Button search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_location);

        back = (Button) findViewById(R.id.btn_back);
        route = (EditText) findViewById(R.id.txt_route);
        search = (Button) findViewById(R.id.btn_search);

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


