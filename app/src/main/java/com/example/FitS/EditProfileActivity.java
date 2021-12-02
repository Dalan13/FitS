package com.example.FitS;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.util.HashMap;
import java.util.Map;

public class EditProfileActivity extends AppCompatActivity {
    public static final String TAG = "TAG";

    Button safeButton, editButton;

    private EditText height_et;
    private EditText weight_et;
    private EditText age_et;
    private EditText gender_et;
    private boolean genderIsCorrect = true;

    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String userId;
    String gender;
    String aged;
    String height;
    String weight;

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),GridLayout.class));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_edit_profile);
        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();

        height_et = (EditText) findViewById(R.id.height);
        weight_et = (EditText) findViewById(R.id.weight);
        age_et = (EditText) findViewById(R.id.age);
        gender_et = (EditText) findViewById(R.id.gender);

        safeButton = findViewById(R.id.safe_profile);
        editButton = findViewById(R.id.edit_profile);




        userId = fAuth.getCurrentUser().getUid();
        DocumentReference documentReference = fStore.collection("users").document(userId);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@javax.annotation.Nullable DocumentSnapshot documentSnapshot, @javax.annotation.Nullable FirebaseFirestoreException e) {
                if(documentSnapshot.exists()){
                    gender = documentSnapshot.getString("gender");
                    aged = documentSnapshot.getString("age");
                    height = documentSnapshot.getString("height");
                    weight = documentSnapshot.getString("weight");
                    height_et.setText(height);
                    weight_et.setText(weight);
                    age_et.setText(aged);
                    gender_et.setText(gender);
                }else {
                    Log.d("tag", "onEvent: Document do not exists");
                }
            }
        });

        safeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                height_et.setFocusable(false);
                weight_et.setFocusable(false);
                age_et.setFocusable(false);
                gender_et.setFocusable(false);
                height_et.setClickable(false);
                weight_et.setClickable(false);
                age_et.setClickable(false);
                gender_et.setClickable(false);
                height_et.setFocusableInTouchMode(false);
                weight_et.setFocusableInTouchMode(false);
                age_et.setFocusableInTouchMode(false);
                gender_et.setFocusableInTouchMode(false);
                safeButton.setVisibility(View.INVISIBLE);
                editButton.setVisibility(View.VISIBLE);

                if(!((gender_et.getText().toString().equals("M")) || (gender_et.getText().toString().equals("F")))){
                    gender_et.setError("Gender must be F or M. (Uppercase)");
                    genderIsCorrect = false;
                    return;
                } else {
                    genderIsCorrect = true;
                }

                String userID = fAuth.getCurrentUser().getUid();
                DocumentReference documentReference = fStore.collection("users").document(userID);
                Map<String,Object> user = new HashMap<>();
                if(genderIsCorrect) {
                    user.put("gender",gender_et.getText().toString());
                }
                user.put("age",age_et.getText().toString());
                user.put("height",height_et.getText().toString());
                user.put("weight",weight_et.getText().toString());
                documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.d(TAG, "onSuccess: user Profile is created for "+ userID);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.d(TAG, "onFailure: " + e.toString());
                    }
                });
            }
        });

        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                height_et.setFocusable(true);
                weight_et.setFocusable(true);
                age_et.setFocusable(true);
                gender_et.setFocusable(true);
                height_et.setClickable(true);
                weight_et.setClickable(true);
                age_et.setClickable(true);
                gender_et.setClickable(true);
                height_et.setFocusableInTouchMode(true);
                weight_et.setFocusableInTouchMode(true);
                age_et.setFocusableInTouchMode(true);
                gender_et.setFocusableInTouchMode(true);
                safeButton.setVisibility(View.VISIBLE);
                editButton.setVisibility(View.INVISIBLE);
            }
        });

    }

}
