package com.example.mrlanguagearabic;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class c_music_31 extends AppCompatActivity {

    PDFView pdfView;
    static MediaPlayer mPlayer;
    Button buttonPlay;
    Button buttonStop;
    String url = "https://www.aghayezaban.ir/downloads/2_multimedia/music/31.mp3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_music_31);

        pdfView =(PDFView)findViewById(R.id.pdfView);

        new c_music_31.RetrivePdfStream().execute("https://www.aghayezaban.ir/downloads/2_multimedia/music/31.pdf");


        this.buttonPlay = (Button)this.findViewById(R.id.play);
        this.buttonPlay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                c_music_31.mPlayer = new MediaPlayer();
                c_music_31.mPlayer.setAudioStreamType(3);

                try {
                    c_music_31.mPlayer.setDataSource(c_music_31.this.url);
                } catch (IllegalArgumentException var5) {
                    Toast.makeText(c_music_31.this.getApplicationContext(), "You might not set the URI correctly!", Toast.LENGTH_LONG).show();
                } catch (SecurityException var6) {
                    Toast.makeText(c_music_31.this.getApplicationContext(), "You might not set the URI correctly!", Toast.LENGTH_LONG).show();
                } catch (IllegalStateException var7) {
                    Toast.makeText(c_music_31.this.getApplicationContext(), "You might not set the URI correctly!", Toast.LENGTH_LONG).show();
                } catch (IOException var8) {
                    var8.printStackTrace();
                }

                try {
                    c_music_31.mPlayer.prepare();
                } catch (IllegalStateException var3) {
                    Toast.makeText(c_music_31.this.getApplicationContext(), "You might not set the URI correctly!", Toast.LENGTH_LONG).show();
                } catch (IOException var4) {
                    Toast.makeText(c_music_31.this.getApplicationContext(), "You might not set the URI correctly!", Toast.LENGTH_LONG).show();
                }

                c_music_31.mPlayer.start();
            }
        });


        this.buttonStop = (Button)this.findViewById(R.id.stop);
        this.buttonStop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (c_music_31.mPlayer != null && c_music_31.mPlayer.isPlaying()) {
                    c_music_31.mPlayer.stop();
                }

            }
        });

    }

    class RetrivePdfStream extends AsyncTask<String,Void, InputStream>
    {

        @Override
        protected InputStream doInBackground(String... strings) {
            InputStream inputStream = null;
            try{
                URL url = new URL(strings[0]);
                HttpURLConnection urlConnection=(HttpURLConnection)url.openConnection();
                if(urlConnection.getResponseCode()==200)
                {
                    inputStream=new BufferedInputStream(urlConnection.getInputStream());

                }
            }

            catch (IOException e)
            {
                return null;
            }

            return inputStream;

        }

        @Override
        protected void onPostExecute(InputStream inputStream) {
            pdfView.fromStream(inputStream).load();

        }
    }

    protected void onDestroy() {
        super.onDestroy();
        if (mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }

    }
}