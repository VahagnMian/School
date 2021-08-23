package com.mianv.school.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ScrollView;


import com.mianv.school.Adapter.DashboardAdapter;
import com.mianv.school.Model.Card;
import com.mianv.school.R;

import java.util.ArrayList;
import java.util.Calendar;

import me.everything.android.ui.overscroll.OverScrollDecoratorHelper;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerView;
    DashboardAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Card> cards;
     ScrollView scrollView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewInitialization();
        createRecyclerView();
        addTestItemsToRecyclerView();
        OverScrollDecoratorHelper.setUpOverScroll(scrollView);








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

}