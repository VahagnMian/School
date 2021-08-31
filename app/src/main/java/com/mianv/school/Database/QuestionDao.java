package com.mianv.school.Database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.mianv.school.Model.Question;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface QuestionDao {

    @Insert
    public long addQuestion(Question question);

    @Update
    public void updateCar(Question question);

    @Delete
    public void deleteCar(Question  question);

    @Query("select * from questions")
    public List<Question> getAllQuestionsFromDB();

    @Query("select * from questions where question_id ==:questionId ")
    public Question getQuestion(long questionId);

    @Query("select * from questions where correct_answer = user_answer")
    public List<Question> getCorrectQuestions();

    @Query("select * from questions where correct_answer != user_answer")
    public List<Question> getWrongQuestions();

    @Query("select * from questions where correct_answer = 0")
    public List<Question> getAllNotAnsweredQuestions();

}
