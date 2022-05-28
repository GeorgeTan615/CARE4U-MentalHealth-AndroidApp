package com.example.myapp.volunteer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapp.R;

public class VolunteeringOpportunities extends AppCompatActivity {
    Button volGuideBtn;
    Button appStatusBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteering_opportunities);

        volGuideBtn = findViewById(R.id.volGuide_btn);
        volGuideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), VolunteerGuidelines.class);
                startActivity(i);
            }
        });

        appStatusBtn = findViewById(R.id.btn_appStatus);
        appStatusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ApplicationStatus.class);
                startActivity(i);
            }
        });


    }
}