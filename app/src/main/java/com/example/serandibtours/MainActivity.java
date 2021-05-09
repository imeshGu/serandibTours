package com.example.serandibtours;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycleView = findViewById(R.id.recycleView);

        ArrayList<TourPlan> tPlans = new ArrayList<>();

        tPlans.add(new TourPlan("yo yo","lsfld", "awogaf", "2"));
        tPlans.add(new TourPlan("yo yo","lsfld", "awogaf","3"));
        tPlans.add(new TourPlan("yo yo","lsfld", "awogaf","4"));
        tPlans.add(new TourPlan("yo yo","lsfld", "awogaf","5"));
        tPlans.add(new TourPlan("yo yo","lsfld", "awogaf","6"));
        tPlans.add(new TourPlan("yo yo","lsfld", "awogaf","1"));

        RecViewAdapter adapter = new RecViewAdapter(this);
        adapter.setTourPlans(tPlans);
        recycleView.setAdapter(adapter);
        recycleView.setLayoutManager(new LinearLayoutManager(this));

    }
}