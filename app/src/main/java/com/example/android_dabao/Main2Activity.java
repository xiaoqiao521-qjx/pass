package com.example.android_dabao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 跳Fragment2
     */
    private Button mBtn2;
    private TextView mTv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        mBtn2 = (Button) findViewById(R.id.btn2);
        mBtn2.setOnClickListener(this);
        mTv2 = (TextView) findViewById(R.id.tv2);
        getBarTitle();
    }

    private void getBarTitle() {
        Intent intent = getIntent();
        int title = intent.getIntExtra("title",0);
        if (title==2){
          mTv2.setText("我的哈哈");
      }else {
          mTv2.setText("ni的哈哈");
      }


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.btn2:
                Intent intent = new Intent(this, Main3Activity.class);
                intent.putExtra("type", "Main3Activity");
                startActivity(intent);
                break;
        }
    }
}
