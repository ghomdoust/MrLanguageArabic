package com.example.mrlanguagearabic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;


public class SplashActivity extends AppCompatActivity {

    private Handler handler;
    private MediaPlayer Sound;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Sound=MediaPlayer.create(this, R.raw.intro);
        Sound.start();




        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        },10000);



        ImageView img1 = (ImageView) findViewById(R.id.img1);
        ImageView img2 = (ImageView) findViewById(R.id.img2);

        ImageView img4 = (ImageView) findViewById(R.id.img4);
        ImageView img5 = (ImageView) findViewById(R.id.img5);

        Animation animation1= AnimationUtils.loadAnimation(this,R.anim.move_down);
        img1.setAnimation(animation1);

        Animation animation2= AnimationUtils.loadAnimation(this,R.anim.move_up);
        img2.setAnimation(animation2);



        Animation animation4= AnimationUtils.loadAnimation(this,R.anim.move_right);
        img4.setAnimation(animation4);

        Animation animation5= AnimationUtils.loadAnimation(this,R.anim.move_right);
        img5.setAnimation(animation5);




    }
}
