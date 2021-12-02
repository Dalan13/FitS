package com.example.FitS;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GridLayout extends AppCompatActivity {
    Button button_cal_calculate, button_workout, button_profile;

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), SignIn.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        button_cal_calculate =(Button)findViewById(R.id.button_cal_calculate);
        button_workout =(Button)findViewById(R.id.button_workout);
        button_profile =(Button)findViewById(R.id.button_profile);

        button_cal_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent food = new Intent(GridLayout.this,FoodLayout.class);
                startActivity(food);
            }
        });

        button_workout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent work = new Intent(GridLayout.this,WorkoutLayout.class);
                startActivity(work);
            }
        });

        button_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  i = new Intent(GridLayout.this,EditProfileActivity.class);
                startActivity(i);
            }
        });
    }

}
