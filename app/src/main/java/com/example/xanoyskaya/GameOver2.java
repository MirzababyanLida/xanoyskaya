package com.example.xanoyskaya;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GameOver2 extends AppCompatActivity {

    TextView tvPoints;
    ImageView ivNewHighest;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_over2);
        ivNewHighest = findViewById(R.id.ivNewHeighest);
        tvPoints = findViewById(R.id.tvPoints);
        int points = getIntent().getExtras().getInt("points");
        if(points == 240){
            ivNewHighest.setVisibility(View.VISIBLE);
        }
        tvPoints.setText("" + points);
    }
    public void restart(View view){
        Intent intent = new Intent(GameOver2.this, MainActivity8.class);
        startActivity(intent);
        finish();
    }
    public void exit(View view){
        finish();

    }
}
