package com.example.android_dabao;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Main3Activity extends AppCompatActivity {

    private Fragment currentFragment=new Fragment();
    private Fragment1 fragment1=new Fragment1();
    private Fragment2 fragment2=new Fragment2();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.e("TAG", "onCreate: +Main3Activity" );
        initView();
    }

    private void initView() {
        Intent intent = getIntent();
        String type = intent.getStringExtra("type");
        if(type.equals("MainActivity")){
            switchFragment(fragment1).commit();
        }else {
            switchFragment(fragment2).commit();
        }


    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("TAG", "onDestroy: 消耗Activity");
    }

    //Fragment优化
    private FragmentTransaction switchFragment(Fragment targetFragment) {

        FragmentTransaction transaction = getSupportFragmentManager()
                .beginTransaction();
        if (!targetFragment.isAdded()) {
            //第一次使用switchFragment()时currentFragment为null，所以要判断一下
            if (currentFragment != null) {
                transaction.hide(currentFragment);
            }
            transaction.add(R.id.frame, targetFragment,targetFragment.getClass().getName());

        } else {
            transaction
                    .hide(currentFragment)
                    .show(targetFragment);
        }
        currentFragment = targetFragment;
        return   transaction;
    }
}
