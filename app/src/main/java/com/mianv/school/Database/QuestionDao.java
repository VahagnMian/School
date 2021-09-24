package com.mianv.school.Database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.mianv.school.Model.Question;

import java.util.List;

@Dao
public interface QuestionDao {

    @Insert
    public long addQuestion(Question question);

    @Update
    public void updateQuestion(Question question);

    @Delete
    public void deleteCar(Question  question);

    @Query("select * from questions")
    public List<Question> getAllQuestionsFromDB();

    @Query("UPDATE questions SET user_answer = :usersAnswer WHERE id = :id")
    public void updateQuestion(long id, int usersAnswer);

    @Query("select * from questions where id ==:id ")
    public Question getQuestion(long id);

    //First section related queries

    @Query("select * from questions where id >= 1 and id <= 61")
    public List<Question> get1SectionQuestions();

    @Query("select * from questions where id>=1 and id<=61 and correct_answer == user_answer")
    public List<Question> get1SectionCorrectQuestions();

    @Query("SELECT * FROM questions WHERE id >= 1 and id <= 61 and correct_answer != user_answer AND correct_answer != 0")
    public List<Question> get1SectionWrongQuestions();

    @Query("select * from questions where id >= 1 and id <= 61 and user_answer == 0")
    public List<Question> get1SectionNotAnsweredQuestions();


    //Second section related queries

    @Query("select * from questions where id >= 574 and id <= 621")
    public List<Question> get2SectionQuestions();

    @Query("select * from questions where id>=574 and id<=621 and correct_answer == user_answer")
    public List<Question> get2SectionCorrectQuestions();

    @Query("SELECT * FROM questions WHERE id >= 574 and id <= 621 and correct_answer != user_answer AND correct_answer != 0")
    public List<Question> get2SectionWrongQuestions();

    @Query("select * from questions where id >= 574 and id <= 621 and user_answer == 0")
    public List<Question> get2SectionNotAnsweredQuestions();

    //Third section related queries

    @Query("select * from questions where id >= 62 and id <= 120")
    public List<Question> get3SectionQuestions();

    @Query("select * from questions where id >= 62 and id <= 120 and correct_answer == user_answer")
    public List<Question> get3SectionCorrectQuestions();

    @Query("select * from questions where id >= 62 and id <= 120 and correct_answer != user_answer AND user_answer != 0")
    public List<Question> get3SectionWrongQuestions();

    @Query("select * from questions where id >= 62 and id <= 120 and user_answer == 0")
    public List<Question> get3SectionNotAnsweredQuestions();

    //Fourth section related queries

    @Query("select * from questions where id >= 121 and id <= 205")
    public List<Question> get4SectionQuestions();

    @Query("select * from questions where id >= 121 and id <= 205 and correct_answer == user_answer")
    public List<Question> get4SectionCorrectQuestions();

    @Query("select * from questions where id >= 121 and id <= 205 and correct_answer != user_answer AND user_answer != 0")
    public List<Question> get4SectionWrongQuestions();

    @Query("select * from questions where id >= 121 and id <= 205 and user_answer == 0")
    public List<Question> get4SectionNotAnsweredQuestions();

    //Fifth section related queries 206 266

    @Query("select * from questions where id >= 206 and id <= 266")
    public List<Question> get5SectionQuestions();

    @Query("select * from questions where id >= 206 and id <= 266 and correct_answer == user_answer")
    public List<Question> get5SectionCorrectQuestions();

    @Query("select * from questions where id >= 206 and id <= 266 and correct_answer != user_answer AND user_answer != 0")
    public List<Question> get5SectionWrongQuestions();

    @Query("select * from questions where id >= 206 and id <= 266 and user_answer == 0")
    public List<Question> get5SectionNotAnsweredQuestions();

    // Sixth section related queries 267-318

    @Query("select * from questions where id >= 267 and id <= 318")
    public List<Question> get6SectionQuestions();

    @Query("select * from questions where id >= 267 and id <= 318 and correct_answer == user_answer")
    public List<Question> get6SectionCorrectQuestions();

    @Query("select * from questions where id >= 267 and id <= 318 and correct_answer != user_answer AND user_answer != 0")
    public List<Question> get6SectionWrongQuestions();

    @Query("select * from questions where id >= 267 and id <= 318 and user_answer == 0")
    public List<Question> get6SectionNotAnsweredQuestions();

    //Seventh section related queries 319-384

    @Query("select * from questions where id >= 319 and id <= 384")
    public List<Question> get7sectionQuestions();

    @Query("select * from questions where id >= 319 and id <= 384 and correct_answer == user_answer")
    public List<Question> get7SectionCorrectQuestions();

    @Query("select * from questions where id >= 319 and id <= 384 and correct_answer != user_answer AND user_answer != 0")
    public List<Question> get7SectionWrongQuestions();

    @Query("select * from questions where id >= 319 and id <= 384 and user_answer == 0")
    public List<Question> get7SectionNotAnsweredQuestions();

    //Eighth section related queries 385-446

    @Query("select * from questions where id >= 385 and id <= 446")
    public List<Question> get8sectionQuestions();

    @Query("select * from questions where id >= 385 and id <= 446 and correct_answer == user_answer")
    public List<Question> get8SectionCorrectQuestions();

    @Query("select * from questions where id >= 385 and id <= 446 and correct_answer != user_answer AND user_answer != 0")
    public List<Question> get8SectionWrongQuestions();

    @Query("select * from questions where id >= 385 and id <= 446 and user_answer == 0")
    public List<Question> get8SectionNotAnsweredQuestions();

    //Ninth section related queries 447-536

    @Query("select * from questions where id >= 447 and id <= 536")
    public List<Question> get9sectionQuestions();

    @Query("select * from questions where id >= 447 and id <= 536 and correct_answer == user_answer")
    public List<Question> get9SectionCorrectQuestions();

    @Query("select * from questions where id >= 447 and id <= 536 and correct_answer != user_answer AND user_answer != 0")
    public List<Question> get9SectionWrongQuestions();

    @Query("select * from questions where id >= 447 and id <= 536 and user_answer == 0")
    public List<Question> get9SectionNotAnsweredQuestions();

    //Tenth section related queries  537-573

    @Query("select * from questions where id >= 537 and id <= 573")
    public List<Question> get10sectionQuestions();

    @Query("select * from questions where id >= 537 and id <= 573 and correct_answer == user_answer")
    public List<Question> get10SectionCorrectQuestions();

    @Query("select * from questions where id >= 537 and id <= 573 and correct_answer != user_answer AND user_answer != 0")
    public List<Question> get10SectionWrongQuestions();

    @Query("select * from questions where id >= 537 and id <= 573 and user_answer == 0")
    public List<Question> get10SectionNotAnsweredQuestions();





}
