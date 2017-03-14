package com.example.hopunchen.sprintapplication.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hopunchen.sprintapplication.R;

/**
 * 项目名：  SprintApplication
 * 包名：    com.example.hopunchen.sprintapplication.fragment
 * 文件名:   DictionaryFragment
 * 创建者:   CHB
 * 创建时间:  2017/2/23 22:16
 * 描述：    字典
 */
public class DictionaryFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dictionary, null);
        return view;
    }

}
