package com.example.FitS;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class WorkoutLayout extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),GridLayout.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_layout);

    }

    public void justSeven(View view){
        Intent cls = new Intent(WorkoutLayout.this,ClassicWorkout.class);
        startActivity(cls);
    }

    public void thirtyDays(View view){
        Intent fll = new Intent(WorkoutLayout.this,FullWorkout.class);
        startActivity(fll);
    }
}