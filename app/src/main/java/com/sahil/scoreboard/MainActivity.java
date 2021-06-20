package com.sahil.scoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String MSG="com.sahil.scoreboard.FIRST";
    public static final String MSB="com.sahil.scoreboard.SECOND";
    public static final String MSP="com.sahil.scoreboard.ORDER";


    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        next=findViewById(R.id.btnNext);


    }
    public void placeOrder(View view){
        EditText teama = findViewById(R.id.edFirstteam);
        EditText teamb = findViewById(R.id.edSecondteam);
        EditText totalpoint = findViewById(R.id.edTotalpoint);

        if ((TextUtils.isEmpty(teama.getText().toString()))&(TextUtils.isEmpty(teamb.getText().toString()))&(TextUtils.isEmpty(totalpoint.getText().toString()))){
            Toast.makeText(MainActivity.this, "Please fill the Detail of Game", Toast.LENGTH_SHORT).show();

        }else{


        Intent intent = new Intent(this , ScoreboardActivity.class);

//        EditText teama = findViewById(R.id.edFirstteam);
        String messageA = teama.getText().toString();
        intent.putExtra(MSG ,messageA);
        startActivity(intent);
        finish();

//        EditText teamb = findViewById(R.id.edSecondteam);
        String messageB=teamb.getText().toString();
        intent.putExtra(MSB ,messageB);
        startActivity(intent);
            finish();

//        EditText totalpoint = findViewById(R.id.edTotalpoint);
        String messagepoint=totalpoint.getText().toString();
        intent.putExtra(MSP ,messagepoint);
        startActivity(intent);
            finish();

        }
//        nextButtonclick();
    }

//    private void nextButtonclick() {
//        EditText teama = findViewById(R.id.edFirstteam);
//        EditText teamb = findViewById(R.id.edSecondteam);
//        EditText totalpoint = findViewById(R.id.edTotalpoint);
//
//        next.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if ((TextUtils.isEmpty(teama.getText().toString()))&(TextUtils.isEmpty(teamb.getText().toString()))&(TextUtils.isEmpty(totalpoint.getText().toString()))){
//                    Toast.makeText(MainActivity.this, "Please fill the Detail of Game", Toast.LENGTH_SHORT).show();
//                }else{
//                    Intent intent=new Intent(MainActivity.this,ScoreboardActivity.class);
//                    startActivity(intent);
//                }
//            }
//        });
//    }

}