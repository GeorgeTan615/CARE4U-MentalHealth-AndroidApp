package com.example.myapp.games;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.myapp.R;

public class MemoryGame extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory_game);
        WebView webView = findViewById(R.id.memory_webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.happyclicks.net/memory-games/12-memo-weather.php");
    }
}