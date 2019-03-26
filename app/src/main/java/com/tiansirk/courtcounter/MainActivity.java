package com.tiansirk.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
     * This is called when one of the buttons is clicked. It sets the @member scoreTeamA's value to the button's
     * corresponding value then pass it to display
     */
    public void scorePoint(View v){
        if(v.equals(R.id.button_3)) {
            scoreTeamA += 3;
        }
        if(v.equals(R.id.button_2)){
            scoreTeamA += 2;
        }
        if(v.equals(R.id.button_free)){
            scoreTeamA += 1;
        }
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given scoreTeamA for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}
