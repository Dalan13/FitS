package com.example.FitS;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import javax.annotation.Nullable;

    public class FoodLayout extends AppCompatActivity {

        @Override
        public void onBackPressed() {
            startActivity(new Intent(getApplicationContext(),GridLayout.class));
        }

        private EditText height;
        private EditText weight;
        private TextView fin;
        Button calc,next;
        FirebaseAuth fAuth;
        FirebaseFirestore fStore;
        String userId;
        String gender;
        String aged;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_food_layout);
            height = (EditText) findViewById(R.id.height1);
            weight = (EditText) findViewById(R.id.weight1);
            fin = (TextView) findViewById(R.id.res);
            calc = (Button) findViewById(R.id.calc1);
            next = (Button) findViewById(R.id.next);
            fAuth = FirebaseAuth.getInstance();
            fStore = FirebaseFirestore.getInstance();

            FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
            if (user != null) {
                String name = user.getDisplayName();
                String email = user.getEmail();
            }
                userId = fAuth.getCurrentUser().getUid();
            DocumentReference documentReference = fStore.collection("users").document(userId);
            documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
                @Override
                public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {
                    if(documentSnapshot.exists()){
                        gender = documentSnapshot.getString("gender");
                        aged = documentSnapshot.getString("age");
                        height.setText(documentSnapshot.getString("height"));
                        weight.setText(documentSnapshot.getString("weight"));
                    }else {
                        Log.d("tag", "onEvent: Document do not exists");
                    }
                }
            });
            calc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String heightStr = height.getText().toString();
                    String weightStr = weight.getText().toString();
                    float calorie;
                    if (heightStr != null && !"".equals(heightStr)
                            && weightStr != null  &&  !"".equals(weightStr))
                    {
                        float heightValue = Float.parseFloat(heightStr);
                        float weightValue = Float.parseFloat(weightStr);
                        float age = Float.parseFloat(aged);
                        if (gender.contains("M"))
                        {
                            calorie = (int) Math.round(1.2 * (66 + (13.7 * weightValue) + (5 * heightValue) - (6.8 * age)));
                            display(calorie);
                        }
                        if (gender.contains("F")) {
                            calorie = (int) Math.round(1.2 * (655 + (9.6 * weightValue) + (1.8 * heightValue) - (4.7 * age)));
                            display(calorie);
                        }
                    }
                }
            });
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent cal = new Intent(FoodLayout.this,FoodShowActivity.class);
                    startActivity(cal);
                }
            });
        }
        private void display(float calorie) {
            String calorieLabel = "";
            calorieLabel = getString(R.string.your_calorie_intake) + calorie + " " + getString(R.string.kcal);
            fin.setText(calorieLabel);
        }
    }



