package com.nj.coolchat.ui.activity;

import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.nj.coolchat.R;
import com.nj.coolchat.ui.adapter.MessagePagerAdapter;
import com.nj.coolchat.ui.base.BaseActivity;

import butterknife.BindView;

import static com.nj.coolchat.R.id.llMessage;

/**
 * Created by nimon on 2017/7/21.
 */

public class WeChatMainActivity extends BaseActivity implements ViewPager.OnPageChangeListener {

    @BindView(R.id.vpContent)
    ViewPager mVpContent;
    MessagePagerAdapter msgPagerAdapter;


    @BindView(llMessage)
    LinearLayout mLlMessage;
    @BindView(R.id.tvMessageTextNormal)
    TextView mTvMessageTextNormal;
    @BindView(R.id.tvMessageTextPress)
    TextView mTvMessageTextPress;
    @BindView(R.id.tvMessageIconNormal)
    TextView mTvMessageIconNormal;
    @BindView(R.id.tvMessageIconPress)
    TextView mTvMessageIconPress;
    @BindView(R.id.tvMessageCount)
    TextView mTvMessageCount;


    @BindView(R.id.llContacts)
    LinearLayout mLlContacts;
    @BindView(R.id.tvContactsTextNormal)
    TextView mTvContactsTextNormal;
    @BindView(R.id.tvContactsTextPress)
    TextView mTvContactsTextPress;
    @BindView(R.id.tvContactsIconNormal)
    TextView mTvContactsIconNormal;
    @BindView(R.id.tvContactsIconPress)
    TextView mTvContactsIconPress;
    @BindView(R.id.tvContactsCount)
    TextView mTvContactsCount;
    @BindView(R.id.tvContactsRedDot)
    TextView mTvContactsRedDot;


    @BindView(R.id.llDiscovery)
    LinearLayout mLlDiscovery;
    @BindView(R.id.tvDiscoveryTextNormal)
    TextView mTvDiscoveryTextNormal;
    @BindView(R.id.tvDiscoveryTextPress)
    TextView mTvDiscoveryTextPress;
    @BindView(R.id.tvDiscoveryIconNormal)
    TextView mTvDiscoveryIconNormal;
    @BindView(R.id.tvDiscoveryIconPress)
    TextView mTvDiscoveryIconPress;
    @BindView(R.id.tvDiscoveryCount)
    TextView mTvDiscoveryCount;


    @BindView(R.id.llMe)
    LinearLayout mLlMe;
    @BindView(R.id.tvMeTextNormal)
    TextView mTvMeTextNormal;
    @BindView(R.id.tvMeTextPress)
    TextView mTvMeTextPress;
    @BindView(R.id.tvMeIconNormal)
    TextView mTvMeIconNormal;
    @BindView(R.id.tvMeIconPress)
    TextView mTvMeIconPress;
    @BindView(R.id.tvMeCount)
    TextView mTvMeCount;


    @Override
    public void init() {
    }

    @Override
    public void initView() {
        setTransparency();

        //默认选中第一个
        mTvMessageIconPress.getBackground().setAlpha(255);
        mTvMessageTextPress.setTextColor(Color.argb(255, 153, 153, 153));

        msgPagerAdapter = new MessagePagerAdapter(getSupportFragmentManager());
        mVpContent.setAdapter(msgPagerAdapter);

    }


    /**
     * 重置press的图标和文字的透明度
     */
    private void setTransparency() {
        mTvMessageIconNormal.getBackground().setAlpha(255);
        mTvContactsIconNormal.getBackground().setAlpha(255);
        mTvDiscoveryIconNormal.getBackground().setAlpha(255);
        mTvMeIconNormal.getBackground().setAlpha(255);

        mTvMessageIconPress.getBackground().setAlpha(1);
        mTvContactsIconPress.getBackground().setAlpha(1);
        mTvDiscoveryIconPress.getBackground().setAlpha(1);
        mTvMeIconPress.getBackground().setAlpha(1);

        mTvMessageTextNormal.setTextColor(Color.argb(255, 153, 153, 153));
        mTvContactsTextNormal.setTextColor(Color.argb(255, 153, 153, 153));
        mTvDiscoveryTextNormal.setTextColor(Color.argb(255, 153, 153, 153));
        mTvMeTextNormal.setTextColor(Color.argb(255, 153, 153, 153));

        mTvMessageTextPress.setTextColor(Color.argb(0, 69, 192, 26));
        mTvContactsTextPress.setTextColor(Color.argb(0, 69, 192, 26));
        mTvDiscoveryTextPress.setTextColor(Color.argb(0, 69, 192, 26));
        mTvMeTextPress.setTextColor(Color.argb(0, 69, 192, 26));
    }

    @Override
    public void initData() {
        super.initData();
    }

    @Override
    public void initListener() {

        mVpContent.setOnPageChangeListener(this);

        mLlMessage.setOnClickListener(v -> bottomBtnClick(v));
        mLlContacts.setOnClickListener(v -> bottomBtnClick(v));
        mLlDiscovery.setOnClickListener(v -> bottomBtnClick(v));
        mLlMe.setOnClickListener(v -> bottomBtnClick(v));
    }

