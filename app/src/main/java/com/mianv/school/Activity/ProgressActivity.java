package com.mianv.school.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mianv.school.Model.Question;
import com.mianv.school.R;
import com.mianv.school.Util.Constants;
import com.mianv.school.Util.QuestionBank;

import java.util.ArrayList;

public class ProgressActivity extends AppCompatActivity {

    TextView correctAnswersProgress;
    TextView wrongAnswersProgress;
    TextView notAnsweredAnswerProgress;
    CardView correctCardView;
    CardView wrongCardView;
    CardView notAnsweredCardView;
    QuestionBank questionBank = new QuestionBank();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);




        Initialization();



        questionsRefresh();

        addListenerToCardView(correctCardView);
        addListenerToCardView(wrongCardView);
        addListenerToCardView(notAnsweredCardView);


        /*correctAnswersProgress.setText(questionBank.getCorrectQuestions().size()+ "");
        wrongAnswersProgress.setText(questionBank.getWrongQuestions().size()+ "");
        notAnsweredAnswerProgress.setText(questionBank.getNotAnsweredQuestions().size()+ "");
*/
        correctAnswersProgress.setText(Constants.getCorrectQuestions().size()+ "");
        wrongAnswersProgress.setText(Constants.getWrongQuestions().size()+ "");
        notAnsweredAnswerProgress.setText(Constants.getNotAnsweredQuestions().size()+ "");



        }








    public void Initialization(){
        correctAnswersProgress = findViewById(R.id.correctProgress);
        wrongAnswersProgress = findViewById(R.id.wrongProgress);
        notAnsweredAnswerProgress = findViewById(R.id.notAnswredProgress);
        correctCardView = findViewById(R.id.correctCardView);
        wrongCardView = findViewById(R.id.wrongCardView);
        notAnsweredCardView = findViewById(R.id.notAnswredCardView);
        questionBank = new QuestionBank();



    }

    public void questionsRefresh(){
        questionBank.bindAllQuestionsToArray();
        questionBank.bindCorrectQuestionsToArray();
        questionBank.bindWrongQuestionsToArray();
        questionBank.bindNotAnsweredQuestionsToArray();
    }

    public void addListenerToCardView(CardView cardView){
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardView == findViewById(R.id.correctCardView)){
                    startIntentAndPutArray(questionBank);
                }else if (cardView ==  findViewById(R.id.wrongCardView)){
                    startIntentAndPutArray(questionBank);
                }else if (cardView == findViewById(R.id.notAnswredCardView)){
                    startIntentAndPutArray(questionBank);
                }



            }
        });
    }



    public void startIntentAndPutArray(QuestionBank questionBank){
        Intent intent = new Intent(getApplicationContext(), QuizActivity.class);
        intent.putExtra("correctArrayList", questionBank.getCorrectQuestions());
        startActivity(intent);
    }

}