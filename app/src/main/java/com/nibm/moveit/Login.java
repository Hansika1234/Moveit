package com.nibm.moveit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button login;
    private Button home;
    private TextView wrong;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.txt_uname);
        password = (EditText) findViewById(R.id.txt_pwd);
        login = (Button) findViewById(R.id.btn_login);
        home = (Button) findViewById(R.id.btn_home);
        wrong = (TextView) findViewById(R.id.txt_wrong);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(username.getText().toString(), password.getText().toString());
            }
        });
    }

    public void openHome()
    {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    private void validate(String userName, String userPassword)
    {
        if ((userName.equals("Admin")) && (userPassword.equals("1234")))
        {
            Intent intent = new Intent(Login.this, EditDetails.class);
            startActivity(intent);
        }
        else
        {
            counter--;
            wrong.setText("Wrong username or password");

            if (counter == 0)
            {
                login.setEnabled(false);
            }
        }
    }
}
