package com.example.myapp.careercloud;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapp.R;

import java.util.ArrayList;

public class CareerCloud extends AppCompatActivity {
    ArrayList<Job> companies = new ArrayList<>();
    RecyclerView view;
    myRecyclerAdapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_cloud);


        companies.add(new Job("Axxel Software Positions", "Selangor"));
        companies.add(new Job("Sunflower Grocery Cashier", "KL"));
        companies.add(new Job("Axxenture Associate Program", "Perak"));
        companies.add(new Job("Monash Database Engineer", "Selangor"));

        view = findViewById(R.id.recyclerView);
        adapter = new myRecyclerAdapter();
        adapter.setData(companies);
        layoutManager = new LinearLayoutManager(this);
        view.setLayoutManager(layoutManager);
        view.setAdapter(adapter);


    }
}


