package com.example.dakeh.assignment1memorygame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by dakeh on 4/9/2016.
 */
public class CompleteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.completeactivity);

        final Intent intent = getIntent();
        String score = intent.getStringExtra("score");

        TextView showscore = (TextView) findViewById(R.id.score);
        showscore.setText("Your scrore: " + score);

        Button restart = (Button) findViewById(R.id.button);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(CompleteActivity.this, MainActivity.class);
                startActivity(intent2);

            }
        });
    }
}
