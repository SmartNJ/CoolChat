package com.nj.coolchat.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by nimon on 2017/7/20.
 */

public abstract class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();

        setContentView(provideContentViewId());
        //子类不需要再绑定butter knife了
        ButterKnife.bind(this);
        initView();


        initData();

        initListener();
    }

    //在setContentView()调用之前调用，可以设置WindowFeature(如：
    // this.requestWindowFeature(Window.FEATURE_NO_TITLE);)
    public void init(){}

    public void initView(){}

    public void initData(){}

    public void initListener(){}

    protected abstract int provideContentViewId();

}
