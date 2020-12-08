package com.example.mrlanguagearabic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.AsyncTask;
import android.view.View;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class a_navigation_drawer extends AppCompatActivity {

    private TextView user_manual ;
    private TextView about_us ;
    private TextView contact_us ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_navigation_drawer);

        TextView user_manual = findViewById(R.id.user_manual);
        TextView about_us = findViewById(R.id.about_us);
        TextView contact_us = findViewById(R.id.contact_us);

        user_manual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent user_manual = new Intent (a_navigation_drawer.this,a_user_manual.class);
                startActivity(user_manual);
            }
        });

        about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about_us = new Intent (a_navigation_drawer.this,a_about_us.class);
                startActivity(about_us);
            }
        });

        contact_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact_us = new Intent (a_navigation_drawer.this,a_contact_us.class);
                startActivity(contact_us);
            }
        });

    }
}
