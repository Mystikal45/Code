package com.patterson.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.patterson.myapplication.R;

public class ScoreActivity extends AppCompatActivity {

    TextView scoreTV;
    Button emailBTN;
    Button ShowHighScore;
    TextView HighScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        scoreTV = (TextView) findViewById(R.id.scoreTV);
        emailBTN = (Button) findViewById(R.id.emailBTN);
        ShowHighScore = (Button) findViewById(R.id.ShowHighScore);
        HighScore = (TextView) findViewById(R.id.HighScore);




        Intent incomingIntent = getIntent();
        int score = incomingIntent.getIntExtra("score", 0);
        scoreTV.setText(""+score);

        emailBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] addresses = new String[] {"dandremurray500@gmail.com"};
                String subject = "You got a new score";
                String body = "You got a score of " + score + ".";
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                intent.putExtra(Intent.EXTRA_EMAIL, addresses);
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                intent.putExtra(intent.EXTRA_TEXT, body);

                    startActivity(intent);

            }
        });

        ShowHighScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }



}