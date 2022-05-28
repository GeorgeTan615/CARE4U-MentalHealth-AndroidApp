package com.example.myapp.disoperience;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.myapp.R;

public class Dis_bipolarDisorder extends AppCompatActivity {
    VideoView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis_bipolar_disorder);

        view = findViewById(R.id.videoView1);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.bipolardisorder_vid;
        Uri uri = Uri.parse(videoPath);
        view.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        view.setMediaController(mediaController);
        mediaController.setAnchorView(view);
    }
}