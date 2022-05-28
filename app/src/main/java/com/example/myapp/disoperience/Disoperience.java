package com.example.myapp.disoperience;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapp.R;

public class Disoperience extends AppCompatActivity {
    TextView schizophrenia, bipDisorder, charlesBonnet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disoperience);

        schizophrenia = findViewById(R.id.tv_schizophrenia);
        schizophrenia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Dis_schizophrenia.class);
                startActivity(i);
            }
        });

        charlesBonnet = findViewById(R.id.tv_charlesBonnet);
        charlesBonnet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Dis_charlesBonnet.class);
                startActivity(i);
            }
        });

        bipDisorder = findViewById(R.id.tv_bipolardis);
        bipDisorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Dis_bipolarDisorder.class);
                startActivity(i);
            }
        });

    }
}