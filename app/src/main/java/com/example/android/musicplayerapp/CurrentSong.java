package com.example.android.musicplayerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class CurrentSong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_song);

        TextView msongName = (TextView) findViewById(R.id.song_name);

        TextView martistName = (TextView) findViewById(R.id.artist_name);

        Intent intent = getIntent();
        NowPlaying nowPlaying = intent.getParcelableExtra("NowPlaying");

        msongName.setText(nowPlaying.getSongName());
        martistName.setText(nowPlaying.getArtistName());
    }
}