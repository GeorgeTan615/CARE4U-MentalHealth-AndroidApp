package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OnlineSupport extends AppCompatActivity {
    Button btnBefrienders;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_support);

        btnBefrienders = findViewById(R.id.befrienders_btn);
        btnBefrienders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Befrienders.class);
                startActivity(i);
            }
        });
    }
}