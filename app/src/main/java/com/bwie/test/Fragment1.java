package com.bwie.test;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * autour: 梁萌萌
 * date: 2016/11/29 21:01
 * update: 2016/11/29
 */
public class Fragment1 extends Fragment{


    private static final String TAG ="Fragment1" ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fm1, container, false);
        Log.d(TAG, "==================onCreateView");
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d(TAG, "==================onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "==================onCreate");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "==================onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "==================onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "==================onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "==================onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "==================onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "==================onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "==================onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "==================onDetach");
    }
}
