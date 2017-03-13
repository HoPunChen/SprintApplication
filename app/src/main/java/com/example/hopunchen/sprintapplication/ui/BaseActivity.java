package com.example.hopunchen.sprintapplication.ui;

/**
 *项目名：  SmartButler
 *包名：    com.example.hopunchen.sprintapplication.ui
 *文件名:   BaseActivity
 *创建者:   CHB
 *创建时间:  2017/2/20 21:55
 *描述：    Activity基类
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * 主要做的事情：
 * 1.统一的属性
 * 2.统一的接口
 * 3.统一的方法
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setElevation(0);
        //显示返回键
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    //菜单栏操作
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

