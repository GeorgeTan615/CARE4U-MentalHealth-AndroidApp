package com.example.myapp.mainpages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapp.R;

public class MainActivity extends AppCompatActivity {
    Button btnLog;
    Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLog = findViewById(R.id.btn_login);
        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login(v);
            }
        });

        btnSignUp = findViewById(R.id.btn_sign_up);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp(v);
            }
        });
    }

    public void login(View v){
        EditText usernameOrEmail = findViewById(R.id.et_usernameEmail);
        String usernameOrEmailText = usernameOrEmail.getText().toString();


        EditText password = findViewById(R.id.et_password);
        String passwordText = password.getText().toString();

        SharedPreferences db = getSharedPreferences("loginDetails",0);
        String usernameInfo = db.getString(usernameOrEmailText+"username"," ");
        String passwordInfo = db.getString(usernameOrEmailText + "password", " ");
        String emailInfo = db.getString(usernameOrEmailText+"email"," ");

        if((usernameOrEmailText.equals(usernameInfo) || usernameOrEmailText.equals(emailInfo)) && passwordText.equals(passwordInfo)){
            Intent i = new Intent(getApplicationContext(), MainPage.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "Login credentials are incorrect.", Toast.LENGTH_SHORT).show();
        }
    }

    public void signUp(View v){
        Intent i = new Intent(this, Register.class);
        startActivity(i);
    }
}