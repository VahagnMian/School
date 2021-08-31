package com.mianv.school.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "questions")
public class Question {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "question_id")
    private int id;

    private int imageResID=0;

    @ColumnInfo(name = "correct_answer")
    private int correctAnswer;
    private String questionText;
    private String optionOne= "";
    private String OptionTwo= "";
    private String OptionThree= "";
    private String OptionFour= "";
    private String OptionFive="";

    @ColumnInfo(name = "user_answer")
    private int usersAnswer = 0;

    public Question(int id, int usersAnswer){
        this.id = id;
        this.usersAnswer = usersAnswer;
    }




    @Ignore
    public Question(int id, int imageResID, int correctAnswer, String questionText, String optionOne, String optionTwo, String optionThree, int usersAnswer) {
        this.id = id;
        this.imageResID = imageResID;
        this.correctAnswer = correctAnswer;
        this.questionText = questionText;
        this.optionOne = optionOne;
        OptionTwo = optionTwo;
        OptionThree = optionThree;
        this.usersAnswer = usersAnswer;
    }
    @Ignore
    public Question(int id, int correctAnswer, String questionText, String optionOne, String optionTwo, String optionThree, String optionFour, String optionFive, int usersAnswer) {
        this.id = id;
        this.correctAnswer = correctAnswer;
        this.questionText = questionText;
        this.optionOne = optionOne;
        OptionTwo = optionTwo;
        OptionThree = optionThree;
        OptionFour = optionFour;
        OptionFive = optionFive;
        this.usersAnswer = usersAnswer;
    }
    @Ignore
    public Question(int id, int correctAnswer, String questionText, String optionOne, String optionTwo, int usersAnswer) {
        this.id = id;
        this.correctAnswer = correctAnswer;
        this.questionText = questionText;
        this.optionOne = optionOne;
        OptionTwo = optionTwo;
        this.usersAnswer = usersAnswer;
    }
    @Ignore
    public Question(int id, int correctAnswer, String questionText, String optionOne, String optionTwo, String optionThree, int usersAnswer) {
        this.id = id;
        this.correctAnswer = correctAnswer;
        this.questionText = questionText;
        this.optionOne = optionOne;
        OptionTwo = optionTwo;
        OptionThree = optionThree;
        this.usersAnswer = usersAnswer;
    }
    @Ignore
    public Question(int id, int correctAnswer, String questionText, String optionOne, String optionTwo, String optionThree, String optionFour, int usersAnswer) {
        this.id = id;
        this.correctAnswer = correctAnswer;
        this.questionText = questionText;
        this.optionOne = optionOne;
        OptionTwo = optionTwo;
        OptionThree = optionThree;
        OptionFour = optionFour;
        this.usersAnswer = usersAnswer;
    }
    @Ignore
    public Question(int id, int imageResID, int correctAnswer, String questionText, String optionOne, String optionTwo, int usersAnswer) {
        this.id = id;
        this.imageResID = imageResID;
        this.correctAnswer = correctAnswer;
        this.questionText = questionText;
        this.optionOne = optionOne;
        OptionTwo = optionTwo;
        this.usersAnswer = usersAnswer;
    }
    @Ignore
    public Question(int id, int imageResID, int correctAnswer, String questionText, String optionOne, String optionTwo, String optionThree, String optionFour, int usersAnswer) {
        this.id = id;
        this.imageResID = imageResID;
        this.correctAnswer = correctAnswer;
        this.questionText = questionText;
        this.optionOne = optionOne;
        OptionTwo = optionTwo;
        OptionThree = optionThree;
        OptionFour = optionFour;
        this.usersAnswer = usersAnswer;
    }
    @Ignore
    public Question(int id, int imageResID, int correctAnswer, String questionText, String optionOne, String optionTwo, String optionThree, String optionFour, String optionFive, int usersAnswer) {
        this.id = id;
        this.imageResID = imageResID;
        this.correctAnswer = correctAnswer;
        this.questionText = questionText;
        this.optionOne = optionOne;
        OptionTwo = optionTwo;
        OptionThree = optionThree;
        OptionFour = optionFour;
        OptionFive = optionFive;
        this.usersAnswer = usersAnswer;
    }
    @Ignore
    public Question(int id, int imageResID, int correctAnswer, String questionText, String optonOne, String optionTwo, String optionThree, String optionFour, String optionFive) {

        this.id = id;
        this.imageResID = imageResID;
        this.correctAnswer = correctAnswer;
        this.questionText = questionText;
        this.optionOne = optonOne;
        OptionTwo = optionTwo;
        OptionThree = optionThree;
        OptionFour = optionFour;
        OptionFive = optionFive;
    }
    @Ignore
    public Question(int id, int correctAnswer, String questionText, String optonOne, String optionTwo, String optionThree, String optionFour, String optionFive) {
        this.id = id;
        this.correctAnswer = correctAnswer;
        this.questionText = questionText;
        this.optionOne = optonOne;
        OptionTwo = optionTwo;
        OptionThree = optionThree;
        OptionFour = optionFour;
        OptionFive = optionFive;
    }
    @Ignore
    public Question(int id, int imageResID, int correctAnswer, String questionText, String optionOne, String optionTwo, String optionThree) {
        this.id = id;
        this.imageResID = imageResID;
        this.correctAnswer = correctAnswer;
        this.questionText = questionText;
        this.optionOne = optionOne;
        OptionTwo = optionTwo;
        OptionThree = optionThree;
    }
    @Ignore
    public Question(int id, int correctAnswer, String questionText, String optionOne, String optionTwo, String optionThree, String optionFour) {
        this.id = id;
        this.correctAnswer = correctAnswer;
        this.questionText = questionText;
        this.optionOne = optionOne;
        OptionTwo = optionTwo;
        OptionThree = optionThree;
        OptionFour = optionFour;
    }
    @Ignore
    public Question(int id, int correctAnswer, String questionText, String optionOne, String optionTwo, String optionThree) {
        this.id = id;
        this.correctAnswer = correctAnswer;
        this.questionText = questionText;
        this.optionOne = optionOne;
        OptionTwo = optionTwo;
        OptionThree = optionThree;
    }
    @Ignore
    public Question(int id, int correctAnswer, String questionText, String optionOne, String optionTwo) {
        this.id = id;
        this.correctAnswer = correctAnswer;
        this.questionText = questionText;
        this.optionOne = optionOne;
        OptionTwo = optionTwo;
    }
    @Ignore
    public Question(int id, int imageResID, int correctAnswer, String questionText, String optionOne, String optionTwo) {
        this.id = id;
        this.correctAnswer = correctAnswer;
        this.questionText = questionText;
        this.optionOne = optionOne;
        this.imageResID = imageResID;
        OptionTwo = optionTwo;
    }
    @Ignore
    public Question(int id, int imageResID, int correctAnswer, String questionText, String optionOne, String optionTwo, String optionThree, String optionFour) {
        this.id = id;
        this.correctAnswer = correctAnswer;
        this.questionText = questionText;
        this.optionOne = optionOne;
        this.imageResID = imageResID;
        OptionTwo = optionTwo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageResID() {
        return imageResID;
    }

    public void setImageResID(int imageResID) {
        this.imageResID = imageResID;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getOptionOne() {
        return optionOne;
    }

    public void setOptionOne(String optionOne) {
        this.optionOne = optionOne;
    }

    public String getOptionTwo() {
        return OptionTwo;
    }

    public void setOptionTwo(String optionTwo) {
        OptionTwo = optionTwo;
    }

    public String getOptionThree() {
        return OptionThree;
    }

    public void setOptionThree(String optionThree) {
        OptionThree = optionThree;
    }

    public String getOptionFour() {
        return OptionFour;
    }

    public void setOptionFour(String optionFour) {
        OptionFour = optionFour;
    }

    public String getOptionFive() {
        return OptionFive;
    }

    public void setOptionFive(String optionFive) {
        OptionFive = optionFive;
    }

    public int getUsersAnswer() {
        return usersAnswer;
    }

    public void setUsersAnswer(int usersAnswer) {
        this.usersAnswer = usersAnswer;
    }
}
