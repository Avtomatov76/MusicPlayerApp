package com.example.android.musicplayerapp;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class NowPlaying implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    // Current song basics
    private String songName;
    private String artistName;

    // Main constructor
    public NowPlaying(String songName, String artistName) {
        this.songName = songName;
        this.artistName = artistName;
    }

    // Getters
    public String getSongName() { return songName; }
    public String getArtistName() { return artistName; }

    //Write object values to parcel for storage

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(songName);
        dest.writeString(artistName);
    }

    public NowPlaying(Parcel parcel) {
        songName = parcel.readString();
        artistName = parcel.readString();
    }

    public static final Parcelable.Creator<NowPlaying> CREATOR = new Parcelable.Creator<NowPlaying>() {

        @Override
        public NowPlaying createFromParcel(Parcel parcel) {
            return new NowPlaying(parcel);
        }

        @Override
        public NowPlaying[] newArray(int size) {
            return new NowPlaying[0];
        }
    };
}