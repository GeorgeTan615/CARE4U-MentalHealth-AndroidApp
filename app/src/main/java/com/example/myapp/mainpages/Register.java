package com.example.myapp.mainpages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapp.R;

public class Register extends AppCompatActivity {
    Button btnReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnReg = findViewById(R.id.btn_register);
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register(v);
            }
        });
    }

    public void register(View v){
        EditText email = findViewById(R.id.et_r_email);
        String emailText = email.getText().toString();

        EditText username = findViewById(R.id.et_r_username);
        String usernameText = username.getText().toString();

        EditText passwordCreate = findViewById(R.id.et_create_password);
        String passwordCreateText = passwordCreate.getText().toString();

        EditText passwordConfirm = findViewById(R.id.et_confirm_password);
        String passwordConfirmText = passwordConfirm.getText().toString();

        if(passwordCreateText.equals(passwordConfirmText)){
            SharedPreferences db = getSharedPreferences("loginDetails",0);
            String usernameCheck = db.getString(usernameText+"username"," ");
            if (usernameCheck.equals(" ")) {
                SharedPreferences.Editor myEditor = db.edit();
                myEditor.putString(usernameText + "username", usernameText);
                myEditor.putString(usernameText + "password", passwordConfirmText);
                myEditor.putString(usernameText + "email", emailText);
                myEditor.apply();
                Intent i = new Intent(getApplicationContext(), OnBoardingPage.class);
                startActivity(i);
            }
            else{
                Toast.makeText(this, "Username is already taken.", Toast.LENGTH_SHORT).show();

            }
        }else{
            Toast.makeText(this, "Password does not match.", Toast.LENGTH_SHORT).show();
        }
    }
}