package com.example.android.musicplayerapp;

public class Song {

    private String mArtistName;

    private String mSongName;

    public Song(String ArtistName, String SongName) {
        mArtistName = ArtistName;
        mSongName = SongName;
    }

    public String getmArtistName() { return mArtistName; }

    public String getmSongName() { return mSongName; }
}
