package com.mianv.school.Activity;

import static com.mianv.school.Util.Constants.getAllQuestions;
import static com.mianv.school.Util.Constants.question002;
import static com.mianv.school.Util.Constants.questions;

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
import com.mianv.school.Util.Constants;

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
    ImageView questionImage;
    ArrayList<Question> questions;
    int currentIndex = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        viewInitialization();

        if(currentIndex == 0){
            previousQuestion.setVisibility(View.GONE);
        }



        bindQuestionToViews(questions.get(currentIndex));

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
            }
        });
        previousQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                currentIndex--;

                if (currentIndex != questions.size()){
                    nextQuestion.setVisibility(View.VISIBLE);
                }

                    Question currentQuestion = questions.get(currentIndex);
                    bindQuestionToViews(currentQuestion);

                    if (currentIndex == 0){
                        previousQuestion.setVisibility(View.GONE);
                    }

                }
        });


    }

    public void bindQuestionToViews(Question question){
        questionText.setText(question.getQuestionText());
        if (question.getImageResID() != 0){
                 questionImage.setImageResource(question.getImageResID());
        }else {
            questionImage.setVisibility(View.GONE);
        }

        radioButton1.setText(question.getOptionOne());
        radioButton2.setText(question.getOptionTwo());


        if (question.getOptionThree() == ""){
            radioButton3.setVisibility(View.GONE);
        }else {
            radioButton3.setText(question.getOptionThree());
        }

        if (question.getOptionFour() == ""){
            radioButton4.setVisibility(View.GONE);
        }else {
            radioButton4.setText(question.getOptionFour());
        }

        if (question.getOptionFive() == ""){
            radioButton5.setVisibility(View.GONE);
        }else {
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
        previousQuestion = findViewById(R.id.previousQuestionButton);
        questions = getAllQuestions();
    }






}