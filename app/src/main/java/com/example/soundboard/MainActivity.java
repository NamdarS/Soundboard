package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bass, cowbell, bongo, crash, clap, riser, kick, hiHat, triangle, support;
    MediaPlayer bassSound, cowbellSound, bongoSound, crashSound, clapSound, riserSound, kickSound, hiHatSound, triangleSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findAllViews();
        setAllSounds();
        setEventListeners();

    }

    private void findAllViews() {
        bass = (Button) findViewById(R.id.bass);
        cowbell = (Button) findViewById(R.id.cowbell);
        bongo = (Button) findViewById(R.id.bongo);
        crash = (Button) findViewById(R.id.crash);
        triangle = (Button) findViewById(R.id.triangle);
        hiHat = (Button) findViewById(R.id.hihat);
        riser = (Button) findViewById(R.id.riser);
        kick = (Button) findViewById(R.id.kick);
        clap = (Button) findViewById(R.id.clap);
        support = (Button) findViewById(R.id.supportbutton);
    }

    private void setAllSounds() {
        bassSound = MediaPlayer.create(this, R.raw.bass);
        cowbellSound = MediaPlayer.create(this, R.raw.cowbell);
        riserSound = MediaPlayer.create(this, R.raw.riser);
        kickSound = MediaPlayer.create(this, R.raw.kick);
        crashSound = MediaPlayer.create(this, R.raw.crash);
        clapSound = MediaPlayer.create(this, R.raw.clap);
        bongoSound = MediaPlayer.create(this, R.raw.bongo);
        hiHatSound = MediaPlayer.create(this, R.raw.hihat);
        triangleSound = MediaPlayer.create(this, R.raw.triangle);
    }

    private void setEventListeners() {
        bass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bassSound.start();
            }
        });

        cowbell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cowbellSound.start();
            }
        });

        triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                triangleSound.start();
            }
        });

        crash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                crashSound.start();
            }
        });

        kick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kickSound.start();
            }
        });

        hiHat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hiHatSound.start();
            }
        });

        bongo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bongoSound.start();
            }
        });

        riser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                riserSound.start();
            }
        });

        clap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clapSound.start();
            }
        });

        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("BUTTON", "support button add link");
            }
        });
    }
}