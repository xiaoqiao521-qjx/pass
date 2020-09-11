package com.example.android_dabao;

import android.hardware.Camera;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity implements View.OnClickListener {


    /**
     * 跳2
     */
    private Button mBtn1;
    /**
     * 跳22
     */
    private Button mBtn2;
    private Camera.Parameters parameter;
    private Camera camera;

    @Override
    protected void getData() {

    }

    @Override
    protected void getInit() {
        mBtn1 = (Button) findViewById(R.id.btn1);
        mBtn1.setOnClickListener(this);
       /* mBtn2 = (Button) findViewById(R.id.btn2);
        mBtn2.setOnClickListener(this);*/
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
                camera = Camera.open();

                camera.startPreview();

                parameter = camera.getParameters();

                parameter.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);

                camera.setParameters(parameter);
                break;
            case R.id.btn2:

                //我的啊是这东西非常









                parameter = camera.getParameters();
                parameter.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
                camera.setParameters(parameter);

                break;
        }
    }
}
