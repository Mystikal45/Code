package com.patterson.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.patterson.myapplication.R;

public class MainActivity extends AppCompatActivity {
    TextView questionTV;
    Button firstBTN;
    Button secondBTN;
    Button thirdBTN;
    Button fourthBTN;
    Button nextBTN;

    int score;
    int currentIndex;
    Question q0, q1, q2, q3, q4, currentQ;
    Question[] questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Step 2
        questionTV = (TextView) findViewById(R.id.QuestionTV);
        firstBTN = (Button) findViewById(R.id.firstBTN);
        secondBTN = (Button) findViewById(R.id.secondBTN);
        thirdBTN = (Button) findViewById(R.id.thirdBTN);
        fourthBTN = (Button) findViewById(R.id.fourthBTN);
        nextBTN = (Button) findViewById(R.id.nextBTN);
        score = 0;
        currentIndex=0;
        q2= new Question("Pi is closest to   Hint: Think of the formula for pi.", 3, 7, 5, 8);
        q1 = new Question("Which is an even number  ", 0, 1, 9, 13);
        q0 = new Question("What is 8 x 4? ", 32, 18, 12, 24);
        q3 = new Question("It takes how many cuts to cut a cake into 8 equal pieces  Hint: It is an odd number", 5, 8, 12, 10);
        q4 = new Question("What number is twice the sum of its digits", 18, 28, 40, 69);
        questions = new Question[] {q0, q1, q2, q3, q4};
        currentQ = questions[currentIndex];

        thirdBTN.setText(currentQ.correctAnswer() + "");
        firstBTN.setText(currentQ.getWrongAnswer1() + "");
        secondBTN.setText(currentQ.getWrongAnswer2() + "");
        fourthBTN.setText(currentQ.getWrongAnswer3() + "");



        firstBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentQ.correctAnswer()==Integer.parseInt( firstBTN.getText().toString())) {
                    Context context = getApplicationContext();
                    CharSequence text = getString(R.string.Nice);
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    score++;
                }
                else
                {
                    Context context = getApplicationContext();
                    CharSequence text = getString(R.string.wrongMsg);
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }

            }
        } );
        secondBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentQ.correctAnswer()==Integer.parseInt( secondBTN.getText().toString())) {
                    Context context = getApplicationContext();
                    CharSequence text = getString(R.string.Nice);
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    score++;
                }
                else
                {
                    Context context = getApplicationContext();
                    CharSequence text = getString(R.string.wrongMsg);
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                }

            }
        } );
        thirdBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentQ.correctAnswer()==Integer.parseInt( thirdBTN.getText().toString())) {
                    Context context = getApplicationContext();
                    CharSequence text = getString(R.string.Nice);
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    score++;
                }
                else
                {
                    Context context = getApplicationContext();
                    CharSequence text = getString(R.string.wrongMsg);
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        } );
        fourthBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentQ.correctAnswer()==Integer.parseInt( fourthBTN.getText().toString())) {
                    Context context = getApplicationContext();
                    CharSequence text = getString(R.string.Nice);
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    score++;
                }
                else
                {
                    Context context = getApplicationContext();
                    CharSequence text = getString(R.string.wrongMsg);
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }


            }
        } );
        nextBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex = currentIndex + 1;
                if (currentIndex > 4) {
                    Intent finishedIntent = new Intent(MainActivity.this, ScoreActivity.class);
                    finishedIntent.putExtra("score", score);
                    startActivity(finishedIntent); }
                else {

                    currentQ = questions[currentIndex];
                    thirdBTN.setText(currentQ.correctAnswer() + "");
                    firstBTN.setText(currentQ.getWrongAnswer1() + "");
                    secondBTN.setText(currentQ.getWrongAnswer2() + "");
                    fourthBTN.setText(currentQ.getWrongAnswer3() + "");
                    questionTV.setText(currentQ.getQText());
                }
            }
        });
    }
}