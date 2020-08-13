package com.grldt.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    EditText confpass;
    TextView login;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        username = findViewById(R.id.newuname);
        password = findViewById(R.id.newpassw);
        confpass = findViewById(R.id.confirm);
        signup = findViewById(R.id.signupBtn);
        login = findViewById(R.id.loginLbl);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if username = BNCC
//                dan password = VIVABNCC
//                toast sukses
//                else toast coba lagi
                if(password.getText().toString().equals(confpass.getText().toString())){
                    Toast.makeText(getApplicationContext(), "Sukses", Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(getApplicationContext(), "Coba lagi", Toast.LENGTH_SHORT).show();

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
