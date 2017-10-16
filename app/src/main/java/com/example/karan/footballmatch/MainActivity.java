package com.example.karan.footballmatch; /**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 * <p>
 * package com.example.android.justjava;
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;

    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goalA(View view) {
        scoreTeamA = scoreTeamA + 4;
        displayforA(scoreTeamA);
    }

    public void yellowA(View view) {
        scoreTeamA = scoreTeamA - 2;
        displayforA(scoreTeamA);
    }

    public void redA(View view) {
        scoreTeamA = scoreTeamA - 3;
        displayforA(scoreTeamA);
    }

    public void foulA(View view) {
        scoreTeamA = scoreTeamA - 1;
        displayforA(scoreTeamA);
    }

    public void goalB(View view) {
        scoreTeamB = scoreTeamB + 4;
        displayforB(scoreTeamB);
    }

    public void yellowB(View view) {
        scoreTeamB = scoreTeamB - 2;
        displayforB(scoreTeamB);
    }

    public void redB(View view) {
        scoreTeamB = scoreTeamB - 3;
        displayforB(scoreTeamB);
    }

    public void foulB(View view) {
        scoreTeamB = scoreTeamB - 1;
        displayforB(scoreTeamB);
    }

    void displayforA(int scoreA) {
        TextView text = (TextView) findViewById(R.id.team_a);
        text.setText(String.valueOf(scoreA));
    }

    void displayforB(int scoreB) {

        TextView text = (TextView) findViewById(R.id.team_b);
        text.setText(String.valueOf(scoreB));
    }

    public void reset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayforA(scoreTeamA);
        displayforB(scoreTeamB);
    }

}

