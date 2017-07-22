package com.nj.coolchat.ui.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.nj.coolchat.R;
import com.nj.coolchat.ui.adapter.MessageRecyclerAdapter;
import com.nj.coolchat.ui.base.BaseFragment;

import butterknife.BindView;

/**
 * Created by nimon on 2017/7/21.
 */

public class RecentMessageFragment extends BaseFragment {

    @BindView(R.id.rvRecentMessage)
    RecyclerView rvRecentMessage;
    MessageRecyclerAdapter msgRecyclerAdapter;

    RecyclerView.LayoutManager mLayoutManager;


    @Override
    public void initView(View rootView) {
        mLayoutManager = new LinearLayoutManager(rootView.getContext());
        rvRecentMessage.setLayoutManager(mLayoutManager);
        msgRecyclerAdapter = new MessageRecyclerAdapter();
        rvRecentMessage.setAdapter(msgRecyclerAdapter);

    }


    @Override
    protected int provideContentViewId() {
        return R.layout.fragment_recent_message;
    }
}
