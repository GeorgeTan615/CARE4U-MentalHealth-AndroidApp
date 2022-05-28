package com.example.myapp.mainpages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.myapp.BrainExercise;
import com.example.myapp.ChatWithChad;
import com.example.myapp.DiagnosticTool;
import com.example.myapp.disoperience.Disoperience;
import com.example.myapp.OnlineSupport;
import com.example.myapp.R;
import com.example.myapp.tabung.Tabung;
import com.example.myapp.volunteer.VolunteeringOpportunities;
import com.example.myapp.careercloud.CareerCloud;

public class MainPage extends AppCompatActivity {
    ImageButton brainExerciseBtn, donationBtn, careerBtn, diagnosticBtn, supportBtn, chatBtn, disoperienceBtn;
    Button volBtn;
    ImageView userProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        brainExerciseBtn = findViewById(R.id.main_brainExercise);
        brainExerciseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), BrainExercise.class);
                startActivity(i);
            }
        });

        volBtn = findViewById(R.id.btnVolOpp);
        volBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), VolunteeringOpportunities.class);
                startActivity(i);
            }
        });

        donationBtn = findViewById(R.id.main_donationTabung);
        donationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Tabung.class);
                startActivity(i);
            }
        });

        careerBtn = findViewById(R.id.main_careerCloud);
        careerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), CareerCloud.class);
                startActivity(i);
            }
        });

        diagnosticBtn = findViewById(R.id.main_diagnosticTool);
        diagnosticBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), DiagnosticTool.class);
                startActivity(i);
            }
        });

        supportBtn = findViewById(R.id.main_onlineSupport);
        supportBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), OnlineSupport.class);
                startActivity(i);
            }
        });

        chatBtn = findViewById(R.id.chatWithChadBtn);
        chatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ChatWithChad.class);
                startActivity(i);
            }
        });

        disoperienceBtn = findViewById(R.id.main_disoperience);
        disoperienceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Disoperience.class);
                startActivity(i);
            }
        });

        userProfile = findViewById(R.id.userImage);
        userProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Profile.class);
                startActivity(i);
            }
        });
    }
}