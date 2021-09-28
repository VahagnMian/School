package com.mianv.school.Activity;

import static com.mianv.school.Util.Util.ALL_QUESTION_FROM_1;
import static com.mianv.school.Util.Util.ALL_QUESTION_FROM_10;
import static com.mianv.school.Util.Util.ALL_QUESTION_FROM_2;
import static com.mianv.school.Util.Util.ALL_QUESTION_FROM_3;
import static com.mianv.school.Util.Util.ALL_QUESTION_FROM_4;
import static com.mianv.school.Util.Util.ALL_QUESTION_FROM_5;
import static com.mianv.school.Util.Util.ALL_QUESTION_FROM_6;
import static com.mianv.school.Util.Util.ALL_QUESTION_FROM_7;
import static com.mianv.school.Util.Util.ALL_QUESTION_FROM_8;
import static com.mianv.school.Util.Util.ALL_QUESTION_FROM_9;
import static com.mianv.school.Util.Util.EIGHTH_SECTION_CARD;
import static com.mianv.school.Util.Util.FIFTH_SECTION_CARD;
import static com.mianv.school.Util.Util.FIRST_SECTION_CARD;
import static com.mianv.school.Util.Util.FOURTH_SECTION_CARD;
import static com.mianv.school.Util.Util.NINTH_SECTION_CARD;
import static com.mianv.school.Util.Util.SECOND_SECTION_CARD;
import static com.mianv.school.Util.Util.SEVENTH_SECTION_CARD;
import static com.mianv.school.Util.Util.SIXTH_SECTION_CARD;
import static com.mianv.school.Util.Util.TENTH_SECTION_CARD;
import static com.mianv.school.Util.Util.THIRD_SECTION_CARD;
import static com.mianv.school.Util.Util.codeExtraProgress;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

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
    //private   ScrollView scrollView;
    private   QuestionAppDatabase questionAppDatabase;
    private   QuestionDao questionDao;
    boolean flag = false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(null);
        setContentView(R.layout.activity_main);


        flag = true;


        daoInitialization();
        viewInitialization();
        createRecyclerView();
        addTestItemsToRecyclerView();
       // OverScrollDecoratorHelper.setUpOverScroll(scrollView);
        loadQuestionsToRoom();
        addListenerToCardView();


    }


    @Override
    protected void onResume() {
        super.onResume();
        if (flag){
            daoInitialization();
            viewInitialization();
            createRecyclerView();
            addTestItemsToRecyclerView();
            //OverScrollDecoratorHelper.setUpOverScroll(scrollView);
            loadQuestionsToRoom();
            addListenerToCardView();
        }
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
            for (int i = 0; i < Constants.allQuestions.length; i++) {
                questionAppDatabase.getQuestionDAO().addQuestion(Constants.allQuestions[i]);
            }

        }


    }

    public void createRecyclerView(){
        cards = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        adapter = new DashboardAdapter(cards);
        layoutManager = new GridLayoutManager(this, 2 );
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
       // recyclerView.setNestedScrollingEnabled(false);


    }





    public void addTestItemsToRecyclerView(){

        int get1SectionCorrect = questionDao.get1SectionCorrectQuestions().size();
            int get1SectionAll = questionDao.get1SectionQuestions().size();

        int get2SectionCorrect = questionDao.get2SectionCorrectQuestions().size();
            int get2SectionAll = questionDao.get2SectionQuestions().size();

        int get3SectionCorrect = questionDao.get3SectionCorrectQuestions().size();
             int get3SectionAll = questionDao.get3SectionQuestions().size();

        int get4SectionCorrect = questionDao.get4SectionCorrectQuestions().size();
            int get4SectionAll = questionDao.get4SectionQuestions().size();

        int get5SectionCorrect = questionDao.get5SectionCorrectQuestions().size();
            int get5SectionAll = questionDao.get5SectionQuestions().size();

        int get6SectionCorrect = questionDao.get6SectionCorrectQuestions().size();
            int get6SectionAll = questionDao.get6SectionQuestions().size();

        int get7SectionCorrect = questionDao.get7SectionCorrectQuestions().size();
            int get7SectionAll = questionDao.get7sectionQuestions().size();

        int get8SectionCorrect = questionDao.get8SectionCorrectQuestions().size();
             int get8SectionAll = questionDao.get8sectionQuestions().size();

        int get9SectionCorrect = questionDao.get9SectionCorrectQuestions().size();
            int get9SectionAll = questionDao.get9sectionQuestions().size();

        int get10SectionCorrect = questionDao.get10SectionCorrectQuestions().size();
            int get10SectionAll = questionDao.get10sectionQuestions().size();



        Card card1 = new Card(R.drawable.ic_arrows,"Թեմա 1" , "Մանևրում, դասավորվածություն \nերթևեկաելի \nմասում..." , get1SectionCorrect, get1SectionAll);
        Card card2 = new Card(R.drawable.ic_law_hummer,"Թեմա 2" , "Օրենք" , get2SectionCorrect, get2SectionAll);
        Card card3 = new Card(R.drawable.ic_gears,"Թեմա 3" , "Շահագործում" , get3SectionCorrect, get3SectionAll);
        Card card4 = new Card(R.drawable.ic_road_sign,"Թեմա 4" , "Նշաններ" , get4SectionCorrect, get4SectionAll);
        Card card5 = new Card(R.drawable.ic_cross_road_1,"Թեմա 5" , "Խաչմերուկ 1" , get5SectionCorrect, get5SectionAll);
        Card card6 = new Card(R.drawable.ic_cross_road_2,"Թեմա 6" , "Խաչմերուկ 2" , get6SectionCorrect, get6SectionAll);
        Card card7 = new Card(R.drawable.ic_parking,"Թեմա 7" , "Ճանապարհային գծանշում, կանգառ, կայանում" , get7SectionCorrect, get7SectionAll);
        Card card8 = new Card(R.drawable.ic_big_car,"Թեմա 8" , "Արագություն, քարշակում, մարդկանց և բեռնեռրի փոխադրում" , get8SectionCorrect, get8SectionAll);
        Card card9 = new Card(R.drawable.ic_waning_polygon,"Թեմա 9" , "Նախազգուշացնող ազդանշաններ, հատուկ ազդանշաններ․․․" , get9SectionCorrect, get9SectionAll);
        Card card10 = new Card(R.drawable.ic_medkit,"Թեմա 10" , "Երթևեկության մասնակիցների կյանքի անվտանգություն․․․" , get10SectionCorrect, get10SectionAll);



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
        //toolbar = findViewById(R.id.toolbar);
        //scrollView = findViewById(R.id.scroll_view);
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
                getNSectionNotAnsweredQuestions = questionDao.get2SectionNotAnsweredQuestions().size();
                getNSectionQuestions = questionDao.get2SectionQuestions().size();
                checkQuestionsQuantityAndCompare(getNSectionNotAnsweredQuestions, getNSectionQuestions, 1);
                break;
            case 2:
                getNSectionNotAnsweredQuestions = questionDao.get3SectionNotAnsweredQuestions().size();
                getNSectionQuestions = questionDao.get3SectionQuestions().size();
                checkQuestionsQuantityAndCompare(getNSectionNotAnsweredQuestions, getNSectionQuestions, 2);
                break;
            case 3:
                getNSectionNotAnsweredQuestions = questionDao.get4SectionNotAnsweredQuestions().size();
                getNSectionQuestions = questionDao.get4SectionQuestions().size();
                checkQuestionsQuantityAndCompare(getNSectionNotAnsweredQuestions, getNSectionQuestions, 3);
                break;
            case 4:
                getNSectionNotAnsweredQuestions = questionDao.get5SectionNotAnsweredQuestions().size();
                getNSectionQuestions = questionDao.get5SectionQuestions().size();
                checkQuestionsQuantityAndCompare(getNSectionNotAnsweredQuestions, getNSectionQuestions, 4);
                break;
            case 5:
                getNSectionNotAnsweredQuestions = questionDao.get6SectionNotAnsweredQuestions().size();
                getNSectionQuestions = questionDao.get6SectionQuestions().size();
                checkQuestionsQuantityAndCompare(getNSectionNotAnsweredQuestions, getNSectionQuestions, 5);
                break;
            case 6:
                getNSectionNotAnsweredQuestions = questionDao.get7SectionNotAnsweredQuestions().size();
                getNSectionQuestions = questionDao.get7sectionQuestions().size();
                checkQuestionsQuantityAndCompare(getNSectionNotAnsweredQuestions, getNSectionQuestions, 6);
                break;
            case 7:
                getNSectionNotAnsweredQuestions = questionDao.get8SectionNotAnsweredQuestions().size();
                getNSectionQuestions = questionDao.get8sectionQuestions().size();
                checkQuestionsQuantityAndCompare(getNSectionNotAnsweredQuestions, getNSectionQuestions, 7);
                break;
            case 8:
                getNSectionNotAnsweredQuestions = questionDao.get9SectionNotAnsweredQuestions().size();
                getNSectionQuestions = questionDao.get9sectionQuestions().size();
                checkQuestionsQuantityAndCompare(getNSectionNotAnsweredQuestions, getNSectionQuestions, 8);
               break;
            case 9:
                getNSectionNotAnsweredQuestions = questionDao.get10SectionNotAnsweredQuestions().size();
                getNSectionQuestions = questionDao.get10sectionQuestions().size();
                checkQuestionsQuantityAndCompare(getNSectionNotAnsweredQuestions, getNSectionQuestions, 9);
                break;


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