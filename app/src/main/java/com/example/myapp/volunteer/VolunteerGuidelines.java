package com.example.myapp.volunteer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.myapp.R;

public class VolunteerGuidelines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer_guidelines);

        WebView webView = findViewById(R.id.volguide_webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.adventurealternative.com/volunteer-guidelines/");

    }
}