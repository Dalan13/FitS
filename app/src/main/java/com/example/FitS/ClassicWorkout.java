package com.example.FitS;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class ClassicWorkout extends AppCompatActivity {

    private ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9;

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),WorkoutLayout.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classic_workout);

        img1=(ImageView)findViewById(R.id.img1);
        img2=(ImageView)findViewById(R.id.img2);
        img3=(ImageView)findViewById(R.id.img3);
        img4=(ImageView)findViewById(R.id.img4);
        img5=(ImageView)findViewById(R.id.img5);
        img6=(ImageView)findViewById(R.id.img6);
        img7=(ImageView)findViewById(R.id.img7);
        img8=(ImageView)findViewById(R.id.img8);
        img9=(ImageView)findViewById(R.id.img9);

        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/7jumping%20jacks.png?alt=media&token=8000cf2b-b835-4fe2-86d3-9522e676f781";
        String url2="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/11onelegpushup.jpg?alt=media&token=5429b698-a79a-415e-b679-fe726da977a2";
        String url3="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/35abdominalcrunches.jpg?alt=media&token=174241b4-4389-4d61-a55b-991daec2759f";
        String url4="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/3highstepping.jpg?alt=media&token=1c4711aa-117e-4c2e-b08e-017341875df4";
        String url5="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/17squat.png?alt=media&token=bbefe4b6-8b52-416b-b568-3a650da23169";
        String url6="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/34tricepdip.png?alt=media&token=3d54a143-b140-417f-ae03-864941ca9fcd";
        String url7="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/30plank.jpg?alt=media&token=9721d373-8a7d-4c79-a143-c18edf795af2";
        String url8="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/9pushuprotate.jpg?alt=media&token=c4a3f05c-e5a7-4910-9550-a85d4d0d9843";
        String url9="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/41sideplankleft.jpg?alt=media&token=23793975-77ec-42fb-893e-0f6dfc8e89e1";

        Glide.with(getApplicationContext()).load(url1).into(img1);
        Glide.with(getApplicationContext()).load(url2).into(img2);
        Glide.with(getApplicationContext()).load(url3).into(img3);
        Glide.with(getApplicationContext()).load(url4).into(img4);
        Glide.with(getApplicationContext()).load(url5).into(img5);
        Glide.with(getApplicationContext()).load(url6).into(img6);
        Glide.with(getApplicationContext()).load(url7).into(img7);
        Glide.with(getApplicationContext()).load(url8).into(img8);
        Glide.with(getApplicationContext()).load(url9).into(img9);
    };

    public  void open1 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/yDSMdd8hiFg"));
        startActivity(browserIntent);
    }

    public  void open2 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Eh00_rniF8E"));
        startActivity(browserIntent);
    }
    public  void open3 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/M6yAoJJQvGY"));
        startActivity(browserIntent);
    }

    public  void open4 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/ay-MtjfYtwo"));
        startActivity(browserIntent);
    }
    public  void open5 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/SU2UmCkiKC8"));
        startActivity(browserIntent);
    }
    public  void open6 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/kMFv3Alg-Gc"));
        startActivity(browserIntent);
    }
    public  void open7 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=6kALZikXxLc"));
        startActivity(browserIntent);
    }
    public  void open8 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/pSHjTRCQxIw"));
        startActivity(browserIntent);
    }
    public  void open9 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Z2n58m2i4jg"));
        startActivity(browserIntent);
    }
}

