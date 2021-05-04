package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int pointsA = 0;
    public int pointsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void points3(View view) {
        pointsA += 3;
        displayForTeamA(pointsA);
    }

    public void points2(View view) {
        pointsA += 2;
        displayForTeamA(pointsA);
    }

    public void freeThrow(View view) {
        pointsA++;
        displayForTeamA(pointsA);
    }

    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void points3B(View view) {
        pointsB += 3;
        displayForTeamB(pointsB);
    }

    public void points2B(View view) {
        pointsB += 2;
        displayForTeamB(pointsB);
    }

    public void freeThrowB(View view) {
        pointsB++;
        displayForTeamB(pointsB);
    }

    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void reset(View view) {
        pointsA = 0;
        pointsB = 0;
        displayForTeamA(pointsA);
        displayForTeamB(pointsB);
    }
}