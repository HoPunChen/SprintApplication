package com.example.hopunchen.sprintapplication.utils;

import android.util.Log;

/**
 *项目名：  SprintApplication
 *包名：    com.example.hopunchen.sprintapplication.utils
 *文件名:   L
 *创建者:   CHB
 *创建时间:  2017/2/23 22:40
 *描述：    Log封装类
 */
public class L {

    //开关
    public static final  boolean DEBUG = true;
    //TAG
    public static final String TAG = "Smartbutler";

    //五个等级  DIWE

    public static void d(String text){
        if(DEBUG){
            Log.d(TAG,text);
        }
    }

    public static void i(String text){
        if(DEBUG){
            Log.i(TAG,text);
        }
    }

    public static void w(String text){
        if(DEBUG){
            Log.w(TAG,text);
        }
    }

    public static void e(String text){
        if(DEBUG){
            Log.e(TAG,text);
        }
    }
}

