package com.example.myapp.tabung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapp.R;

public class Donation extends AppCompatActivity {
    Button confirmBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation);

        confirmBtn = findViewById(R.id.btn_confirm_payment);
        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullname, email, phone, amount, bankNo;
                EditText fullname_et = findViewById(R.id.et_fullname);
                EditText email_et = findViewById(R.id.et_email);
                EditText phone_et = findViewById(R.id.et_phone_no);
                EditText amount_et = findViewById(R.id.et_amount);
                EditText bankNo_et = findViewById(R.id.et_bank_no);

                fullname = fullname_et.getText().toString();
                email = email_et.getText().toString();
                phone = phone_et.getText().toString();
                amount = amount_et.getText().toString();
                bankNo = bankNo_et.getText().toString();

                if(fullname.equals("") || email.equals("") || phone.equals("") || amount.equals("")||bankNo.equals("")){
                    Toast.makeText(getApplicationContext(),"Please complete the missing fields",Toast.LENGTH_SHORT).show();
                } else{
                    Intent i = new Intent(getApplicationContext(), ThankYou_donation.class);
                    i.putExtra("FULLNAME_KEY", fullname);
                    startActivity(i);
                }

            }
        });
    }
}