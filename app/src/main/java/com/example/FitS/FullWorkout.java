package com.example.FitS;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FullWorkout extends AppCompatActivity {

    private static int Case;

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28;

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),WorkoutLayout.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_workout);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b10 = (Button) findViewById(R.id.b10);
        b11 = (Button) findViewById(R.id.b11);
        b12 = (Button) findViewById(R.id.b12);
        b13 = (Button) findViewById(R.id.b17);
        b14 = (Button) findViewById(R.id.b18);
        b15 = (Button) findViewById(R.id.b19);
        b16 = (Button) findViewById(R.id.b20);
        b17 = (Button) findViewById(R.id.b22);
        b18 = (Button) findViewById(R.id.b30);
        b19 = (Button) findViewById(R.id.b31);
        b20 = (Button) findViewById(R.id.b33);
        b21 = (Button) findViewById(R.id.b34);
        b22 = (Button) findViewById(R.id.b35);
        b23 = (Button) findViewById(R.id.b36);
        b24 = (Button) findViewById(R.id.b37);
        b25 = (Button) findViewById(R.id.b40);
        b26 = (Button) findViewById(R.id.b41);
        b27 = (Button) findViewById(R.id.b42);
        b28 = (Button) findViewById(R.id.b44);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(1);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(2);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(3);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(4);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(5);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(6);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(7);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(8);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(9);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(10);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(11);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(12);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(13);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(14);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(15);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(16);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(17);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(18);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(19);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(20);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(21);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(22);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(23);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(24);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(25);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(26);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(27);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCase(28);

                Intent i = new Intent(FullWorkout.this, FullWorkoutInfo.class);
                startActivity(i);

            }
        });
    }

    public static int getCase() {
        return Case;
    }

    public static void setCase(int aCase) {
        Case = aCase;
    }
}

