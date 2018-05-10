package com.ivy.baseproject.test.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cg.baseproject.base.BaseActivity;
import com.cg.baseproject.base.BaseSupportActivity;
import com.ivy.baseproject.test.R;

public class SampleFragmentActivity extends BaseSupportActivity {

    @Override
    protected int getActivityLayoutId() {
        return R.layout.activity_samplefragment_main;
    }

    @Override
    protected void initView() {
        
    }

    @Override
    protected void registerListener() {

    }

    @Override
    protected void initData() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getActivityLayoutId());
        //因为BaseActivity的BufferKnife已经做过绑定view，因此子类不需要再进行绑定unbinder = ButterKnife.bind(this);
    }

    @Override
    protected void setScreenManager() {
        super.isScreenPortrait = true;
        super.isFullScreen = true;
        super.isScreenPortrait = true;
    }

}
