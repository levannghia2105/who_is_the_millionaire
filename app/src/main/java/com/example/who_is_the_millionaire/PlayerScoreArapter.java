package com.example.who_is_the_millionaire;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PlayerScoreArapter extends RecyclerView.Adapter<PlayerScoreArapter.Holer> {
    Context mcontext ;
    ArrayList<PlayerGame> arrayList ;

    public PlayerScoreArapter(Context mcontext, ArrayList<PlayerGame> arrayList) {
        this.mcontext = mcontext;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public PlayerScoreArapter.Holer onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mcontext);
        View view = layoutInflater.inflate(R.layout.item_player_score,parent,false);
        Holer holer = new Holer(view);
        return holer;
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerScoreArapter.Holer holder, int position) {
            PlayerGame playerGame = arrayList.get(position);
            holder.txtPlayerName.setText(playerGame.getName());
            holder.txtPlayerScore.setText(playerGame.getScore());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class Holer extends RecyclerView.ViewHolder {
        ImageView img ;
        TextView txtPlayerName ,txtPlayerScore ;

        public Holer(@NonNull View itemView) {
            super(itemView);
           img = itemView.findViewById(R.id.img_Player_Score);
           txtPlayerName = itemView.findViewById(R.id.txt_Player_Name);
           txtPlayerScore = itemView.findViewById(R.id.txt_Player_Score);
        }
    }
}
