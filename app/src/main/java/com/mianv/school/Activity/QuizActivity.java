package com.mianv.school.Activity;



import static com.mianv.school.Util.Util.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.mianv.school.Database.QuestionAppDatabase;
import com.mianv.school.Model.Question;
import com.mianv.school.R;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private RadioButton radioButton4;
    private RadioButton radioButton5;
    private Button nextQuestionButton;
    private Button previousQuestionButton;
    private TextView questionText;
    private TextView questionIndexText;
    private ImageView questionImage;
    private QuestionAppDatabase questionAppDatabase;
    private int tag;
    private ArrayList<Question> questions;
    private int currentIndex = 0;
    private int checkedIdk;
    private ImageButton homeButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);


        questionAppDatabase =Room.databaseBuilder(getApplicationContext(), QuestionAppDatabase.class,"QuestionsDB" ).allowMainThreadQueries().build();
        viewInitialization();




        if(currentIndex == 0){
            previousQuestionButton.setVisibility(View.GONE);
        }

        if(currentIndex+1 == questions.size()){
            nextQuestionButton.setVisibility(View.GONE);
        }








        bindQuestionToViews(questions.get(currentIndex));
        incrementIndexOfQuestion(questions.get(currentIndex));

        addNextButtonListener();
        addPreviousButtonListener();

        radioGroupSetOnCheckedChangeListener();
        backButtonSetOnClickListener();
    }


    public void bindQuestionToViews(Question question){
        questionText.setText(question.getQuestionText());
        if (question.getImageResID() != 0){
                 questionImage.setVisibility(View.VISIBLE);
                 questionImage.setImageResource(question.getImageResID());
        }else {
            questionImage.setVisibility(View.GONE);
        }


        //Variant 1
        radioButton1.setText(question.getOptionOne());

        //Variant 2
        radioButton2.setText(question.getOptionTwo());

        //Variant 3
        if (question.getOptionThree() == null){
            radioButton3.setVisibility(View.GONE);
        }else {
            radioButton3.setVisibility(View.VISIBLE);
            radioButton3.setText(question.getOptionThree());
        }


        //Variant 4
        if (question.getOptionFour() == null){
            radioButton4.setVisibility(View.GONE);
        }else {
            radioButton4.setVisibility(View.VISIBLE);
            radioButton4.setText(question.getOptionFour());
        }



        //variant 5
        if (question.getOptionFive() == null){
            radioButton5.setVisibility(View.GONE);
        }else {
            radioButton5.setVisibility(View.VISIBLE);
            radioButton5.setText(question.getOptionFive());

        }




    }

    public void viewInitialization(){
        questionText = findViewById(R.id.questionText);
        questionImage = findViewById(R.id.questionImage);
        radioGroup = findViewById(R.id.radioGroup);
        radioButton1 = findViewById(R.id.radioButtonVariant1);
        radioButton2 = findViewById(R.id.radioButtonVariant2);
        radioButton3 = findViewById(R.id.radioButtonVariant3);
        radioButton4 = findViewById(R.id.radioButtonVariant4);
        radioButton5 = findViewById(R.id.radioButtonVariant5);
        nextQuestionButton = findViewById(R.id.nextQuestionButton);
        questionIndexText = findViewById(R.id.questionCount);
        previousQuestionButton = findViewById(R.id.previousQuestionButton);
        homeButton = findViewById(R.id.backHomeButton);




        Intent intent = getIntent();
        tag = intent.getIntExtra("whichSection" , -1);




        //Initializing <questions ArrayList> depend on passed Extra (from MainActivity or ProgressActivity)
        switch (tag){

            case CORRECT_QUESTIONS_FROM_1:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get1SectionCorrectQuestions();
                removeUserAnswer(questions);
                break;
            case WRONG_QUESTIONS_FROM_1:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get1SectionWrongQuestions();
                removeUserAnswer(questions);
                break;
            case NOT_ANSWERED_QUESTIONS_FROM_1:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get1SectionNotAnsweredQuestions();
                removeUserAnswer(questions);
                break;
            case ALL_QUESTION_FROM_1:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get1SectionQuestions();
                removeUserAnswer(questions);
                break;

            case CORRECT_QUESTIONS_FROM_2:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get2SectionCorrectQuestions();
                removeUserAnswer(questions);
                break;
            case WRONG_QUESTIONS_FROM_2:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get2SectionWrongQuestions();
                removeUserAnswer(questions);
                break;
            case NOT_ANSWERED_QUESTIONS_FROM_2:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get2SectionNotAnsweredQuestions();
                removeUserAnswer(questions);
                break;
            case ALL_QUESTION_FROM_2:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get2SectionQuestions();
                removeUserAnswer(questions);
                break;




            case CORRECT_QUESTIONS_FROM_3:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get3SectionCorrectQuestions();
                removeUserAnswer(questions);
                break;
            case WRONG_QUESTIONS_FROM_3:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get3SectionWrongQuestions();
                removeUserAnswer(questions);
                break;
            case NOT_ANSWERED_QUESTIONS_FROM_3:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get3SectionNotAnsweredQuestions();
                removeUserAnswer(questions);
                break;
            case ALL_QUESTION_FROM_3:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get3SectionQuestions();
                removeUserAnswer(questions);
                break;

                //Section 4

            case CORRECT_QUESTIONS_FROM_4:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get4SectionCorrectQuestions();
                removeUserAnswer(questions);
                break;
            case WRONG_QUESTIONS_FROM_4:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get4SectionWrongQuestions();
                removeUserAnswer(questions);
                break;
            case NOT_ANSWERED_QUESTIONS_FROM_4:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get4SectionNotAnsweredQuestions();
                removeUserAnswer(questions);
                break;
            case ALL_QUESTION_FROM_4:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get4SectionQuestions();
                removeUserAnswer(questions);
                break;


                //Section 5

            case CORRECT_QUESTIONS_FROM_5:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get5SectionCorrectQuestions();
                removeUserAnswer(questions);
                break;
            case WRONG_QUESTIONS_FROM_5:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get5SectionWrongQuestions();
                removeUserAnswer(questions);
                break;
            case NOT_ANSWERED_QUESTIONS_FROM_5:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get5SectionNotAnsweredQuestions();
                removeUserAnswer(questions);
                break;
            case ALL_QUESTION_FROM_5:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get5SectionQuestions();
                removeUserAnswer(questions);
                break;


                //Section 6

            case CORRECT_QUESTIONS_FROM_6:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get6SectionCorrectQuestions();
                removeUserAnswer(questions);
                break;
            case WRONG_QUESTIONS_FROM_6:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get6SectionWrongQuestions();
                removeUserAnswer(questions);
                break;
            case NOT_ANSWERED_QUESTIONS_FROM_6:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get6SectionNotAnsweredQuestions();
                removeUserAnswer(questions);
                break;
            case ALL_QUESTION_FROM_6:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get6SectionQuestions();
                removeUserAnswer(questions);
                break;


                //Section 7

            case CORRECT_QUESTIONS_FROM_7:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get7SectionCorrectQuestions();
                removeUserAnswer(questions);
                break;
            case WRONG_QUESTIONS_FROM_7:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get7SectionWrongQuestions();
                removeUserAnswer(questions);
                break;
            case NOT_ANSWERED_QUESTIONS_FROM_7:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get7SectionNotAnsweredQuestions();
                removeUserAnswer(questions);
                break;
            case ALL_QUESTION_FROM_7:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get7sectionQuestions();
                removeUserAnswer(questions);
                break;

                //Section 8

            case CORRECT_QUESTIONS_FROM_8:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get8SectionCorrectQuestions();
                removeUserAnswer(questions);
                break;
            case WRONG_QUESTIONS_FROM_8:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get8SectionWrongQuestions();
                removeUserAnswer(questions);
                break;
            case NOT_ANSWERED_QUESTIONS_FROM_8:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get8SectionNotAnsweredQuestions();
                removeUserAnswer(questions);
                break;
            case ALL_QUESTION_FROM_8:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get8sectionQuestions();
                removeUserAnswer(questions);
                break;

                //Section 9

            case CORRECT_QUESTIONS_FROM_9:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get9SectionCorrectQuestions();
                removeUserAnswer(questions);
                break;
            case WRONG_QUESTIONS_FROM_9:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get9SectionWrongQuestions();
                removeUserAnswer(questions);
                break;
            case NOT_ANSWERED_QUESTIONS_FROM_9:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get9SectionNotAnsweredQuestions();
                removeUserAnswer(questions);
                break;
            case ALL_QUESTION_FROM_9:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get9sectionQuestions();
                removeUserAnswer(questions);
                break;


                //Section 10

            case CORRECT_QUESTIONS_FROM_10:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get10SectionCorrectQuestions();
                removeUserAnswer(questions);
                break;
            case WRONG_QUESTIONS_FROM_10:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get10SectionWrongQuestions();
                removeUserAnswer(questions);
                break;
            case NOT_ANSWERED_QUESTIONS_FROM_10:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get10SectionNotAnsweredQuestions();
                removeUserAnswer(questions);
                break;
            case ALL_QUESTION_FROM_10:
                questions = (ArrayList<Question>) questionAppDatabase.getQuestionDAO().get10sectionQuestions();
                removeUserAnswer(questions);
                break;




        }

        if(currentIndex == questions.size()-1){
            homeButton.setVisibility(View.VISIBLE);
        }else {
            homeButton.setVisibility(View.GONE);
        }




    }



    public void setCheckedId(){
        switch (radioGroup.getCheckedRadioButtonId()){
            case R.id.radioButtonVariant1:
                checkedIdk = 1;
                break;
            case R.id.radioButtonVariant2:
                checkedIdk = 2;
                break;
            case R.id.radioButtonVariant3:
                checkedIdk = 3;
                break;
            case R.id.radioButtonVariant4:
                checkedIdk = 4;
                break;
            case R.id.radioButtonVariant5:
                checkedIdk = 5;
                break;
        }
    }

    public int getRadioButtonIdFromIndex(int correctAnswer){
        int correctRadioButton=0;
        switch (correctAnswer){
            case 1:
                correctRadioButton = R.id.radioButtonVariant1;
            break;
            case 2:
                correctRadioButton = R.id.radioButtonVariant2;
            break;
            case 3:
                correctRadioButton = R.id.radioButtonVariant3;
            break;
            case 4:
                correctRadioButton = R.id.radioButtonVariant4;
            break;
            case 5:
                correctRadioButton = R.id.radioButtonVariant5;
            break;

        }

        return correctRadioButton;
    }

    public void addNextButtonListener(){
        nextQuestionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex++;
                if(currentIndex == questions.size()-1){
                    nextQuestionButton.setVisibility(View.GONE);
                    homeButton.setVisibility(View.VISIBLE);
                }


                if (currentIndex>0){
                    previousQuestionButton.setVisibility(View.VISIBLE);
                }


                Question currentQuestion = questions.get(currentIndex);
                bindQuestionToViews(currentQuestion);
                incrementIndexOfQuestion(currentQuestion);
                radioGroup.setOnCheckedChangeListener(null);
                radioGroup.clearCheck();
                uncheckAllRadioGroup();
                radioGroupSetOnCheckedChangeListener();


                  retrieveCurrentAnswerAtNextAndPrevious(currentQuestion);



            }
        });
    }

    public void addPreviousButtonListener(){
        previousQuestionButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            currentIndex--;

            if (currentIndex != questions.size()){
                nextQuestionButton.setVisibility(View.VISIBLE);
            }

            Question currentQuestion = questions.get(currentIndex);


            if (currentIndex == 0){
                previousQuestionButton.setVisibility(View.GONE);
            }

            bindQuestionToViews(currentQuestion);
            incrementIndexOfQuestion(currentQuestion);
            radioGroup.setOnCheckedChangeListener(null);
            radioGroup.clearCheck();
            uncheckAllRadioGroup();
            radioGroupSetOnCheckedChangeListener();


                retrieveCurrentAnswerAtNextAndPrevious(currentQuestion);

        }
    });}

    public void changeRadioButtonDesignUnchecked(RadioButton radioButton){
        radioButton.setBackgroundResource(R.drawable.background_style);
        radioButton.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.radio_button_style, 0);

    }

    public void radioGroupSetOnCheckedChangeListener(){
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                setCheckedId();

                 Question currentQuestion = questions.get(currentIndex);
                 currentQuestion.setUsersAnswer(checkedIdk);

                 //questions.add(currentQuestion);

                 questionAppDatabase.getQuestionDAO().updateQuestion(currentQuestion);



                if(currentQuestion.getUsersAnswer() != currentQuestion.getCorrectAnswer()) {
                    currentQuestion.setUsersAnswer(checkedIdk);
                    radioGroup.setOnCheckedChangeListener(null);
                    radioGroup.check(getRadioButtonIdFromIndex(questions.get(currentIndex).getCorrectAnswer()));


                    changeRadioButtonDesignToWrong(questions.get(currentIndex).getUsersAnswer());
                }else {
                    currentQuestion.setUsersAnswer(checkedIdk);
                    radioGroup.setOnCheckedChangeListener(null);
                    radioGroup.check(getRadioButtonIdFromIndex(currentQuestion.getCorrectAnswer()));
                }




            }
        });
    }

    public void uncheckAllRadioGroup(){
        changeRadioButtonDesignUnchecked(radioButton1);
        changeRadioButtonDesignUnchecked(radioButton2);
        changeRadioButtonDesignUnchecked(radioButton3);
        changeRadioButtonDesignUnchecked(radioButton4);
        changeRadioButtonDesignUnchecked(radioButton5);
    }

    public void changeRadioButtonDesignToWrong(int radioGroupIndex){
        RadioButton radioButton = findViewById(getRadioButtonIdFromIndex(radioGroupIndex));
        radioButton.setBackgroundResource(R.drawable.radio_button_wrong_answer_background);
        radioButton.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_radio_unchecked_wrong, 0);

    }

    public void retrieveCurrentAnswerAtNextAndPrevious(Question currentQuestion){
        if (currentQuestion.getUsersAnswer() != 0) {
            if (currentQuestion.getUsersAnswer() != questions.get(currentIndex).getCorrectAnswer()){
                changeRadioButtonDesignToWrong(currentQuestion.getUsersAnswer());
                radioGroup.setOnCheckedChangeListener(null);
                radioGroup.check(getRadioButtonIdFromIndex(questions.get(currentIndex).getCorrectAnswer()));
            }else {
                radioGroup.check(getRadioButtonIdFromIndex(currentQuestion.getUsersAnswer()));
            }


        }
    }

    public void removeUserAnswer(ArrayList<Question> questions){

        for (int i = 0; i < questions.size() ; i++) {
            questions.get(i).setUsersAnswer(0);
        }

    }

    public void incrementIndexOfQuestion(Question question){

        int  id =  question.getId();

        int  secondResult = id - 573;
        int  thirdResult = id - 61;
        int  fourthResult = id - 120;
        int  fifthResult = id - 205;
        int  sixthResult = id - 266;
        int  seventhResult = id - 318;
        int  eighthResult = id - 384;
        int  ninthResult = id - 446;
        int  tenthResult = id - 536;




        if(id>= 1 && id <= 61){
            questionIndexText.setText("Հարց " + id + " / " + questions.size());
        }else if (id>= 62 && id <= 120){
            questionIndexText.setText("Հարց " + thirdResult + " / " + questions.size());
        }else if (id>= 121 && id <= 205){
            questionIndexText.setText("Հարց " + fourthResult + " / " + questions.size());
        }else if (id>= 206 && id <= 266){
            questionIndexText.setText("Հարց " + fifthResult + " / " + questions.size());
        }else if (id>= 267 && id <= 318){
            questionIndexText.setText("Հարց " + sixthResult + " / " + questions.size());
        }else if (id>= 319 && id <= 384){
            questionIndexText.setText("Հարց " + seventhResult + " / " + questions.size());
        }else if (id>= 385 && id <= 446){
            questionIndexText.setText("Հարց " + eighthResult + " / " + questions.size());
        }else if (id>= 447 && id <= 536){
            questionIndexText.setText("Հարց " + ninthResult + " / " + questions.size());
        } else if (id>= 537 && id <= 573){
            questionIndexText.setText("Հարց " + tenthResult + " / " + questions.size());
        } else if (id>=574 && id<=624){
            questionIndexText.setText("Հարց " + secondResult + " / " + questions.size());
        }


    }

    public void backButtonSetOnClickListener(){
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}