package com.example.who_is_the_millionaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.skydoves.progressview.ProgressView;

import mehdi.sakout.fancybuttons.FancyButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView btnStart , btnHelp,btnHightScore, btnExit;
    private SoundPool soundPool;
    private AudioManager audioManager;
    private static final int MAX_STREAMS = 5;
    private static final int streamType = AudioManager.STREAM_MUSIC;
    private int soundStartGame;
    private float volume;
    private boolean loaded;
    MediaPlayer mediaPlayer ;
    SqliteScore sqliteScore ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        mediaPlayer = MediaPlayer.create(this,R.raw.startgame);
        mediaPlayer.start();

//        audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
//        float currentVolumeIndex = (float) audioManager.getStreamVolume(streamType);
//        float maxVolumeIndex = (float) audioManager.getStreamMaxVolume(streamType);
//        this.volume = currentVolumeIndex / maxVolumeIndex;
//        this.setVolumeControlStream(streamType);
//
//        if (Build.VERSION.SDK_INT >= 21) {
//            AudioAttributes audioAttrib = new AudioAttributes.Builder()
//                    .setUsage(AudioAttributes.USAGE_GAME)
//                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
//                    .build();
//
//            SoundPool.Builder builder = new SoundPool.Builder();
//            builder.setAudioAttributes(audioAttrib).setMaxStreams(MAX_STREAMS);
//
//            this.soundPool = builder.build();
//        }
//        // for Android SDK < 21
//        else {
//            // SoundPool(int maxStreams, int streamType, int srcQuality)
//            this.soundPool = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
//        }
//        this.soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
//            @Override
//            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
//                loaded = true;
//            }
//
//        });
//        this.soundStartGame = this.soundPool.load(this, R.raw.startgame, 1);
//        if (loaded==false) {
//            float leftVolumn = volume;
//            float rightVolumn = volume;
//            // Play sound of gunfire. Returns the ID of the new stream.
//            this.soundPool.play(this.soundStartGame, leftVolumn, rightVolumn, 1, 0, 1f);
//
//        }
//


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_start:
                mediaPlayer.stop();

                Intent intentStart = new Intent(MainActivity.this, answer_the_question.class);

                startActivity(intentStart);
                break;
            case R.id.btn_help:
                break;
            case R.id.btn_hight_score:
                Intent intent = new Intent(MainActivity.this , SaveScore.class);
                startActivity(intent);
                break;
            case R.id.btn_exit:
                Intent homeIntent = new Intent(Intent.ACTION_MAIN);
                homeIntent.addCategory( Intent.CATEGORY_HOME );
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
                break;

        }
    }




        public void init () {
            btnStart = findViewById(R.id.btn_start);
            btnHelp = findViewById(R.id.btn_help);
            btnHightScore = findViewById(R.id.btn_hight_score);
            btnExit = findViewById(R.id.btn_exit);
        }

    }
