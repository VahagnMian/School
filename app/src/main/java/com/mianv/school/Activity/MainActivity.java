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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = findViewById(R.id.toolbar);
        //getSupportActionBar().setElevation(0);



        createRecyclerView();
        Card card = new Card(R.drawable.section_arrows_2,"Թեմա 1" , "Մանևրում, դասավորվածություն \nnերթևեկաելի \nnմասում..." , 13, 61);
        Card card1 = new Card(R.drawable.section_arrows_2,"Թեմա 1" , "Մանևրում, դասավորվածություն \nnերթևեկաելի \nnմասում..." , 13, 61);

        cards.add(card);
        cards.add(card1);
        cards.add(card1);
        cards.add(card1);
        cards.add(card1);
        cards.add(card1);
        cards.add(card1);
        cards.add(card1);
        cards.add(card1);
        cards.add(card1);

        ScrollView scrollView = (ScrollView) findViewById(R.id.scroll_view);
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
       // OverScrollDecoratorHelper.setUpOverScroll(recyclerView, OverScrollDecoratorHelper.ORIENTATION_VERTICAL);

    }

}