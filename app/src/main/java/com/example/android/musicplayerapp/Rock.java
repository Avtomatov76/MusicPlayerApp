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

        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Radiohead","Paranoid Android"));
        songs.add(new Song("Metallica","Nothing Else Matters"));
        songs.add(new Song("Aerosmith","Dream On"));
        songs.add(new Song("Def Leppard","Love Bites"));
        songs.add(new Song("The Rolling Stones","Paint It Black"));
        songs.add(new Song("Led Zeppelin","Stairway to Heaven"));
        songs.add(new Song("Deep Purple","Child In Time"));
        songs.add(new Song("Free","All Right Now"));
        songs.add(new Song("Nirvana","Smells Like Teen Spirit"));
        songs.add(new Song("Eagles","Hotel California"));


        SongAdapter adapter = new SongAdapter ( this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
