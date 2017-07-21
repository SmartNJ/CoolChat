package com.nj.coolchat.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by nimon on 2017/7/21.
 */

public class MessageRecyclerAdapter extends RecyclerView.Adapter {

    private String[] mDataset;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MessageRecyclerViewHolder extends  RecyclerView.ViewHolder{

        public MessageRecyclerViewHolder(View itemView) {
            super(itemView);
        }
//// TODO: 2017/7/21  先画界面。

    }
}
