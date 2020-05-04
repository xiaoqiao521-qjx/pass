package com.example.android_dabao;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main10Activity extends AppCompatActivity {


    private TextView mTv200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        initView();

    }

    private void initView() {
        mTv200 = (TextView) findViewById(R.id.tv200);
        mTv200.setText("m1000000");
    }
}
