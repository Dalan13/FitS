package com.example.FitS;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.FitS.Model.Food;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class FoodShowActivity extends AppCompatActivity {
    ArrayList<Food> foods = new ArrayList<>();
    ArrayList<Food> myFoods = new ArrayList<>();

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    TextView sum_calories_tv;
    ScrollView allFoodScrollView;
    ScrollView myFoodScrollView;
    Button show_all_food_button;
    Button show_my_food_button;
    ImageButton discharge_button;
    EditText find_food_item_et;

    public FoodShowActivity() {
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),FoodLayout.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_food);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        allFoodScrollView = findViewById(R.id.scrollView2);
        myFoodScrollView = findViewById(R.id.scrollView3);
        show_all_food_button = findViewById(R.id.show_all_food_button);
        show_my_food_button = findViewById(R.id.show_my_food_button);
        discharge_button = findViewById(R.id.discharge_button);
        find_food_item_et = findViewById(R.id.find_food_item_et);

        getFood();

        show_my_food_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearFood(false);
                show_all_food_button.setVisibility(View.VISIBLE);
                show_my_food_button.setVisibility(View.INVISIBLE);
                showFood(false);
                allFoodScrollView.setVisibility(View.INVISIBLE);
                myFoodScrollView.setVisibility(View.VISIBLE);
            }
        });

        show_all_food_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearFood(true);
                show_all_food_button.setVisibility(View.INVISIBLE);
                show_my_food_button.setVisibility(View.VISIBLE);
                showFood(true);
                allFoodScrollView.setVisibility(View.VISIBLE);
                myFoodScrollView.setVisibility(View.INVISIBLE);
            }
        });

        discharge_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                find_food_item_et.setText("");
            }
        });

        find_food_item_et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                findFood();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void addTableFoodRow(String food, String calories, String measure, boolean isAllTable) {
        TableLayout stk;
        if(isAllTable) {
            stk = findViewById(R.id.table_food);
        } else {
            stk = findViewById(R.id.table_my_food);
        }
        TableRow tbrow = new TableRow(this);
        tbrow.setBackgroundResource(R.drawable.lite_gray_back_rec);
        TextView t1v = new TextView(this);
        t1v.setText(food);
        t1v.setTextColor(Color.BLACK);
        t1v.setTextSize(24);
        t1v.setWidth(400);
        t1v.setGravity(Gravity.CENTER);
        tbrow.addView(t1v);
        TextView t2v = new TextView(this);
        t2v.setText(calories);
        t2v.setTextColor(Color.BLACK);
        t2v.setTextSize(24);
        t2v.setWidth(260);
        t2v.setGravity(Gravity.CENTER);
        tbrow.addView(t2v);
        TextView t3v = new TextView(this);
        t3v.setText(measure);
        t3v.setTextColor(Color.BLACK);
        t3v.setTextSize(24);
        t3v.setWidth(420);
        t3v.setGravity(Gravity.CENTER);
        tbrow.addView(t3v);
        stk.addView(tbrow);
        if(isAllTable) {
            tbrow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Food food = new Food();
                    food.setName(t1v.getText().toString());
                    food.setCal(t2v.getText().toString());
                    food.setMeasure(t3v.getText().toString());
                    myFoods.add(food);
                    setSum();
                }
            });
        } else {
            tbrow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clearFood(isAllTable);
                    boolean isDeleted = false;
                    for (int i = 0; i < myFoods.size(); i++) {
                        if(!isDeleted) {
                            if (myFoods.get(i).getName() == t1v.getText()) {
                                myFoods.remove(i);
                                isDeleted = true;
                            }
                        }
                    }
                    showFood(isAllTable);
                    setSum();
                }
            });
        }
    }

    public void clearFood (boolean isAllTable) {
        if (isAllTable) {
            TableLayout stk = findViewById(R.id.table_food);
            stk.removeViews(1, stk.getChildCount() - 1);
        } else {
            TableLayout stk = findViewById(R.id.table_my_food);
            stk.removeViews(1, stk.getChildCount() - 1);
        }
    }

    public void setSum() {
        sum_calories_tv = findViewById(R.id.sum_calories_tv);
        int sum = 0;
        for (int i = 0; i < myFoods.size(); i++) {
            sum = sum + Integer.parseInt(myFoods.get(i).getCal().toString());
        }
        sum_calories_tv.setText(String.valueOf(sum));
    }

    public void showFood(boolean isAllTable) {
        if(isAllTable) {
            for (int i = 0; i < foods.size(); i++) {
                addTableFoodRow(foods.get(i).getName(), foods.get(i).getCal(), foods.get(i).getMeasure(), isAllTable);
            }
        } else {
            for (int i = 0; i < myFoods.size(); i++) {
                addTableFoodRow(myFoods.get(i).getName(), myFoods.get(i).getCal(), myFoods.get(i).getMeasure(), isAllTable);
            }
        }
    }

    public void findFood() {
        clearFood(true);
        clearFood(false);
        for(int i = 0; i < myFoods.size(); i++) {
            if(myFoods.get(i).getName().toLowerCase().contains(find_food_item_et.getText().toString().toLowerCase())) {
                addTableFoodRow(myFoods.get(i).getName(), myFoods.get(i).getCal(), myFoods.get(i).getMeasure(), false);
            }
        }
        for(int i = 0; i < foods.size(); i++) {
            if(foods.get(i).getName().toLowerCase().contains(find_food_item_et.getText().toString().toLowerCase())) {
                addTableFoodRow(foods.get(i).getName(), foods.get(i).getCal(), foods.get(i).getMeasure(), true);
            }
        }
    }

    public void getFood() {
        db.collection("Food")
                .orderBy("Name")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @RequiresApi(api = Build.VERSION_CODES.N)
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {

                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Log.d("READING ALL", document.getId() + " => " + document.getData());
                                System.out.println(document.getId());
                                Food food = new Food();
                                food.setName(document.get("Name").toString());
                                food.setCal(document.get("Cal").toString());
                                food.setMeasure(document.get("Measure").toString());
                                foods.add(food);
                            }
                            showFood(true);
                        } else {
                            Log.d("READING ALL", "Error getting documents: ", task.getException());
                        }
                    }
                });
    }

}
