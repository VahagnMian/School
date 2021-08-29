package com.mianv.school.Activity;

import static com.mianv.school.Util.Util.CORRECT_QUESTION_TAG;
import static com.mianv.school.Util.Util.NOT_ANSWERED_QUESTION_TAG;
import static com.mianv.school.Util.Util.WRONG_QUESTION_TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mianv.school.R;
import com.mianv.school.Util.Constants;
import com.mianv.school.Util.QuestionBank;

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
                    startIntentAndPutTag(CORRECT_QUESTION_TAG);
                }else if (cardView ==  findViewById(R.id.wrongCardView)){
                    startIntentAndPutTag(WRONG_QUESTION_TAG);
                }else if (cardView == findViewById(R.id.notAnswredCardView)){
                    startIntentAndPutTag(NOT_ANSWERED_QUESTION_TAG);
                }



            }
        });
    }



    public void startIntentAndPutTag(int question_tag){
        Intent intent = new Intent(getApplicationContext(), QuizActivity.class);
        intent.putExtra("ArrayList", question_tag);
        startActivity(intent);
    }

}