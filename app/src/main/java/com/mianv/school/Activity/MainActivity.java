package com.mianv.school.Activity;

import static com.mianv.school.Util.Util.*;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ScrollView;


import com.mianv.school.Adapter.DashboardAdapter;
import com.mianv.school.Database.QuestionAppDatabase;
import com.mianv.school.Database.QuestionDao;
import com.mianv.school.Model.Card;
import com.mianv.school.R;
import com.mianv.school.Util.Constants;

import java.util.ArrayList;

import me.everything.android.ui.overscroll.OverScrollDecoratorHelper;

public class MainActivity extends AppCompatActivity {


    private Toolbar toolbar;
    private  RecyclerView recyclerView;
    private  DashboardAdapter adapter;
    private  RecyclerView.LayoutManager layoutManager;
    private  ArrayList<Card> cards;
    private   ScrollView scrollView;
    private   QuestionAppDatabase questionAppDatabase;
    private   QuestionDao questionDao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(null);
        setContentView(R.layout.activity_main);




        daoInitialization();
        viewInitialization();
        createRecyclerView();
        addTestItemsToRecyclerView();
        OverScrollDecoratorHelper.setUpOverScroll(scrollView);
        loadQuestionsToRoom();
        addListenerToCardView();












    }




    public void goToProgress(int whichCard) {

        Intent intent = new Intent(getApplicationContext(), ProgressActivity.class);


        switch(whichCard){
            case 0:
                intent.putExtra(codeExtraProgress, FIRST_SECTION_CARD);
                startActivity(intent);
                break;
            case 1:
                intent.putExtra(codeExtraProgress, SECOND_SECTION_CARD);
                startActivity(intent);
                break;
            case 2:
                intent.putExtra(codeExtraProgress, THIRD_SECTION_CARD);
                startActivity(intent);
                break;
            case 3:
                intent.putExtra(codeExtraProgress, FOURTH_SECTION_CARD);
                startActivity(intent);
                break;
            case 4:
                intent.putExtra(codeExtraProgress, FIFTH_SECTION_CARD);
                startActivity(intent);
                break;
            case 5:
                intent.putExtra(codeExtraProgress, SIXTH_SECTION_CARD);
                startActivity(intent);
                break;
            case 6:
                intent.putExtra(codeExtraProgress, SEVENTH_SECTION_CARD);
                startActivity(intent);
                break;
            case 7:
                intent.putExtra(codeExtraProgress, EIGHTH_SECTION_CARD);
                startActivity(intent);
                break;
            case 8:
                intent.putExtra(codeExtraProgress, NINTH_SECTION_CARD);
                startActivity(intent);
                break;
            case 9:
                intent.putExtra(codeExtraProgress, TENTH_SECTION_CARD);
                startActivity(intent);
                break;

        }


    }

    public void goToQuiz(int toWhich){

         Intent intent = new Intent(MainActivity.this, QuizActivity.class);
         intent.putExtra("whichSection", toWhich);
         startActivity(intent);

    }

    public void loadQuestionsToRoom(){
        if (questionAppDatabase.getQuestionDAO().getAllQuestionsFromDB().size() == 0) {
            for (int i = 0; i < Constants.allQuestions.length - 1; i++) {
                questionAppDatabase.getQuestionDAO().addQuestion(Constants.allQuestions[i]);
            }

        }


    }

    public void createRecyclerView(){
        cards = new ArrayList<>();
        recyclerView = findViewById(R.id.dashboardRecyclerView);
        adapter = new DashboardAdapter(cards);
        layoutManager = new GridLayoutManager(this, 2 );
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.setNestedScrollingEnabled(false);


    }

    public void addTestItemsToRecyclerView(){
        Card card1 = new Card(R.drawable.ic_arrows,"Թեմա 1" , "Մանևրում, դասավորվածություն \nերթևեկաելի \nմասում..." , 13, 61);
        Card card2 = new Card(R.drawable.ic_law_hummer,"Թեմա 2" , "Օրենք" , 13, 61);
        Card card3 = new Card(R.drawable.ic_gears,"Թեմա 3" , "Շահագործում" , 13, 61);
        Card card4 = new Card(R.drawable.ic_road_sign,"Թեմա 4" , "Նշաններ" , 13, 61);
        Card card5 = new Card(R.drawable.ic_cross_road_1,"Թեմա 5" , "Խաչմերուկ 1" , 13, 61);
        Card card6 = new Card(R.drawable.ic_cross_road_2,"Թեմա 6" , "Խաչմերուկ 2" , 13, 61);
        Card card7 = new Card(R.drawable.ic_parking,"Թեմա 7" , "Ճանապարհային գծանշում, կանգառ, կայանում" , 13, 61);
        Card card8 = new Card(R.drawable.ic_big_car,"Թեմա 8" , "Արագություն, քարշակում, մարդկանց և բեռնեռրի փոխադրում" , 13, 61);
        Card card9 = new Card(R.drawable.ic_waning_polygon,"Թեմա 9" , "Նախազգուշացնող ազդանշաններ, հատուկ ազդանշաններ․․․" , 13, 61);
        Card card10 = new Card(R.drawable.ic_medkit,"Թեմա 10" , "Երթևեկության մասնակիցների կյանքի անվտանգություն․․․" , 13, 61);



        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
        cards.add(card7);
        cards.add(card8);
        cards.add(card9);
        cards.add(card10);


    }

    public void viewInitialization(){
        toolbar = findViewById(R.id.toolbar);
        scrollView = findViewById(R.id.scroll_view);
    }

    public void addListenerToCardView(){
        adapter.setOnClickListener(new DashboardAdapter.OnDashboardItemClickListener() {

            @Override
            public void onItemClick(int position) {

                switch (position){
                    case 0:
                        itemClickAction(0);
                        break;
                    case 1:
                        itemClickAction(1);
                        break;
                    case 2:
                        itemClickAction(2);
                        break;
                    case 3:
                        itemClickAction(3);
                        break;
                    case 4:
                        itemClickAction(4);
                        break;
                    case 5:
                        itemClickAction(5);
                        break;
                    case 6:
                        itemClickAction(6);
                        break;
                    case 7:
                        itemClickAction(7);
                        break;
                    case 8:
                        itemClickAction(8);
                        break;
                    case 9:
                        itemClickAction(9);
                        break;



                }
            }
        });
    }

    public void itemClickAction(int position){
        Integer getNSectionNotAnsweredQuestions = 0;
        Integer getNSectionQuestions = 0;

        switch (position){
            case 0:
                getNSectionNotAnsweredQuestions = questionDao.get1SectionNotAnsweredQuestions().size();
                getNSectionQuestions = questionDao.get1SectionQuestions().size();
                checkQuestionsQuantityAndCompare(getNSectionNotAnsweredQuestions, getNSectionQuestions, 0);
                break;
            case 1:
                //getNSectionNotAnsweredQuestions = questionDao.get2SectionNotAnsweredQuestions().size();
                //getNSectionQuestions = questionDao.get2SectionQuestions().size();
                //checkQuestionsQuantityAndCompare(getNSectionNotAnsweredQuestions, getNSectionQuestions, position);
                //break;
            case 2:
                getNSectionNotAnsweredQuestions = questionDao.get3SectionNotAnsweredQuestions().size();
                getNSectionQuestions = questionDao.get3SectionQuestions().size();
                checkQuestionsQuantityAndCompare(getNSectionNotAnsweredQuestions, getNSectionQuestions, 2);
                break;
            case 3:
                //getNSectionNotAnsweredQuestions = questionDao.get2SectionNotAnsweredQuestions().size();
                //getNSectionQuestions = questionDao.get2SectionQuestions().size();
                //checkQuestionsQuantityAndCompare(getNSectionNotAnsweredQuestions, getNSectionQuestions, position);
                //break;
            case 4:
                //getNSectionNotAnsweredQuestions = questionDao.get2SectionNotAnsweredQuestions().size();
                //getNSectionQuestions = questionDao.get2SectionQuestions().size();
                //checkQuestionsQuantityAndCompare(getNSectionNotAnsweredQuestions, getNSectionQuestions, position);
                //break;
            case 5:
                //getNSectionNotAnsweredQuestions = questionDao.get2SectionNotAnsweredQuestions().size();
                //getNSectionQuestions = questionDao.get2SectionQuestions().size();
                //checkQuestionsQuantityAndCompare(getNSectionNotAnsweredQuestions, getNSectionQuestions, position);
                //break;
            case 6:
                //getNSectionNotAnsweredQuestions = questionDao.get2SectionNotAnsweredQuestions().size();
                //getNSectionQuestions = questionDao.get2SectionQuestions().size();
                //checkQuestionsQuantityAndCompare(getNSectionNotAnsweredQuestions, getNSectionQuestions, position);
                //break;
            case 7:
                //getNSectionNotAnsweredQuestions = questionDao.get2SectionNotAnsweredQuestions().size();
                //getNSectionQuestions = questionDao.get2SectionQuestions().size();
                //checkQuestionsQuantityAndCompare(getNSectionNotAnsweredQuestions, getNSectionQuestions, position);
                //break;
            case 8:
                //getNSectionNotAnsweredQuestions = questionDao.get2SectionNotAnsweredQuestions().size();
                //getNSectionQuestions = questionDao.get2SectionQuestions().size();
                //checkQuestionsQuantityAndCompare(getNSectionNotAnsweredQuestions, getNSectionQuestions, position);
               //break;
            case 9:
                //getNSectionNotAnsweredQuestions = questionDao.get2SectionNotAnsweredQuestions().size();
                //getNSectionQuestions = questionDao.get2SectionQuestions().size();
                //checkQuestionsQuantityAndCompare(getNSectionNotAnsweredQuestions, getNSectionQuestions, position);
                //break;


        }

    }

    public void checkQuestionsQuantityAndCompare(Integer notAnsweredQuestions, Integer sectionQuestions, int position){
        if (notAnsweredQuestions.equals(sectionQuestions)){
            switch (position){
                case 0:
                    goToQuiz(ALL_QUESTION_FROM_1);
                    break;
                case 1:
                    goToQuiz(ALL_QUESTION_FROM_2);
                    break;
                case 2:
                    goToQuiz(ALL_QUESTION_FROM_3);
                    break;
                case 3:
                    goToQuiz(ALL_QUESTION_FROM_4);
                    break;
                case 4:
                    goToQuiz(ALL_QUESTION_FROM_5);
                    break;
                case 5:
                    goToQuiz(ALL_QUESTION_FROM_6);
                    break;
                case 6:
                    goToQuiz(ALL_QUESTION_FROM_7);
                    break;
                case 7:
                    goToQuiz(ALL_QUESTION_FROM_8);
                    break;
                case 8:
                    goToQuiz(ALL_QUESTION_FROM_9);
                    break;
                case 9:
                    goToQuiz(ALL_QUESTION_FROM_10);
                    break;

            }

        }else {
            goToProgress(position);
        }
    }

    public void daoInitialization(){
        questionAppDatabase =Room.databaseBuilder(getApplicationContext(), QuestionAppDatabase.class,"QuestionsDB" ).allowMainThreadQueries().build();
        questionDao = questionAppDatabase.getQuestionDAO();
    }


}