package com.nj.coolchat.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nj.coolchat.R;

/**
 * Created by nimon on 2017/7/21.
 */

public class MessageRecyclerAdapter extends RecyclerView.Adapter<MessageRecyclerAdapter.MessageRecyclerViewHolder> {

    private String[] mDataset;

    @Override
    public MessageRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recent_message, parent, false);
        MessageRecyclerViewHolder vh = new MessageRecyclerViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(MessageRecyclerViewHolder holder, int position) {
//        System.out.println("onBindViewHolder 中的position ：" + position);
        holder.tvDisplayName.setText("小宇宙");
        holder.tvTime.setText("15:34");
        holder.tvContent.setText("你好");
    }


    @Override
    public int getItemCount() {
        return 60;
    }

    public class MessageRecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView tvDisplayName;
        TextView tvTime;
        TextView tvContent;
        TextView tvDraft;

        public MessageRecyclerViewHolder(View itemView) {
            super(itemView);
            tvDisplayName = (TextView) itemView.findViewById(R.id.tvDisplayName);
            tvTime = (TextView) itemView.findViewById(R.id.tvTime);
            tvContent = (TextView) itemView.findViewById(R.id.tvContent);
            tvDraft = (TextView) itemView.findViewById(R.id.tvDraft);
        }
        //ViewHolder主要做什么？
        //主要是获取这个ItemView中的某些view，那是不是每次新增view，都要在这里findViewById一次呢？

        //        public static View getView(int resId, int )


    }
}
