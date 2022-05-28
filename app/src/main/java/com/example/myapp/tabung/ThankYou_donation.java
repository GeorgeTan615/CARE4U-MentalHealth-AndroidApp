package com.example.myapp.tabung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapp.R;
import com.example.myapp.mainpages.MainPage;

public class ThankYou_donation extends AppCompatActivity {
    TextView thankYou;
    Button backHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you_donation);
        String fullname = getIntent().getStringExtra("FULLNAME_KEY");

        thankYou = findViewById(R.id.thankyou_tv);
        thankYou.setText("THANK YOU \n" + fullname + "\n" + "for your kind donation");

        backHome = findViewById(R.id.backToHomeBtn);
        backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainPage.class);
                startActivity(i);
            }
        });
    }
}