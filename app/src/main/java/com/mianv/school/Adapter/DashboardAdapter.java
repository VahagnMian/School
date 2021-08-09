package com.mianv.school.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.mianv.school.Model.Card;
import com.mianv.school.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.DashboardViewHolder>{

    ArrayList<Card> cards;

    public DashboardAdapter(ArrayList<Card> cards){
        this.cards = cards;
    }


    @Override
    public DashboardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.section_item_main , parent, false );
        return new DashboardViewHolder(v);
    }

    @Override
    public void onBindViewHolder(DashboardAdapter.DashboardViewHolder holder, int position) {

        Card card = cards.get(position);

        int completeQuestions = card.getCompleteQuestions();
        int allSectionQuestions = card.getAllSectionQuestions();
        String finalResult = completeQuestions +  "/" + allSectionQuestions;

        holder.cardImage.setImageResource(card.getImageResId());
        holder.completeQuestions.setText(finalResult);
        holder.cardTitleTextView.setText(card.getCardTitle());
        holder.cardDescTextView.setText(card.getCardDescription());

    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

    public class DashboardViewHolder extends RecyclerView.ViewHolder{
        ImageView cardImage;
        TextView cardTitleTextView;
        TextView cardDescTextView;
        TextView completeQuestions;



        public DashboardViewHolder(View itemView) {
            super(itemView);


            cardImage = itemView.findViewById(R.id.cardImageSection);
            cardTitleTextView = itemView.findViewById(R.id.section_title);
            cardDescTextView = itemView.findViewById(R.id.section_description);
            completeQuestions = itemView.findViewById(R.id.cardCompleteQuestionQuantity);


        }
    }

}