    private void bottomBtnClick(View view) {
        setTransparency();
        switch (view.getId()) {
            case R.id.llMessage:
                mVpContent.setCurrentItem(0, false);
                mTvMessageIconPress.getBackground().setAlpha(255);
                mTvMessageTextPress.setTextColor(Color.argb(255, 69, 192, 26));
                break;
            case R.id.llContacts:
                mVpContent.setCurrentItem(1, false);
                mTvContactsIconPress.getBackground().setAlpha(255);
                mTvContactsTextPress.setTextColor(Color.argb(255, 69, 192, 26));
                break;
            case R.id.llDiscovery:
                mVpContent.setCurrentItem(2, false);
                mTvDiscoveryIconPress.getBackground().setAlpha(255);
                mTvDiscoveryTextPress.setTextColor(Color.argb(255, 69, 192, 26));
                break;
            case R.id.llMe:
                mVpContent.setCurrentItem(3, false);
                mTvMeIconPress.getBackground().setAlpha(255);
                mTvMeTextPress.setTextColor(Color.argb(255, 69, 192, 26));
                break;
        }
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_wechat_main;
    }


    /**
     * @param position             当前你滑动的页面
     * @param positionOffset       当前页面偏移的百分比
     * @param positionOffsetPixels 当前页面的偏移像素
     */
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        int transparency_one = (int) (255 * positionOffset);
        int transparency_two = (int) (255 * (1 - positionOffset));
        System.out.println("transparency_one" + transparency_one);
        System.out.println("transparency_two" + transparency_two);
        switch (position) {
            case 0:
                mTvMessageTextPress.setTextColor(Color.argb(transparency_two, 69, 192, 26));
                mTvMessageTextNormal.setTextColor(Color.argb(transparency_one, 153,153,153));
                mTvContactsTextPress.setTextColor(Color.argb(transparency_one, 69, 192, 26));
                mTvContactsTextNormal.setTextColor(Color.argb(transparency_two,153,153,153));
                mTvMessageIconNormal.getBackground().setAlpha(transparency_one);
                mTvMessageIconPress.getBackground().setAlpha(transparency_two);
                mTvContactsIconPress.getBackground().setAlpha(transparency_one);
                mTvContactsIconNormal.getBackground().setAlpha(transparency_two);
                break;
            case 1:
                mTvContactsTextPress.setTextColor(Color.argb(transparency_two, 69, 192, 26));
                mTvContactsTextNormal.setTextColor(Color.argb(transparency_one, 153,153,153));
                mTvDiscoveryTextPress.setTextColor(Color.argb(transparency_one, 69, 192, 26));
                mTvDiscoveryTextNormal.setTextColor(Color.argb(transparency_two,153,153,153));
                mTvContactsIconNormal.getBackground().setAlpha(transparency_one);
                mTvContactsIconPress.getBackground().setAlpha(transparency_two);
                mTvDiscoveryIconPress.getBackground().setAlpha(transparency_one);
                mTvDiscoveryIconNormal.getBackground().setAlpha(transparency_two);
                break;
            case 2:
                mTvDiscoveryTextPress.setTextColor(Color.argb(transparency_two, 69, 192, 26));
                mTvDiscoveryTextNormal.setTextColor(Color.argb(transparency_one, 153,153,153));
                mTvMeTextPress.setTextColor(Color.argb(transparency_one, 69, 192, 26));
                mTvMeTextNormal.setTextColor(Color.argb(transparency_two,153,153,153));
                mTvDiscoveryIconNormal.getBackground().setAlpha(transparency_one);
                mTvDiscoveryIconPress.getBackground().setAlpha(transparency_two);
                mTvMeIconPress.getBackground().setAlpha(transparency_one);
                mTvMeIconNormal.getBackground().setAlpha(transparency_two);
                break;

        }
        System.out.println("onPageScrolled 当前页面 position:" + position);
        System.out.println("onPageScrolled 下一个可能的页面 position+1:" + (position + 1));
        //        System.out.println("onPageScrolled 当前 positionOffset:"+positionOffset);
        //        System.out.println("onPageScrolled 当前 positionOffsetPixels:"+positionOffsetPixels);
    }

    /**
     * 页面移动完毕后调用
     *
     * @param position 当前移动完毕后的页面
     */
    @Override
    public void onPageSelected(int position) {
        System.out.println("onPageSelected 当前 position:" + position);

    }


    /**
     * state 0: 什么也没做， 1: 正在滑动 2: 滑动完毕    1->2->0
     *
     * @param state SCROLL_STATE_DRAGGING -> SCROLL_STATE_SETTLING -> SCROLL_STATE_IDLE
     */
    @Override
    public void onPageScrollStateChanged(int state) {
        System.out.println("onPageScrollStateChanged 当前 state:" + state);

    }
}
