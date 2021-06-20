package com.sahil.scoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ScoreboardActivity extends AppCompatActivity {
    TextView teama;
    TextView teamb;
    TextView teamscorea;
    TextView teamscoreb;
    TextView pointview;

    String scorvaluea;
    Button btnaddteama,btnaddteamb,btnreset;
    int scorea=0,scoreb=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoreboard);

        Intent intent=getIntent();
        String messagepoint=intent.getStringExtra(MainActivity.MSP);

        String messageA=intent.getStringExtra(MainActivity.MSG);
        String messageB=intent.getStringExtra(MainActivity.MSB);

        teama=findViewById(R.id.teamA);
        teamb=findViewById(R.id.teamB);
        teamscorea=findViewById(R.id.teamAscore);
        teamscoreb=findViewById(R.id.teamBscore);
        btnaddteama=findViewById(R.id.btnAddteama);
        btnaddteamb=findViewById(R.id.btnAddteamb);
        btnreset=findViewById(R.id.btnReset);
        pointview=findViewById(R.id.pointView);


//  for show previous text
        teama.setText(messageA);
        teamb.setText(messageB);
        pointview.setText(messagepoint);
//   for increment /decrement
        String st= String.valueOf(scorea);
        teamscorea.setText(st);
        String sa=String.valueOf(scoreb);
        teamscoreb.setText(sa);

    }

    public void adda(View view) {

        String s = String.valueOf(scorea);
        teamscorea.setText(s);
        if (pointview.getText().toString().equals(s)){
            Toast.makeText(this, "Win Team A", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(ScoreboardActivity.this,BoardActivity.class);
            startActivity(intent);
            finish();
        }else {
            scorea++;
             }

    }

    public void addb(View view) {

        String sa= String.valueOf(scoreb);
        teamscoreb.setText(sa);
        if (pointview.getText().toString().equals(sa)){
            Toast.makeText(this, "Win Team B", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(ScoreboardActivity.this,BTeamActivity.class);
            startActivity(intent);


        }else {
            scoreb++;
        }

    }

    public void reset(View view) {
        teamscorea.setText("0");
        teamscoreb.setText("0");

        Intent intent=getIntent();
        String messagepoint=intent.getStringExtra(MainActivity.MSP);

        pointview.setText(messagepoint);
    }
}