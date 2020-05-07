package com.example.android_dabao;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class ActivityUtils {
    /**
     * 跳转带参数
     */
    public static void goNextActivityBundle(Context context, Class clazz,
                                            Bundle bundle) {
        Intent intent = new Intent(context, clazz);
        intent.putExtras(bundle);
        context.startActivity(intent);
//        ((Activity) context).overridePendingTransition(R.anim.slide_left_in,
//                R.anim.fade_out_long_animation);
    }

    /**
     * 跳转带标志
     */

    public static void goNextActivitySign(Context context, Class clazz,
                                          int sign) {
        Intent intent = new Intent(context, clazz);
        intent.putExtra("title",sign);
        context.startActivity(intent);

    }

    /**
     * 跳转打印小票页面 显示不同的Fragment
     */
    public static void goNextActivityName(Context context,Class clazz,String type){
        Intent intent = new Intent(context, clazz);
        intent.putExtra("title",type);
        context.startActivity(intent);

    }
}
