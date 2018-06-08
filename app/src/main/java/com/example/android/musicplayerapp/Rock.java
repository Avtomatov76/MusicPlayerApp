package com.example.android.musicplayerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Rock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Radiohead","Paranoid Android"));
        songs.add(new Song("Radiohead","Chickens"));

        SongAdapter adapter = new SongAdapter ( this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
