package com.example.hopunchen.sprintapplication.entity;

import cn.bmob.v3.BmobUser;

/**
 * 项目名：  SprintApplication
 * 包名：    com.example.hopunchen.sprintapplication.entity
 * 文件名:   MyUser
 * 创建者:   CHB
 * 创建时间:  2017/2/28 23:37
 * 描述：    用户属性
 **/
public class MyUser extends BmobUser {
    private int age;
    private boolean sex;
    private String desc;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
