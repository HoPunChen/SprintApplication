package com.example.hopunchen.sprintapplication.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.hopunchen.sprintapplication.R;

/**
 * 项目名：  SprintApplication
 * 包名：    com.example.hopunchen.sprintapplication.ui
 * 文件名:   LoginActivity
 * 创建者:   CHB
 * 创建时间:  2017/2/27 23:10
 * 描述：    登录
 **/
public class LoginActivity extends AppCompatActivity {

    //注册按钮
    private Button btn_registered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {

        btn_registered = (Button) findViewById(R.id.btn_registered);
        btn_registered.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.btn_registered:
                startActivity(new Intent(this, RegisteredActivity.class));
                break;
        }

    }
}



