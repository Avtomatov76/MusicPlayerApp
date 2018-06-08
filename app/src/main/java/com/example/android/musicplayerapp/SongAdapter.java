package com.example.android.musicplayerapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Context context, ArrayList<Song> words) {
        super(context, 0, words);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_song_item, parent, false);
        }

        final Song currentSong = getItem(position);
        TextView artistName = (TextView) listItemView.findViewById(R.id.artist_text_view);
        artistName.setText(currentSong.getmArtistName());
        TextView songName = (TextView) listItemView.findViewById(R.id.song_text_view);
        songName.setText(currentSong.getmSongName());


        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(getContext(), CurrentSong.class);
                nowPlayingIntent.putExtra("Song name", currentSong.getmSongName());
                nowPlayingIntent.putExtra("Artist name", currentSong.getmArtistName());
                getContext().startActivity(nowPlayingIntent);
            }
        });

        return listItemView;
    }
}