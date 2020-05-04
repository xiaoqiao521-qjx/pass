package com.example.android_dabao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    /**
     * 跳Fragment1
     */
    private Button mBtn1;
    private Fragment1 fragment;
    /**
     * Main2
     */
    private Button mBtn5;
    private TextView mTvText;


    @Override
    protected void getData() {

    }

    @Override
    protected void getInit() {
        mBtn1 = (Button) findViewById(R.id.btn1);
        mBtn1.setOnClickListener(this);
        mBtn5 = (Button) findViewById(R.id.btn5);
        mTvText = (TextView) findViewById(R.id.tv_text);
        mBtn5.setOnClickListener(this);
        mTvText.setText("你在哪呢");
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
                Intent intent = new Intent(this, Main2Activity.class);
                intent.putExtra("type", "MainActivity");
                startActivity(intent);
                break;
            case R.id.btn5:
                Intent intent2 = new Intent(this, Main2Activity.class);
                startActivity(intent2);
                break;
        }
    }
}
