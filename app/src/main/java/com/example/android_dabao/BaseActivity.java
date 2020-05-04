package com.example.android_dabao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        getInit();
        getData();
    }

    protected abstract void getData();

    protected abstract void getInit();

    protected abstract int getLayoutId();
}
