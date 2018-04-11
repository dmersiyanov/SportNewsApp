package com.example.dmitrymersiyanov.mobidoo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private final int BIG_CARD = 1;
    private final int SMALL_CARD = 2;

    private String[] mDataset = {"Football", "BasketBall", "VolleyBall", "Hockey", "Other news"};


//    public NewsAdapter() {
////        this.mDataset = mDataset;
//    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());


        if(viewType == BIG_CARD) {
            ViewHolder viewHolder = new ViewHolder(layoutInflater.inflate(R.layout.rv_item_news_big, parent, false));
            return viewHolder;
        } else {
            ViewHolder viewHolder = new ViewHolder(layoutInflater.inflate(R.layout.rv_item_news, parent, false));
            return viewHolder;
        }

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mNewsTitle.setText(mDataset[position]);
    }

    @Override
    public int getItemViewType(int position) {
        if(position % 2 == 0) return BIG_CARD;
        else return SMALL_CARD;
    }


    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mNewsTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            mNewsTitle = itemView.findViewById(R.id.news_title);
        }
    }


}
