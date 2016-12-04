package com.bwie.test;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.TextView;
/**
 * autour: 梁萌萌
 * date: 2016/11/29 20:38 
 * update: 2016/11/29
 */
public class MainActivity extends FragmentActivity implements View.OnClickListener{

    private TextView tv1;
    private TextView tv2;
    private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.fm1);
        tv2 = (TextView) findViewById(R.id.fm2);
        tv3 = (TextView) findViewById(R.id.fm3);
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);


        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        //添加
        transaction.add(R.id.fm,new Fragment1(),"fm1");
        //替换
        //transaction.replace(R.id.fm,new Fragment1(),"fm1");
        //隐藏
       // transaction.hide(new Fragment1());
        //删除
        //transaction.remove(new Fragment1());
        transaction.commit();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.fm1:
                FragmentManager manager1 = getSupportFragmentManager();
                FragmentTransaction transaction1 = manager1.beginTransaction();
                //添加
                transaction1.add(R.id.fm,new Fragment1(),"fm1");
                //替换
                 //transaction1.replace(R.id.fm,new Fragment1(),"fm1");
                //隐藏
                //transaction1.hide(new Fragment1());
                //删除
                //transaction1.remove(new Fragment1());
                transaction1.commit();
                break;
            case R.id.fm2:
                FragmentManager manager2 = getSupportFragmentManager();
                FragmentTransaction transaction2 = manager2.beginTransaction();
                //添加
                transaction2.add(R.id.fm,new Fragment2(),"fm1");
                //替换
                //transaction2.replace(R.id.fm,new Fragment2(),"fm2");
                //隐藏
                //transaction2.hide(new Fragment2());
                //删除
                //transaction2.remove(new Fragment1());
                transaction2.commit();
                break;
            case R.id.fm3:
                FragmentManager manager3 = getSupportFragmentManager();
                FragmentTransaction transaction3 = manager3.beginTransaction();
                //添加
                transaction3.add(R.id.fm,new Fragment3(),"fm1");
                //替换
                //transaction3.replace(R.id.fm,new Fragment3(),"fm3");
                //隐藏
                //transaction3.hide(new Fragment3());
                //删除
                //transaction3.remove(new Fragment1());
                transaction3.commit();
                break;

        }
    }




}
