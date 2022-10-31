package com.example.player;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView pause, prev, forv;
    TextView maxLenght, progress;
    SeekBar seekbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }
    private void init(){
        pause = findViewById(R.id.pause);
        prev = findViewById(R.id.skipp);
        forv = findViewById(R.id.skipn);
        seekbar = findViewById(R.id.seekBar);
        maxLenght = findViewById(R.id.timesound);
        progress = findViewById(R.id.currentprogress);

        play.setOnClickListner.this;
        pause.setOnClickListner.this;
        prev.setOnClickListner.this;
        forv.setOnClickListner.this;

        player = MediaPlayer.create(this, R.raw.track1);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.pause:
                player.pause();

        }
    }
}