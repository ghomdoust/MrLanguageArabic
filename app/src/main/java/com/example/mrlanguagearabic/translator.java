package com.example.mrlanguagearabic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class translator extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.translator);

        mWebView = findViewById(R.id.mWebView);

        String siteUrl = "https://translate.google.com/?hl=en&tab=rT#view=home&op=translate&sl=fa&tl=ar";
        mWebView.loadUrl(siteUrl);

        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setSupportZoom(true);
        mWebView.getSettings().setBuiltInZoomControls(true);
        mWebView.getSettings().setDisplayZoomControls(true);




    }
}