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


    @Query("select * from questions where id >= 0 and id <= 61")
    public List<Question> get1SectionQuestions();

    @Query("select * from questions where id>=0 and id<=61 and correct_answer == user_answer")
    public List<Question> get1SectionCorrectQuestions();

    @Query("SELECT * FROM questions WHERE id >= 0 and id <= 61 and correct_answer != user_answer AND correct_answer != 0")
    public List<Question> get1SectionWrongQuestions();

    @Query("select * from questions where id >= 0 and id <= 61 and user_answer == 0")
    public List<Question> get1SectionNotAnsweredQuestions();

    //Third section related queries

    @Query("select * from questions where id >= 62 and id <= 120")
    public List<Question> get3SectionQuestions();

    @Query("select * from questions where id >= 62 and id <= 120 and correct_answer == user_answer")
    public List<Question> get3SectionCorrectQuestions();

    @Query("select * from questions where id >= 62 and id <= 120 and correct_answer != user_answer AND user_answer != 0")
    public List<Question> get3SectionWrongQuestions();

    @Query("select * from questions where id >= 62 and id <= 120 and user_answer == 0")
    public List<Question> get3SectionNotAnsweredQuestions();

    //



}
