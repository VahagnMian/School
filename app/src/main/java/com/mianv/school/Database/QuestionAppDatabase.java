package com.mianv.school.Database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.mianv.school.Model.Question;

@Database(entities = {Question.class}, version = 1)
public abstract class QuestionAppDatabase extends RoomDatabase {

   public abstract QuestionDao getQuestionDAO();


}
