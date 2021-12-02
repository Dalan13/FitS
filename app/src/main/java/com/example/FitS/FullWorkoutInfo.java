package com.example.FitS;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class FullWorkoutInfo extends AppCompatActivity {

    private TextView description;
    private TextView name;
    private int Case;
    private ImageView image;

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),FullWorkout.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Case = FullWorkout.getCase();
        setContentView(R.layout.activity_full_workout_info);

        description = (TextView) findViewById(R.id.description_tv);
        name = (TextView) findViewById(R.id.exercise_tv);

        image =(ImageView)findViewById(R.id.i10);
        String url="";

        switch (Case) {
            case 1: {
                name.setText(R.string.spiderman_push_ups);
                description.setText(R.string.spiderman_push_ups_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/1spider.jpg?alt=media&token=a7efa235-822d-4fcb-9cb3-aa435c1472ee";
                break;
            }
            case 2: {
                name.setText(R.string.bridge);
                description.setText(R.string.bridge_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/2bridge.jpg?alt=media&token=c4bfd35f-1385-4300-b837-f1ec2e34c240";
                break;
            }
            case 3: {
                name.setText(R.string.high_stepping);
                description.setText(R.string.high_stepping_info);
                image =(ImageView)findViewById(R.id.i10);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/3highstepping.jpg?alt=media&token=1c4711aa-117e-4c2e-b08e-017341875df4";
                break;
            }
            case 4: {
                name.setText(R.string.incline_push_ups);
                description.setText(R.string.incline_push_ups_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/4inclinepushup.jpg?alt=media&token=f4867d84-8845-4ba5-a204-a85d6d6a9b65";
                break;
            }
            case 5: {
                name.setText(R.string.left_lunge_knee_hops);
                description.setText(R.string.left_lunge_knee_hops_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/5leftlunge.jpg?alt=media&token=1f10de03-397c-4b6d-8c55-84371c36dbf7";
                break;
            }
            case 6: {
                name.setText(R.string.wall_sit);
                description.setText(R.string.wall_sit_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/6wallsit.jpg?alt=media&token=aa5a2a7d-3bb9-4535-87ac-6ff540fd682c";
                break;
            }
            case 7: {
                name.setText(R.string.jumping_jacks);
                description.setText(R.string.jumping_jacks_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/7jumping%20jacks.png?alt=media&token=8000cf2b-b835-4fe2-86d3-9522e676f781";
                break;
            }
            case 8: {
                name.setText(R.string.long_arm_crunches);
                description.setText(R.string.long_arm_crunches_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/8cruches.jpg?alt=media&token=17dd7fc4-0b22-4afb-a288-44596f6bff73";
                break;
            }
            case 9: {
                name.setText(R.string.push_up_and_rotation);
                description.setText(R.string.push_up_and_rotation_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/9pushuprotate.jpg?alt=media&token=c4a3f05c-e5a7-4910-9550-a85d4d0d9843";
                break;
            }
            case 10: {
                name.setText(R.string.burpees);
                description.setText(R.string.burpees_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/10burpee.jpg?alt=media&token=0244d47b-6dbc-4639-adc1-6135713f074c";
                break;
            }
            case 11: {
                name.setText(R.string.one_leg_push_ups);
                description.setText(R.string.one_leg_push_ups_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/11onelegpushup.jpg?alt=media&token=5429b698-a79a-415e-b679-fe726da977a2";
                break;
            }
            case 12: {
                name.setText(R.string.wide_arm_push_ups);
                description.setText(R.string.wide_arm_push_ups_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/12widearm.jpg?alt=media&token=4f4fe7d5-9b50-4177-a896-decc8ebe6b78";
                break;
            }
            case 13: {
                name.setText(R.string.squats);
                description.setText(R.string.squats_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/17squat.png?alt=media&token=bbefe4b6-8b52-416b-b568-3a650da23169";
                break;
            }
            case 14: {
                name.setText(R.string.russian_twist);
                description.setText(R.string.russian_twist_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/18russiantwist.jpg?alt=media&token=34faa0a9-3c51-47ab-8c30-60997225d6a0";
                break;
            }
            case 15: {
                name.setText(R.string.sit_ups);
                description.setText(R.string.sit_ups_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/20situp.png?alt=media&token=ce8394e6-4041-4ef2-a94b-41f31907be45";
                break;
            }
            case 16: {
                name.setText(R.string.push_ups);
                description.setText(R.string.push_ups_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/20situp.png?alt=media&token=ce8394e6-4041-4ef2-a94b-41f31907be45";
                break;
            }
            case 17: {
                name.setText(R.string.bicycle_crunches);
                description.setText(R.string.bicycle_crunches_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/22bicyclecrunches.jpg?alt=media&token=615cbaed-70c8-4ff1-8985-02dc959f202d";
                break;
            }
            case 18: {
                name.setText(R.string.plank);
                description.setText(R.string.plank_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/30plank.jpg?alt=media&token=9721d373-8a7d-4c79-a143-c18edf795af2";
                break;
            }
            case 19: {
                name.setText(R.string.reverse_crunches);
                description.setText(R.string.reverse_crunches_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/31reversecrunches.jpg?alt=media&token=2d09b5e4-254c-44ea-a37c-1db0473f329a";
                break;
            }
            case 20: {
                name.setText(R.string.knee_push_ups);
                description.setText(R.string.knee_push_ups_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/33kneepushup.jpg?alt=media&token=e93f127d-0985-4bd0-9016-7dd48dd43c99";
                break;
            }
            case 21: {
                name.setText(R.string.triceps_dips);
                description.setText(R.string.triceps_dips_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/34tricepdip.png?alt=media&token=3d54a143-b140-417f-ae03-864941ca9fcd";
                break;
            }
            case 22: {
                name.setText(R.string.abdominal_crunches);
                description.setText(R.string.abdominal_crunches_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/35abdominalcrunches.jpg?alt=media&token=174241b4-4389-4d61-a55b-991daec2759f";
                break;
            }
            case 23: {
                name.setText(R.string.decline_push_ups);
                description.setText(R.string.decline_push_ups_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/36Decline-Pushup.jpg?alt=media&token=c2c36126-5b87-4bf2-b639-28873fac43a6";
                break;
            }
            case 24: {
                name.setText(R.string.split_squat_left);
                description.setText(R.string.split_squat_left_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/37splitsquatleft.jpg?alt=media&token=f87c15f5-c550-4b1e-b256-8ece03ccfbed";
                break;
            }
            case 25: {
                name.setText(R.string.jumping_squats);
                description.setText(R.string.jumping_squats_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/40jumpsquat.jpg?alt=media&token=01352750-7a54-4e47-b8e1-4ef7cc96e17d";
                break;
            }
            case 26: {
                name.setText(R.string.side_plank_left);
                description.setText(R.string.side_plank_left_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/41sideplankleft.jpg?alt=media&token=23793975-77ec-42fb-893e-0f6dfc8e89e1";
                break;
            }
            case 27: {
                name.setText(R.string.mountain_climber);
                description.setText(R.string.mountain_climber_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/42mountainclimbers.jpg?alt=media&token=f8d5b1b5-c68a-4e96-8492-b7fd6a746c4e";
                break;
            }
            case 28: {
                name.setText(R.string.bird_dog);
                description.setText(R.string.bird_dog_info);
                url="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/44birddog.jpg?alt=media&token=74ea5721-7a87-49d1-a6a6-6e10f1f036fc";
                break;
            }
        }
        Glide.with(getApplicationContext()).load(url).into(image);
    };


    public void openVideo(View view){
        Intent browserIntent = new Intent();
        switch (Case) {
            case 1: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=fKBeHALPsSU"));
                break;
            }
            case 2: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=WowARnE-p0s"));
                break;
            }
            case 3: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=kMFv3Alg-Gc"));
                break;
            }
            case 4: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Me9bHFAxnCs"));
                break;
            }
            case 5: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=QF0BQS2W80k"));
                break;
            }
            case 6: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=XULOKw4E4P4"));
                break;
            }
            case 7: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=UpH7rm0cYbM"));
                break;
            }
            case 8: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Xyd_fa5zoEU"));
                break;
            }
            case 9: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=awxqXW6i55A"));
                break;
            }
            case 10: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=JZQA08SlJnM"));
                break;
            }
            case 11: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Vzlfas-sBVU"));
                break;
            }
            case 12: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=B78GwfC-87Y"));
                break;
            }
            case 13: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=aclHkVaku9U"));
                break;
            }
            case 14: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=NeAtimSCxsY"));
                break;
            }
            case 15: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=17ydV85ihp8"));
                break;
            }
            case 16: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=jDwoBqPH0jk"));
                break;
            }
            case 17: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=NECcLiefy0M"));
                break;
            }
            case 18: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Iwyvozckjak"));
                break;
            }
            case 19: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ASdvN_XEl_c"));
                break;
            }
            case 20: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=hyv14e2QDq0"));
                break;
            }
            case 21: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=EgIMk-PZwo0"));
                break;
            }
            case 22: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=0326dy_-CzM"));
                break;
            }
            case 23: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=_M2Etme-tfE"));

                break;
            }
            case 24: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=WBmXffkfcXQ"));
                break;
            }
            case 25: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=NmyiMb2XYAM"));
                break;
            }
            case 26: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=U4s4mEQ5VqU"));
                break;
            }
            case 27: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=H9_wC-Xv2P4"));
                break;
            }
            case 28: {
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=zL0YEtJulBs"));
                break;
            }
        }
        startActivity(browserIntent);
    }
}
