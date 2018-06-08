package com.example.android.musicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows Rock category
        TextView rock = (TextView) findViewById(R.id.rock);

        // Set a click listener on Rock view
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rockIntent = new Intent(MainActivity.this, Rock.class);
                startActivity(rockIntent);
            }
        });


    }
}
