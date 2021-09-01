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

    @Query("select * from questions where correct_answer = user_answer")
    public List<Question> getCorrectQuestions();

    @Query("select * from questions where correct_answer != user_answer AND correct_answer != 0")
    public List<Question> getWrongQuestions();

    @Query("select * from questions where user_answer == 0")
    public List<Question> getNotAnsweredQuestions();

}
