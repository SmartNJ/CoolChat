package com.nj.coolchat.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.nj.coolchat.ui.fragment.ContactsFragment;
import com.nj.coolchat.ui.fragment.DiscoveryFragment;
import com.nj.coolchat.ui.fragment.MeFragment;
import com.nj.coolchat.ui.fragment.RecentMessageFragment;

/**
 * Created by nimon on 2017/7/21.
 */

public class MessagePagerAdapter extends FragmentStatePagerAdapter {

    Fragment mFragment;

    public MessagePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                mFragment = new RecentMessageFragment();
                break;
            case 1:
                mFragment = new ContactsFragment();
                break;
            case 2:
                mFragment = new DiscoveryFragment();
                break;
            case 3:
                mFragment = new MeFragment();
                break;
        }
        return mFragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
