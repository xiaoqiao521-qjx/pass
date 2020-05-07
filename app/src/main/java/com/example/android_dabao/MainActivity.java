package com.example.android_dabao;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity implements View.OnClickListener {


    /**
     * 跳2
     */
    private Button mBtn1;
    /**
     * 跳22
     */
    private Button mBtn2;

    @Override
    protected void getData() {

    }

    @Override
    protected void getInit() {
        mBtn1 = (Button) findViewById(R.id.btn1);
        mBtn1.setOnClickListener(this);
        mBtn2 = (Button) findViewById(R.id.btn2);
        mBtn2.setOnClickListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }




    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.btn1:
                 ActivityUtils.goNextActivitySign(this,Main2Activity.class,2);
                break;
            case R.id.btn2:
                ActivityUtils.goNextActivitySign(this,Main2Activity.class,2);

                break;
        }
    }
}
