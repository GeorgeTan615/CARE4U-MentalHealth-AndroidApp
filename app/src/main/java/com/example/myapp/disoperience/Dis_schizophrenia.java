package com.example.myapp.disoperience;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.myapp.R;

public class Dis_schizophrenia extends AppCompatActivity {
    VideoView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis_schizophrenia);

        view = findViewById(R.id.videoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.schizophrenia_vid;
        Uri uri = Uri.parse(videoPath);
        view.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        view.setMediaController(mediaController);
        mediaController.setAnchorView(view);
    }
}