package com.example.android_dabao;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main4Activity extends AppCompatActivity {

    private TextView mM4;
    private TextView mM4Tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        initView();
    }

    private void initView() {
        mM4 = (TextView) findViewById(R.id.m4);
        mM4Tv = (TextView) findViewById(R.id.m4_tv);
        mM4.setText("asdfdxcv");
        mM4Tv.setText("新的文字");
        mM4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mM4Tv.setText("于同年回国反驳对方");
            }
        });

    }
}
