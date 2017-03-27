package com.nithinkumar.scorer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class HockeyMainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    TextView team1Name;
    TextView team2Name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hockey);
        team1Name = (TextView) findViewById(R.id.team1_default_string);
        String t1n = getIntent().getStringExtra("team1Name");
        team1Name.setText("Team " + t1n);
        team2Name = (TextView) findViewById(R.id.team2_default_string);
        String t2n = getIntent().getStringExtra("team2Name");
        team2Name.setText("Team "+ t2n);
    }

    public void displayForTeamA(int score) {
        TextView teamAScoreView = (TextView) findViewById(R.id.team1_score);
        teamAScoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView teamBScoreView = (TextView) findViewById(R.id.team2_score);
        teamBScoreView.setText(String.valueOf(score));
    }

    public void twoPointerForTeam1(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void freeThrowForTeam1(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void twoPointerForTeam2(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void freeThrowForTeam2(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetScoresForTeam(View view) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
    }
}
