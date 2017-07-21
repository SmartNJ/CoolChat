package com.nj.coolchat.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.nj.coolchat.ui.fragment.RecentMessageFragment;

/**
 * Created by nimon on 2017/7/21.
 */

public class MessagePagerAdapter extends FragmentStatePagerAdapter {

    public MessagePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        RecentMessageFragment fragment = new RecentMessageFragment();
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
