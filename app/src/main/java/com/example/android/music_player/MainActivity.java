package com.example.android.music_player;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView hipHopView = (TextView) findViewById(R.id.hipHop);
        hipHopView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGenre = new Intent(MainActivity.this, GenreActivity.class);
                startActivity(intentGenre);
            }
        });
        TextView rockView = (TextView) findViewById(R.id.rock);
        rockView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGenre2 = new Intent(MainActivity.this, GenreActivity2.class);
                startActivity(intentGenre2);
            }
        });

        TextView classicalView = (TextView) findViewById(R.id.classical);
        classicalView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGenre3 = new Intent(MainActivity.this, GenreActivity3.class);
                startActivity(intentGenre3);
            }
        });

        TextView jazzView = (TextView) findViewById(R.id.jazz);
        jazzView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGenre4 = new Intent(MainActivity.this, GenreActivity4.class);
                startActivity(intentGenre4);
            }
        });

        TextView folkView = (TextView) findViewById(R.id.folk);
        folkView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGenre5 = new Intent(MainActivity.this, GenreActivity5.class);
                startActivity(intentGenre5);
            }
        });

        TextView danceView = (TextView) findViewById(R.id.dance);
        danceView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGenre6 = new Intent(MainActivity.this, GenreActivity6.class);
                startActivity(intentGenre6);
            }
        });
        Button songs = (Button) findViewById(R.id.songs);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSongs = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(intentSongs);
            }
        });
        TextView albums = (TextView) findViewById(R.id.albums);
        albums.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentAlbums = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(intentAlbums);
            }
        });
        TextView artists = (TextView) findViewById(R.id.artists);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentArtists = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(intentArtists);
            }
        });
    }
}
