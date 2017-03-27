package com.nithinkumar.scorer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class StartGameActivity extends AppCompatActivity {

    //String str;
    EditText team1Name;
    EditText team2Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Log.d("STR", str);
    }

    public void gameStarter(View view) {
        String str = getIntent().getStringExtra("test");
        team1Name = (EditText) findViewById(R.id.team1_name);
        team2Name = (EditText) findViewById(R.id.team2_name);
        if(str.equals("1"))
        {
            Intent intent = new Intent(getBaseContext(), BasketBallMainActivity.class);
            intent.putExtra("team1Name", team1Name.getText().toString());
            intent.putExtra("team2Name", team2Name.getText().toString());
            startActivity(intent);
        }
        else if(str.equals("2"))
        {
            Intent intent = new Intent(getBaseContext(), FootBallMainActivity.class);
            intent.putExtra("team1Name", team1Name.getText().toString());
            intent.putExtra("team2Name", team2Name.getText().toString());
            startActivity(intent);
        }
        else if(str.equals(("3")))
        {
            Intent intent = new Intent(getBaseContext(), CricketMainActivity.class);
            intent.putExtra("team1Name", team1Name.getText().toString());
            intent.putExtra("team2Name", team2Name.getText().toString());
            startActivity(intent);
        }
        else{

            Intent intent = new Intent(getBaseContext(), HockeyMainActivity.class);
            intent.putExtra("team1Name", team1Name.getText().toString());
            intent.putExtra("team2Name", team2Name.getText().toString());
            startActivity(intent);
        }
    }
}
