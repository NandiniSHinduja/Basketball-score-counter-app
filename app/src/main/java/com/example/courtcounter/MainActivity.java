package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreA=0;
    int scoreB=0;
    public void incrementBy3(View view){
        scoreA=scoreA+3;
        displayScoreForTeamA(scoreA);
    }
    public void incrementBy2(View view){
        scoreA=scoreA+2;
        displayScoreForTeamA(scoreA);
    }
    public void incrementBy1(View view){
        scoreA=scoreA+1;
        displayScoreForTeamA(scoreA);
    }
    public void incrementBy3B(View view){
        scoreB=scoreB+3;
        displayScoreForTeamB(scoreB);
    }
    public void incrementBy2B(View view){
        scoreB=scoreB+2;
        displayScoreForTeamB(scoreB);
    }
    public void incrementBy1B(View view){
        scoreB=scoreB+1;
        displayScoreForTeamB(scoreB);
    }
    public void displayScoreForTeamA(int scoreA){
        TextView scoreView = (TextView) findViewById(R.id.textView2);
        scoreView.setText(String.valueOf(scoreA));
    }
    public void displayScoreForTeamB(int scoreB){
        TextView scoreView = (TextView) findViewById(R.id.textView4);
        scoreView.setText(String.valueOf(scoreB));
    }
    public void reset(View view){
        scoreA=0;
        scoreB=0;
        displayScoreForTeamB(scoreB);
        displayScoreForTeamA(scoreA);
    }
}