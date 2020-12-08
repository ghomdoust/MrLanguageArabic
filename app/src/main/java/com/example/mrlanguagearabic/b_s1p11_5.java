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

public class b_s1p11_5 extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_s1p11_5);

        pdfView =(PDFView)findViewById(R.id.pdfView);

        new b_s1p11_5.RetrivePdfStream().execute("https://www.aghayezaban.ir/downloads/1_dialouge/lesson11/lesson11_grammar.pdf");

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

}