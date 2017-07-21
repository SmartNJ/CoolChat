package com.nj.coolchat.ui.activity;

import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.nj.coolchat.R;
import com.nj.coolchat.ui.base.BaseActivity;

import butterknife.BindView;

/**
 * Created by nimon on 2017/7/21.
 */

public class WeChatMainActivity extends BaseActivity {

    @BindView(R.id.llMessage)
    LinearLayout mLlMessage;
    @BindView(R.id.tvMessageTextNormal)
    TextView  mTvMessageTextNormal;
    @BindView(R.id.tvMessageTextPress)
    TextView  mTvMessageTextPress;
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
    TextView  mTvDiscoveryTextNormal;
    @BindView(R.id.tvDiscoveryTextPress)
    TextView  mTvDiscoveryTextPress;
    @BindView(R.id.tvDiscoveryIconNormal)
    TextView mTvDiscoveryIconNormal;
    @BindView(R.id.tvDiscoveryIconPress)
    TextView mTvDiscoveryIconPress;
    @BindView(R.id.tvDiscoveryCount)
    TextView mTvDiscoveryCount;


    @BindView(R.id.llMe)
    LinearLayout mLlMe;
    @BindView(R.id.tvMeTextNormal)
    TextView  mTvMeTextNormal;
    @BindView(R.id.tvMeTextPress)
    TextView  mTvMeTextPress;
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
    }

    /**
     *     设置press的图标和文字的透明度
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
        super.initListener();
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_wechat_main;
    }
}