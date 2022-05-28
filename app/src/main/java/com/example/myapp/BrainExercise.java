package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapp.games.ChessGame;
import com.example.myapp.games.MemoryGame;
import com.example.myapp.games.SongPlayer;

public class BrainExercise extends AppCompatActivity {
    TextView chessGame, memoryGame, songPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain_exercise);
        chessGame = findViewById(R.id.tv_chess_game);
        chessGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ChessGame.class);
                startActivity(i);
            }
        });

        memoryGame = findViewById(R.id.tv_memory_game);
        memoryGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MemoryGame.class);
                startActivity(i);
            }
        });

        songPlayer = findViewById(R.id.tv_song_player);
        songPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SongPlayer.class);
                startActivity(i);
            }
        });
    }
}