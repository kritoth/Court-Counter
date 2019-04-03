package com.tiansirk.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
     * This is called when one of the buttons of Team A is clicked. It sets the @member scoreTeamB's value to the button's
     * corresponding value then pass it to display
     */
    public void scorePointTeamA(View v) {

        if (v.equals(R.id.button_3)) {
            scoreTeamA += 3;
        }
        if (v.equals(R.id.button_2)) {
            scoreTeamA += 2;
        }
        if (v.equals(R.id.button_free)) {
            scoreTeamA += 1;
        }
        displayForTeamA(scoreTeamA);
    }

    /*
     * This is called when one of the buttons of Team B is clicked. It sets the @member scoreTeamB's value to the button's
     * corresponding value then pass it to display
     */
    public void scorePointTeamB(View v) {

        if (v.equals(R.id.button_3_b)) {
            scoreTeamB += 3;
        }
        if (v.equals(R.id.button_2_b)) {
            scoreTeamB += 2;
        }
        if (v.equals(R.id.button_free_b)) {
            scoreTeamB += 1;
        }
        displayForTeamB(scoreTeamB);
    }

    /*
     * Resetting points for both teams
     */
    public void reset(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given scoreTeamA for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given scoreTeamB for Team B
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
