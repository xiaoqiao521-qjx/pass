package com.example.android_dabao;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main8Activity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTv;
    private TextView mTvvv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        initView();
    }

    private void initView() {

        mTv = (TextView) findViewById(R.id.tv);
        mTv.setText("修改m8");

        mTv.setOnClickListener(this);
        mTvvv = (TextView) findViewById(R.id.tvvv);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.tv:
                break;
        }
    }
}
