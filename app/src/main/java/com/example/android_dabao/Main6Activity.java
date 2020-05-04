package com.example.android_dabao;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main6Activity extends AppCompatActivity {

    private TextView mM6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        initView();
    }

    private void initView() {
        mM6 = (TextView) findViewById(R.id.m6);
    }
}
