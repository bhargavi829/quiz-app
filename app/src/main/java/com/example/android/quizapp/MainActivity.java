package com.example.android.quizapp;

import android.app.DatePickerDialog;
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

    Button answer1, answer2, answer3, answer4;

    TextView score, question;
    private questions mquestions = new questions();

    private String mAnswer;
    private int mscore = 0;
    private int mquestionsLenght = mquestions.mquestions.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        score.setText("score: " + mscore);

        updatequestion(r.nextInt(mquestionsLenght));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer1.getText() == mAnswer) {
                    mscore++;
                    score.setText("score: " + mscore);
                    updatequestion(r.nextInt(mquestionsLenght));
                } else {
                    gameOver();
                }

            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer2.getText() == mAnswer) {
                    mscore++;
                    score.setText("score: " + mscore);
                    updatequestion(r.nextInt(mquestionsLenght));
                } else {
                    gameOver();
                }

            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer3.getText() == mAnswer) {
                    mscore++;
                    score.setText("score: " + mscore);
                    updatequestion(r.nextInt(mquestionsLenght));
                } else {
                    gameOver();
                }

            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer4.getText() == mAnswer) {
                    mscore++;
                    score.setText("score: " + mscore);
                    updatequestion(r.nextInt(mquestionsLenght));
                } else {
                    gameOver();
                }

            }
        });
    }

    private void updatequestion(int num) {
        question.setText(mquestions.getquestion(num));
        answer1.setText(mquestions.getChoice1(num));
        answer2.setText(mquestions.getChoice2(num));
        answer3.setText(mquestions.getChoice3(num));
        answer4.setText(mquestions.getChoice4(num));

        mAnswer = mquestions.getCorrectAnswer(num);
    }

    private void gameOver() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Game over! Your score is " + mscore + "points.")
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface,int i) {
                                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                            }
                        })
        .setNegativeButton("EXIT",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface,int i) {
                        finish();
                    }
                });
        }
}
