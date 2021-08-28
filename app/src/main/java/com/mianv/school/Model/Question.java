package com.mianv.school.Model;

public class Question {

    int id;
    int imageResID=0;
    int correctAnswer;
    String questionText;
    String optionOne= "";
    String OptionTwo= "";
    String OptionThree= "";
    String OptionFour= "";
    String OptionFive="";
    int usersAnswer = 0;

    public int getUsersAnswer() {
        return usersAnswer;
    }

    public void setUsersAnswer(int usersAnswer) {
        this.usersAnswer = usersAnswer;
    }

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

    public Question(int id, int correctAnswer, String questionText, String optionOne, String optionTwo, int usersAnswer) {
        this.id = id;
        this.correctAnswer = correctAnswer;
        this.questionText = questionText;
        this.optionOne = optionOne;
        OptionTwo = optionTwo;
        this.usersAnswer = usersAnswer;
    }

    public Question(int id, int correctAnswer, String questionText, String optionOne, String optionTwo, String optionThree, int usersAnswer) {
        this.id = id;
        this.correctAnswer = correctAnswer;
        this.questionText = questionText;
        this.optionOne = optionOne;
        OptionTwo = optionTwo;
        OptionThree = optionThree;
        this.usersAnswer = usersAnswer;
    }

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

    public Question(int id, int imageResID, int correctAnswer, String questionText, String optionOne, String optionTwo, int usersAnswer) {
        this.id = id;
        this.imageResID = imageResID;
        this.correctAnswer = correctAnswer;
        this.questionText = questionText;
        this.optionOne = optionOne;
        OptionTwo = optionTwo;
        this.usersAnswer = usersAnswer;
    }

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

    public Question(int id, int imageResID, int correctAnswer, String questionText, String optionOne, String optionTwo, String optionThree) {
        this.id = id;
        this.imageResID = imageResID;
        this.correctAnswer = correctAnswer;
        this.questionText = questionText;
        this.optionOne = optionOne;
        OptionTwo = optionTwo;
        OptionThree = optionThree;
    }

    public Question(int id, int correctAnswer, String questionText, String optionOne, String optionTwo, String optionThree, String optionFour) {
        this.id = id;
        this.correctAnswer = correctAnswer;
        this.questionText = questionText;
        this.optionOne = optionOne;
        OptionTwo = optionTwo;
        OptionThree = optionThree;
        OptionFour = optionFour;
    }

    public Question(int id, int correctAnswer, String questionText, String optionOne, String optionTwo, String optionThree) {
        this.id = id;
        this.correctAnswer = correctAnswer;
        this.questionText = questionText;
        this.optionOne = optionOne;
        OptionTwo = optionTwo;
        OptionThree = optionThree;
    }



    public Question(int id, int correctAnswer, String questionText, String optionOne, String optionTwo) {
        this.id = id;
        this.correctAnswer = correctAnswer;
        this.questionText = questionText;
        this.optionOne = optionOne;
        OptionTwo = optionTwo;
    }

    public Question(int id, int imageResID, int correctAnswer, String questionText, String optionOne, String optionTwo) {
        this.id = id;
        this.correctAnswer = correctAnswer;
        this.questionText = questionText;
        this.optionOne = optionOne;
        this.imageResID = imageResID;
        OptionTwo = optionTwo;
    }

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
}
