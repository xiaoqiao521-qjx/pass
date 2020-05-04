package com.example.android_dabao;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main9Activity extends AppCompatActivity {

    private TextView mTv9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        initView();
    }

    private void initView() {
        mTv9 = (TextView) findViewById(R.id.tv9);
        mTv9.setText("tv9");
    }
}
