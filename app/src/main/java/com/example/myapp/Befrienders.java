package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Befrienders extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_befrienders);

        WebView webView = findViewById(R.id.befrienders_webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.befrienders.org/");
    }
}