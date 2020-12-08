package com.example.mrlanguagearabic;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.io.IOException;


public class sample_AudioPlayer_view extends AppCompatActivity {

    static MediaPlayer mPlayer;
    Button buttonPlay;
    Button buttonStop;
    String url = "https://www.aghayezaban.ir/downloads/1_dialouge/lesson1/001_Lesson_1_The_Iraqi_Alphabet.mp3";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_audio_player_view);

        this.buttonPlay = (Button)this.findViewById(R.id.play);
        this.buttonPlay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sample_AudioPlayer_view.mPlayer = new MediaPlayer();
                sample_AudioPlayer_view.mPlayer.setAudioStreamType(3);

                try {
                    sample_AudioPlayer_view.mPlayer.setDataSource(sample_AudioPlayer_view.this.url);
                } catch (IllegalArgumentException var5) {
                    Toast.makeText(sample_AudioPlayer_view.this.getApplicationContext(), "You might not set the URI correctly!", Toast.LENGTH_LONG).show();
                } catch (SecurityException var6) {
                    Toast.makeText(sample_AudioPlayer_view.this.getApplicationContext(), "You might not set the URI correctly!", Toast.LENGTH_LONG).show();
                } catch (IllegalStateException var7) {
                    Toast.makeText(sample_AudioPlayer_view.this.getApplicationContext(), "You might not set the URI correctly!", Toast.LENGTH_LONG).show();
                } catch (IOException var8) {
                    var8.printStackTrace();
                }

                try {
                    sample_AudioPlayer_view.mPlayer.prepare();
                } catch (IllegalStateException var3) {
                    Toast.makeText(sample_AudioPlayer_view.this.getApplicationContext(), "You might not set the URI correctly!", 1).show();
                } catch (IOException var4) {
                    Toast.makeText(sample_AudioPlayer_view.this.getApplicationContext(), "You might not set the URI correctly!", 1).show();
                }

                sample_AudioPlayer_view.mPlayer.start();
            }
        });
        this.buttonStop = (Button)this.findViewById(R.id.stop);
        this.buttonStop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (sample_AudioPlayer_view.mPlayer != null && sample_AudioPlayer_view.mPlayer.isPlaying()) {
                    sample_AudioPlayer_view.mPlayer.stop();
                }

            }
        });

    }

    protected void onDestroy() {
        super.onDestroy();
        if (mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }

    }
}
