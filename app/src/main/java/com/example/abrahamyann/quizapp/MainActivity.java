package com.example.abrahamyann.quizapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button Answer1;
    private Button Answer2;
    private Button Answer3;
    private Button Answer4;
    private TextView Score;
    private TextView Question;

    private Questions mQuestions = new Questions();

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionsLength = mQuestions.mQuestions.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();


        Answer1 = (Button) findViewById(R.id.answer1);
        Answer2 = (Button) findViewById(R.id.answer2);
        Answer3 = (Button) findViewById(R.id.answer3);
        Answer4 = (Button) findViewById(R.id.answer4);

        Score = (TextView) findViewById(R.id.textView4);
        Question = (TextView) findViewById(R.id.textView5);


        Score.setText("Score: " + mScore);
        updateQuestions(r.nextInt(mQuestionsLength));

        Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Answer1.getText() == mAnswer) {
                    mScore++;
                    Score.setText("Score: " + mScore);
                    updateQuestions(r.nextInt(mQuestionsLength));
                } else {
                    gameOver();
                }
            }
        });
        Answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Answer2.getText() == mAnswer) {
                    mScore++;
                    Score.setText("Score: " + mScore);
                    updateQuestions(r.nextInt(mQuestionsLength));
                } else {
                    gameOver();
                }
            }
        });
        Answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Answer3.getText() == mAnswer) {
                    mScore++;
                    Score.setText("Score: " + mScore);
                    updateQuestions(r.nextInt(mQuestionsLength));
                } else {
                    gameOver();
                }
            }
        });
        Answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Answer4.getText() == mAnswer) {
                    mScore++;
                    Score.setText("Score: " + mScore);
                    updateQuestions(r.nextInt(mQuestionsLength));
                } else {
                    gameOver();
                }
            }
        });
    }

    private void updateQuestions(int num) {
        Question.setText(mQuestions.getQuestions(num));
        Answer1.setText(mQuestions.getChoice1(num));
        Answer2.setText(mQuestions.getChoice2(num));
        Answer3.setText(mQuestions.getChoice3(num));
        Answer4.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getCorrectAnswer(num);
    }

    private void gameOver() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Game Over! Your score is " + mScore + " points")
                .setCancelable(false)
                .setPositiveButton("New Game",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                            }
                        })
                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
