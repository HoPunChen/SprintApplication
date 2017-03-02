package com.example.hopunchen.sprintapplication.application;

import android.app.Application;

import com.example.hopunchen.sprintapplication.utils.StaticClass;
import com.tencent.bugly.crashreport.CrashReport;

import cn.bmob.v3.Bmob;

/**
 * 项目名：  SprintApplication
 * 包名：    com.example.hopunchen.sprintapplication.application
 * 文件名:   BaseApplication
 * 创建者:   CHB
 * 创建时间:  2017/2/23 20:53
 * 描述：    Application
 **/
public class BaseApplication extends Application {
    //创建
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化Bugly
        CrashReport.initCrashReport(getApplicationContext(), StaticClass.BUGLY_APP_ID, true);
        //初始化Bmob
        Bmob.initialize(this, StaticClass.BMOB_APP_ID);
    }

}
