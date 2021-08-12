package com.example.who_is_the_millionaire;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class SaveScore extends AppCompatActivity {
RecyclerView recyPlayerScore ;
PlayerScoreArapter playerScoreArapter ;
ArrayList<PlayerGame> arrayList = new ArrayList<>() ;
SqliteScore sqliteScore ;
Button btnBackToMain ;
PlayerGame playerGame ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_score);
        recyPlayerScore = findViewById(R.id.recy_Player_Score);
        btnBackToMain = findViewById(R.id.btn_BackToMain);
        sqliteScore= new SqliteScore(this);
        Intent intent = getIntent();
        playerGame = (PlayerGame) intent.getSerializableExtra("objPlayerGame");
        addPlayerGame();

        arrayList.addAll(sqliteScore.getPlayerGame());
        playerScoreArapter = new PlayerScoreArapter(this,arrayList);
        recyPlayerScore.setAdapter(playerScoreArapter);
        recyPlayerScore.setLayoutManager(new LinearLayoutManager(this));
        btnBackToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SaveScore.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void addPlayerGame() {
        if (playerGame==null){
            return;
        }
        else
            sqliteScore.addPlayerScore(playerGame);
    }
}