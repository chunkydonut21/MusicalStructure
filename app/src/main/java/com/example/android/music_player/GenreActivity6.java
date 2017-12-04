package com.example.android.music_player;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GenreActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre6);
        Button hipHopButton = (Button) findViewById(R.id.but1);
        hipHopButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent hhb = new Intent(GenreActivity6.this, MainActivity.class);
                startActivity(hhb);
            }

        });
    }
}
