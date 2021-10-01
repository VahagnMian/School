package com.mianv.school.Activity;

import static com.mianv.school.Util.Util.*;
import static com.mianv.school.Util.Util.CORRECT_QUESTIONS_FROM_2;
import static com.mianv.school.Util.Util.EIGHTH_SECTION_CARD;
import static com.mianv.school.Util.Util.FIFTH_SECTION_CARD;
import static com.mianv.school.Util.Util.FIRST_SECTION_CARD;
import static com.mianv.school.Util.Util.FOURTH_SECTION_CARD;
import static com.mianv.school.Util.Util.NINTH_SECTION_CARD;
import static com.mianv.school.Util.Util.SECOND_SECTION_CARD;
import static com.mianv.school.Util.Util.SEVENTH_SECTION_CARD;
import static com.mianv.school.Util.Util.SIXTH_SECTION_CARD;
import static com.mianv.school.Util.Util.TENTH_SECTION_CARD;
import static com.mianv.school.Util.Util.THIRD_SECTION_CARD;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.room.Room;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mianv.school.Database.QuestionAppDatabase;
import com.mianv.school.Database.QuestionDao;
import com.mianv.school.Model.Question;
import com.mianv.school.R;
import com.mianv.school.Util.QuestionBank;

import java.util.ArrayList;
import java.util.List;

public class ProgressActivity extends AppCompatActivity {

