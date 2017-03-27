package com.nithinkumar.scorer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class CricketMainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int wicketsTeamA = 0;
    int wicketsTeamB = 0;
    TextView team1Name;
    TextView team2Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cricket);
        team1Name = (TextView) findViewById(R.id.team1_default_string);
        String t1n = getIntent().getStringExtra("team1Name");
        team1Name.setText("Team " + t1n);
        team2Name = (TextView) findViewById(R.id.team2_default_string);
        String t2n = getIntent().getStringExtra("team2Name");
        team2Name.setText("Team " + t2n);
    }

    public void displayForTeamA(int score) {
        TextView teamAScoreView = (TextView) findViewById(R.id.team1_score);
        teamAScoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView teamBScoreView = (TextView) findViewById(R.id.team2_score);
        teamBScoreView.setText(String.valueOf(score));
    }

    public void displayForTeamAWickets(int wickets) {
        TextView teamAWicketsView = (TextView) findViewById(R.id.team1_wickets);
        teamAWicketsView.setText(String.valueOf(wickets));
    }

    public void displayForTeamBWickets(int wickets) {
        TextView teamBWicketsView = (TextView) findViewById(R.id.team2_wickets);
        teamBWicketsView.setText(String.valueOf(wickets));
    }

    public void resetScoresForTeam(View view) {
        scoreTeamA = 0;
        wicketsTeamA = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamAWickets(wicketsTeamA);
        scoreTeamB = 0;
        wicketsTeamB = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamBWickets(wicketsTeamB);
    }

    public void oneRunForTeam1(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void twoRunForTeam1(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void threeRunsForTeam1(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void fourRunsForTeam1(View view) {
        scoreTeamA = scoreTeamA + 4;
        displayForTeamA(scoreTeamA);
    }

    public void sixRunsForTeam1(View view) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }

    public void wicketLossForTeam1(View view) {
        wicketsTeamA = wicketsTeamA + 1;
        displayForTeamAWickets(wicketsTeamA);
    }

    public void oneRunForTeam2(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void twoRunForTeam2(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void threeRunsForTeam2(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void fourRunsForTeam2(View view) {
        scoreTeamB = scoreTeamB + 4;
        displayForTeamB(scoreTeamB);
    }

    public void sixRunsForTeam2(View view) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }

    public void wicketLossForTeam2(View view) {
        wicketsTeamB = wicketsTeamB + 1;
        displayForTeamBWickets(wicketsTeamB);
    }
}
