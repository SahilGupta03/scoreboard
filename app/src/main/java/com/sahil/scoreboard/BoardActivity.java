package com.sahil.scoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class BoardActivity extends AppCompatActivity {


    LottieAnimationView animationView, animationView1, animationView2,animationView3;
    Button restart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        animationView=findViewById(R.id.lottieAnimationView);
        animationView2=findViewById(R.id.lottieAnimationView2);
        animationView1=findViewById(R.id.lottieAnimationView1);
        animationView3=findViewById(R.id.lottieAnimationView3);

        restart=findViewById(R.id.reSet);

        animationView.setVisibility(View.VISIBLE);
        animationView1.setVisibility(View.VISIBLE);
        animationView2.setVisibility(View.VISIBLE);
        animationView3.setVisibility(View.VISIBLE);
        restart.setVisibility(View.VISIBLE);
        animationView.playAnimation();
        animationView1.playAnimation();
        animationView2.playAnimation();
        animationView3.playAnimation();

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BoardActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}