    TextView correctAnswersProgress;
    TextView wrongAnswersProgress;
    TextView notAnsweredAnswerProgress;
    CardView correctCardView;
    CardView wrongCardView;
    CardView notAnsweredCardView;
    QuestionBank questionBank = new QuestionBank();
    public QuestionAppDatabase questionAppDatabase;
    private int tag;
    private Intent intent;
    public QuestionDao questionDao;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);



        DaoInitialization();
        Initialization();
        addListenersToCardView();

        passedTagInitialization();
        filterProgressBySection();




        }

        public void bindProgressToTextViews(int whichSection){
            int sectionCorrect = 0;
            int sectionWrong = 0;
            int sectionNotAnswered = 0;

        switch (whichSection){

            case FIRST_SECTION_CARD:
                sectionCorrect = questionDao.get1SectionCorrectQuestions().size();
                sectionWrong = questionDao.get1SectionWrongQuestions().size();
                sectionNotAnswered = questionDao.get1SectionNotAnsweredQuestions().size();
                break;
            case SECOND_SECTION_CARD:
               sectionCorrect = questionDao.get2SectionCorrectQuestions().size();
               sectionWrong = questionDao.get2SectionWrongQuestions().size();
               sectionNotAnswered = questionDao.get2SectionNotAnsweredQuestions().size();
               break;
            case THIRD_SECTION_CARD:
                sectionCorrect = questionDao.get3SectionCorrectQuestions().size();
                sectionWrong = questionDao.get3SectionWrongQuestions().size();
                sectionNotAnswered = questionDao.get3SectionNotAnsweredQuestions().size();
                break;
            case FOURTH_SECTION_CARD:
                sectionCorrect = questionDao.get4SectionCorrectQuestions().size();
                sectionWrong = questionDao.get4SectionWrongQuestions().size();
                sectionNotAnswered = questionDao.get4SectionNotAnsweredQuestions().size();
                break;
            case FIFTH_SECTION_CARD:
                sectionCorrect = questionDao.get5SectionCorrectQuestions().size();
                sectionWrong = questionDao.get5SectionWrongQuestions().size();
                sectionNotAnswered = questionDao.get5SectionNotAnsweredQuestions().size();
                break;
            case SIXTH_SECTION_CARD:
                sectionCorrect = questionDao.get6SectionCorrectQuestions().size();
                sectionWrong = questionDao.get6SectionWrongQuestions().size();
                sectionNotAnswered = questionDao.get6SectionNotAnsweredQuestions().size();
                break;
            case SEVENTH_SECTION_CARD:
                sectionCorrect = questionDao.get7SectionCorrectQuestions().size();
                sectionWrong = questionDao.get7SectionWrongQuestions().size();
                sectionNotAnswered = questionDao.get7SectionNotAnsweredQuestions().size();
                break;
            case EIGHTH_SECTION_CARD:
                sectionCorrect = questionDao.get8SectionCorrectQuestions().size();
                sectionWrong = questionDao.get8SectionWrongQuestions().size();
                sectionNotAnswered = questionDao.get8SectionNotAnsweredQuestions().size();
                break;
            case NINTH_SECTION_CARD:
                sectionCorrect = questionDao.get9SectionCorrectQuestions().size();
                sectionWrong = questionDao.get9SectionWrongQuestions().size();
                sectionNotAnswered = questionDao.get9SectionNotAnsweredQuestions().size();
                break;
            case TENTH_SECTION_CARD:
                sectionCorrect = questionDao.get10SectionCorrectQuestions().size();
                sectionWrong = questionDao.get10SectionWrongQuestions().size();
                sectionNotAnswered = questionDao.get10SectionNotAnsweredQuestions().size();
                break;


        }

            correctAnswersProgress.setText(sectionCorrect + "");
            wrongAnswersProgress.setText(sectionWrong + "");
            notAnsweredAnswerProgress.setText(sectionNotAnswered + "");

        }

        public void filterProgressBySection(){
            switch (tag){
                case FIRST_SECTION_CARD:
                    bindProgressToTextViews(FIRST_SECTION_CARD);
                    break;
                case SECOND_SECTION_CARD:
                    bindProgressToTextViews(SECOND_SECTION_CARD);
                    break;
                case THIRD_SECTION_CARD:
                    bindProgressToTextViews(THIRD_SECTION_CARD);
                    break;
                case FOURTH_SECTION_CARD:
                    bindProgressToTextViews(FOURTH_SECTION_CARD);
                    break;
                case FIFTH_SECTION_CARD:
                    bindProgressToTextViews(FIFTH_SECTION_CARD);
                    break;
                case SIXTH_SECTION_CARD:
                    bindProgressToTextViews(SIXTH_SECTION_CARD);
                    break;
                case SEVENTH_SECTION_CARD:
                    bindProgressToTextViews(SEVENTH_SECTION_CARD);
                    break;
                case EIGHTH_SECTION_CARD:
                    bindProgressToTextViews(EIGHTH_SECTION_CARD);
                    break;
                case NINTH_SECTION_CARD:
                    bindProgressToTextViews(NINTH_SECTION_CARD);
                    break;
                case TENTH_SECTION_CARD:
                    bindProgressToTextViews(TENTH_SECTION_CARD);
                    break;


            }
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

        @Override
        public void onBackPressed() {
        super.onBackPressed();
        this.onStop();
    }

        public void addListenerToCardView(CardView cardView){
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



           if (tag == FIRST_SECTION_CARD) {
               switch (cardView.getId()) {
                   case R.id.correctCardView:
                       if (questionDao.get1SectionCorrectQuestions().size() != 0)
                        startIntentAndPutTag(CORRECT_QUESTIONS_FROM_1);
                       break;
                   case R.id.wrongCardView:
                       if (questionDao.get1SectionWrongQuestions().size() != 0)
                       startIntentAndPutTag(WRONG_QUESTIONS_FROM_1);
                       break;
                   case R.id.notAnswredCardView:
                       if (questionDao.get1SectionNotAnsweredQuestions().size() != 0)
                       startIntentAndPutTag(NOT_ANSWERED_QUESTIONS_FROM_1);
                       break;

               }
           }else if (tag == SECOND_SECTION_CARD){
               switch (cardView.getId()) {
                   case R.id.correctCardView:
                       if (questionDao.get2SectionCorrectQuestions().size() != 0)
                       startIntentAndPutTag(CORRECT_QUESTIONS_FROM_2);
                       break;
                   case R.id.wrongCardView:
                       if (questionDao.get2SectionWrongQuestions().size() != 0)
                       startIntentAndPutTag(WRONG_QUESTIONS_FROM_2);
                       break;
                   case R.id.notAnswredCardView:
                       if (questionDao.get2SectionNotAnsweredQuestions().size() != 0)
                       startIntentAndPutTag(NOT_ANSWERED_QUESTIONS_FROM_2);
                       break;

               }   //+
           }else if (tag == THIRD_SECTION_CARD){
               switch (cardView.getId()) {
                   case R.id.correctCardView:
                       if (questionDao.get3SectionCorrectQuestions().size() != 0)
                       startIntentAndPutTag(CORRECT_QUESTIONS_FROM_3);
                       break;
                   case R.id.wrongCardView:
                       if (questionDao.get3SectionWrongQuestions().size() != 0)
                       startIntentAndPutTag(WRONG_QUESTIONS_FROM_3);
                       break;
                   case R.id.notAnswredCardView:
                       if (questionDao.get3SectionNotAnsweredQuestions().size() != 0)
                       startIntentAndPutTag(NOT_ANSWERED_QUESTIONS_FROM_3);
                       break;

               }  //+
           }else if (tag == FOURTH_SECTION_CARD){
               switch (cardView.getId()) {
                   case R.id.correctCardView:
                       if (questionDao.get4SectionCorrectQuestions().size() != 0)
                       startIntentAndPutTag(CORRECT_QUESTIONS_FROM_4);
                       break;
                   case R.id.wrongCardView:
                       if (questionDao.get4SectionWrongQuestions().size() != 0)
                       startIntentAndPutTag(WRONG_QUESTIONS_FROM_4);
                       break;
                   case R.id.notAnswredCardView:
                       if (questionDao.get4SectionNotAnsweredQuestions().size() != 0)
                       startIntentAndPutTag(NOT_ANSWERED_QUESTIONS_FROM_4);
                       break;

               }  //+
           }else if (tag == FIFTH_SECTION_CARD){
               switch (cardView.getId()) {
                   case R.id.correctCardView:
                       if (questionDao.get5SectionCorrectQuestions().size() != 0)
                       startIntentAndPutTag(CORRECT_QUESTIONS_FROM_5);
                       break;
                   case R.id.wrongCardView:
                       if (questionDao.get5SectionWrongQuestions().size() != 0)
                       startIntentAndPutTag(WRONG_QUESTIONS_FROM_5);
                       break;
                   case R.id.notAnswredCardView:
                       if (questionDao.get5SectionNotAnsweredQuestions().size() != 0)
                       startIntentAndPutTag(NOT_ANSWERED_QUESTIONS_FROM_5);
                       break;

               }  //+
           }else if (tag == SIXTH_SECTION_CARD){
               switch (cardView.getId()) {
                   case R.id.correctCardView:
                       if (questionDao.get6SectionCorrectQuestions().size() != 0)
                       startIntentAndPutTag(CORRECT_QUESTIONS_FROM_6);
                       break;
                   case R.id.wrongCardView:
                       if (questionDao.get6SectionWrongQuestions().size() != 0)
                       startIntentAndPutTag(WRONG_QUESTIONS_FROM_6);
                       break;
                   case R.id.notAnswredCardView:
                       if (questionDao.get6SectionNotAnsweredQuestions().size() != 0)
                       startIntentAndPutTag(NOT_ANSWERED_QUESTIONS_FROM_6);
                       break;

               } //+
           }else if (tag == SEVENTH_SECTION_CARD){
               switch (cardView.getId()) {
                   case R.id.correctCardView:
                       if (questionDao.get7SectionCorrectQuestions().size() != 0)
                       startIntentAndPutTag(CORRECT_QUESTIONS_FROM_7);
                       break;
                   case R.id.wrongCardView:
                       if (questionDao.get7SectionWrongQuestions().size() != 0)
                       startIntentAndPutTag(WRONG_QUESTIONS_FROM_7);
                       break;
                   case R.id.notAnswredCardView:
                       if (questionDao.get7SectionNotAnsweredQuestions().size() != 0)
                       startIntentAndPutTag(NOT_ANSWERED_QUESTIONS_FROM_7);
                       break;

               }  //+
           }else if (tag == EIGHTH_SECTION_CARD){
               switch (cardView.getId()) {
                   case R.id.correctCardView:
                       if (questionDao.get8SectionCorrectQuestions().size() != 0)
                       startIntentAndPutTag(CORRECT_QUESTIONS_FROM_8);
                       break;
                   case R.id.wrongCardView:
                       if (questionDao.get8SectionWrongQuestions().size() != 0)
                       startIntentAndPutTag(WRONG_QUESTIONS_FROM_8);
                       break;
                   case R.id.notAnswredCardView:
                       if (questionDao.get8SectionNotAnsweredQuestions().size() != 0)
                       startIntentAndPutTag(NOT_ANSWERED_QUESTIONS_FROM_8);
                       break;

               }  //+
           }else if (tag == NINTH_SECTION_CARD){
               switch (cardView.getId()) {

                   case R.id.correctCardView:
                       if (questionDao.get9SectionCorrectQuestions().size() != 0)
                       startIntentAndPutTag(CORRECT_QUESTIONS_FROM_9);
                       break;
                   case R.id.wrongCardView:
                       if (questionDao.get9SectionWrongQuestions().size() != 0)
                       startIntentAndPutTag(WRONG_QUESTIONS_FROM_9);
                       break;
                   case R.id.notAnswredCardView:
                       if (questionDao.get9SectionNotAnsweredQuestions().size() != 0)
                       startIntentAndPutTag(NOT_ANSWERED_QUESTIONS_FROM_9);
                       break;

               }
           }else if (tag == TENTH_SECTION_CARD){
               switch (cardView.getId()) {
                   case R.id.correctCardView:
                       if (questionDao.get10SectionCorrectQuestions().size() != 0)
                       startIntentAndPutTag(CORRECT_QUESTIONS_FROM_10);
                       break;
                   case R.id.wrongCardView:
                       if (questionDao.get10SectionWrongQuestions().size() != 0)
                       startIntentAndPutTag(WRONG_QUESTIONS_FROM_10);
                       break;
                   case R.id.notAnswredCardView:
                       if (questionDao.get10SectionNotAnsweredQuestions().size() != 0)
                       startIntentAndPutTag(NOT_ANSWERED_QUESTIONS_FROM_10);
                       break;

               }
           }


            }
        });
    }

        public void startIntentAndPutTag(int question_tag){
        Intent intent = new Intent(ProgressActivity.this, QuizActivity.class);
        intent.putExtra("whichSection", question_tag);
        startActivity(intent);
    }

        public void DaoInitialization(){
            questionAppDatabase = Room.databaseBuilder(getApplicationContext(), QuestionAppDatabase.class,"QuestionsDB" ).allowMainThreadQueries().build();
            questionDao = questionAppDatabase.getQuestionDAO();
        }

        public void passedTagInitialization(){
            intent = getIntent();
            tag = intent.getIntExtra(codeExtraProgress, -1);
        }

        public void addListenersToCardView(){
            addListenerToCardView(correctCardView);
            addListenerToCardView(wrongCardView);
            addListenerToCardView(notAnsweredCardView);
        }   //Don't touch pls

}