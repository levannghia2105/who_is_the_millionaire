package com.example.who_is_the_millionaire;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class ScoreArapter extends RecyclerView.Adapter<ScoreArapter.Holer> {

    Context mcontext;
    ArrayList<String> arrayListScore;
    int vitri ;
    public void setvitri(int vitri){
        this.vitri = vitri;
        notifyDataSetChanged();

    }

    public ScoreArapter(Context mcontext, ArrayList<String> arrayListScore) {
        this.mcontext = mcontext;
        this.arrayListScore = arrayListScore;
    }


    @Override


    public ScoreArapter.Holer onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mcontext);
        View groupView = layoutInflater.inflate(R.layout.item_score, parent, false);
        Holer holer = new Holer(groupView);
        return holer;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ScoreArapter.Holer holder, int position) {
        int pos = 15-position ;
        {
            if ((pos)  % 5 == 0) {
                holder.txtScore.setTextColor(Color.parseColor("#FF0000"));

            } else
                holder.txtScore.setTextColor(Color.parseColor("#FFFFFF"));
        }
        holder.txtScore.setText(arrayListScore.get(position).trim());

        if (position==vitri){
            holder.txtScore.setTextColor(Color.parseColor("#9C27B0"));
            holder.txtScore.setBackgroundColor(Color.parseColor("#FF9800"));
        }else
            holder.txtScore.setBackgroundColor(Color.parseColor("#00FF9800"));

    }

    @Override
    public int getItemCount() {
        return arrayListScore.size();
    }

    public class Holer extends RecyclerView.ViewHolder {
        TextView txtScore;

        public Holer(@NonNull @NotNull View itemView) {
            super(itemView);
            txtScore = itemView.findViewById(R.id.txtScore);
        }
    }
}

