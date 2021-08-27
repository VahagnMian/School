package com.mianv.school.Activity;

import static com.mianv.school.Util.Constants.getAllQuestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.mianv.school.Model.Question;
import com.mianv.school.R;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    RadioButton radioButton5;

    Button nextQuestion;
    Button previousQuestion;

    TextView questionText;
    TextView questionIndexText;
    ImageView questionImage;
    ArrayList<Question> questions;
    int currentIndex = 0;
    int checkedIdk;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        viewInitialization();


        if(currentIndex == 0){
            previousQuestion.setVisibility(View.GONE);
        }




        bindQuestionToViews(questions.get(currentIndex));

        addNextButtonListener();
        addPreviousButtonListener();

        radioGroupSetOnCheckedChangeListener();
    }


    public void bindQuestionToViews(Question question){
        questionText.setText(question.getQuestionText());
        if (question.getImageResID() != 0){
                 questionImage.setVisibility(View.VISIBLE);
                 questionImage.setImageResource(question.getImageResID());
        }else {
            questionImage.setVisibility(View.GONE);
        }

        radioButton1.setText(question.getOptionOne());
        radioButton2.setText(question.getOptionTwo());


        if (question.getOptionThree() == ""){
            radioButton3.setVisibility(View.GONE);
        }else {
            radioButton3.setVisibility(View.VISIBLE);
            radioButton3.setText(question.getOptionThree());
        }

        if (question.getOptionFour() == ""){
            radioButton4.setVisibility(View.GONE);
        }else {
            radioButton4.setVisibility(View.VISIBLE);
            radioButton4.setText(question.getOptionFour());
        }

        if (question.getOptionFive() == ""){
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
        nextQuestion = findViewById(R.id.nextQuestionButton);
        questionIndexText = findViewById(R.id.questionCount);
        previousQuestion = findViewById(R.id.previousQuestionButton);
        questions = getAllQuestions();
    }

    public void incrementIndexOfQuestion(){
        questionIndexText.setText("Հարց " + questions.get(currentIndex).getId()+ "/61");
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
        nextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex++;
                if(currentIndex == questions.size()-1){
                    nextQuestion.setVisibility(View.GONE);
                }


                if (currentIndex>0){
                    previousQuestion.setVisibility(View.VISIBLE);
                }


                Question currentQuestion = questions.get(currentIndex);
                bindQuestionToViews(currentQuestion);
                incrementIndexOfQuestion();
                radioGroup.setOnCheckedChangeListener(null);
                radioGroup.clearCheck();
                uncheckAllRadioGroup();
                radioGroupSetOnCheckedChangeListener();


                retrieveCurrentAnswerAtNextAndPrevious(currentQuestion);



            }
        });
    }

    public void addPreviousButtonListener(){
        previousQuestion.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            currentIndex--;

            if (currentIndex != questions.size()){
                nextQuestion.setVisibility(View.VISIBLE);
            }

            Question currentQuestion = questions.get(currentIndex);


            if (currentIndex == 0){
                previousQuestion.setVisibility(View.GONE);
            }

            bindQuestionToViews(currentQuestion);
            incrementIndexOfQuestion();
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





}