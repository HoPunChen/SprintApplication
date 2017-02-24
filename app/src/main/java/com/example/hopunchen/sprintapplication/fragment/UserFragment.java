package com.example.hopunchen.sprintapplication.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hopunchen.sprintapplication.R;

/**
 * 项目名：  SmartButler
 * 包名：    com.example.hopunchen.sprintapplication.fragment
 * 文件名:   UserFragment
 * 创建者:   CHB
 * 创建时间:  2017/2/20 23:09
 * 描述：    个人中心
 **/
public class UserFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, null);
        return view;
    }
}
