package com.example.android_dabao;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main5Activity extends AppCompatActivity {

    /**
     * m5
     */
    private TextView mM5Tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        initView();
    }

    private void initView() {
        mM5Tv = (TextView) findViewById(R.id.m5_tv);
        mM5Tv.setText("你说呢");
        mM5Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mM5Tv.setText("按这个是大学是这东西非常");
            }
        });


    }
}
