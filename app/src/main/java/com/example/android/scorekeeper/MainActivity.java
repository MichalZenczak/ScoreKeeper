package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamAGoalScore = 0;
    private int teamAFoulScore = 0;
    private int teamAPenaltyScore = 0;
    private int teamAYellowCardScore = 0;
    private int teamARedCardScore = 0;
    private int teamBGoalScore = 0;
    private int teamBFoulScore = 0;
    private int teamBPenaltyScore = 0;
    private int teamBYellowCardScore = 0;
    private int teamBRedCardScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the goal score for Team A.
     */
    public void displayGoalScoreForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_goal_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the foul score for Team A.
     */
    public void displayFoulScoreForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_foul_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the penalty score for Team A.
     */
    public void displayPenaltyScoreForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_penalty_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the yellow card score for Team A.
     */
    public void displayYellowCardScoreForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_yellow_card_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the red card score for Team A.
     */
    public void displayRedCardScoreForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_red_card_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the goal score for Team B.
     */
    public void displayGoalScoreForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_goal_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the foul score for Team B.
     */
    public void displayFoulScoreForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_foul_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the penalty score for Team B.
     */
    public void displayPenaltyScoreForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_penalty_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the yellow card score for Team B.
     */
    public void displayYellowCardScoreForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_yellow_card_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the red card score for Team B.
     */
    public void displayRedCardScoreForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_red_card_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds one to teamAGoalScore and displays the score
     */
    public void goalForTeamA(View view) {
        teamAGoalScore += 1;
        displayGoalScoreForTeamA(teamAGoalScore);
    }

    /**
     * Adds one to teamAFoulScore and displays the score
     */
    public void addFoulForTeamA(View view) {
        teamAFoulScore += 1;
        displayFoulScoreForTeamA(teamAFoulScore);
    }

    /**
     * Adds one to teamAPenaltyScore and displays the score
     */
    public void addPenaltyForTeamA(View view) {
        teamAPenaltyScore += 1;
        displayPenaltyScoreForTeamA(teamAPenaltyScore);
    }

    /**
     * Adds one to teamAYellowCardScore and displays the score
     */
    public void addYellowCardForTeamA(View view) {
        teamAYellowCardScore += 1;
        displayYellowCardScoreForTeamA(teamAYellowCardScore);
    }

    /**
     * Adds one to teamARedCardScore and displays the score
     */
    public void addRedCardForTeamA(View view) {
        teamARedCardScore += 1;
        displayRedCardScoreForTeamA(teamARedCardScore);
    }

    /**
     * Adds one to teamBGoalScore and displays the score
     */
    public void goalForTeamB(View view) {
        teamBGoalScore += 1;
        displayGoalScoreForTeamB(teamBGoalScore);
    }

    /**
     * Adds one to teamBFoulScore and displays the score
     */
    public void addFoulForTeamB(View view) {
        teamBFoulScore += 1;
        displayFoulScoreForTeamB(teamBFoulScore);
    }

    /**
     * Adds one to teamBPenaltyScore and displays the score
     */
    public void addPenaltyForTeamB(View view) {
        teamBPenaltyScore += 1;
        displayPenaltyScoreForTeamB(teamBPenaltyScore);
    }

    /**
     * Adds one to teamBYellowCardScore and displays the score
     */
    public void addYellowCardForTeamB(View view) {
        teamBYellowCardScore += 1;
        displayYellowCardScoreForTeamB(teamBYellowCardScore);
    }

    /**
     * Adds one to teamBRedCardScore and displays the score
     */
    public void addRedCardForTeamB(View view) {
        teamBRedCardScore += 1;
        displayRedCardScoreForTeamB(teamBRedCardScore);
    }

    public void resetAllScores(View view) {
        teamAGoalScore = 0;
        teamAFoulScore = 0;
        teamAPenaltyScore = 0;
        teamAYellowCardScore = 0;
        teamARedCardScore = 0;
        teamBGoalScore = 0;
        teamBFoulScore = 0;
        teamBPenaltyScore = 0;
        teamBYellowCardScore = 0;
        teamBRedCardScore = 0;

        displayGoalScoreForTeamB(teamBGoalScore);
        displayFoulScoreForTeamB(teamBFoulScore);
        displayPenaltyScoreForTeamB(teamBPenaltyScore);
        displayYellowCardScoreForTeamB(teamBYellowCardScore);
        displayRedCardScoreForTeamB(teamBRedCardScore);
        displayGoalScoreForTeamA(teamAGoalScore);
        displayFoulScoreForTeamA(teamAFoulScore);
        displayPenaltyScoreForTeamA(teamAPenaltyScore);
        displayYellowCardScoreForTeamA(teamAYellowCardScore);
        displayRedCardScoreForTeamA(teamARedCardScore);
    }
}
