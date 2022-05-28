package com.example.myapp.tabung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapp.R;

public class Tabung extends AppCompatActivity {
    Button btnDonation, btnTabung, btnEcert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);

        btnDonation = findViewById(R.id.btnDonation);
        btnDonation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getApplicationContext(), Donation.class);
                startActivity(i);
            }
        });

        btnEcert = findViewById(R.id.btnEcert);
        btnEcert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Ecert.class);
                startActivity(i);
            }
        });

        btnTabung = findViewById(R.id.btnTabungDetails);
        btnTabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TabungDetails.class);
                startActivity(i);
            }
        });

    }
}