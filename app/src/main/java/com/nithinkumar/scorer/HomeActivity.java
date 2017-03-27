package com.nithinkumar.scorer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by nithinkumar on 3/22/17.
 */

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void basketBallScorer(View view) {
        Intent intent = new Intent(getBaseContext(), StartGameActivity.class);
        intent.putExtra("test", "1");
        startActivity(intent);
    }

    public void footBallScorer(View view) {
        Intent intent = new Intent(this, StartGameActivity.class);
        intent.putExtra("test", "2");
        startActivity(intent);
    }

    public void cricketScorer(View view) {
        Intent intent = new Intent(this, StartGameActivity.class);
        intent.putExtra("test", "3");
        startActivity(intent);
    }

    public void hockeyScorer(View view) {
        Intent intent = new Intent(this, StartGameActivity.class);
        intent.putExtra("test", "4");
        startActivity(intent);
    }
}