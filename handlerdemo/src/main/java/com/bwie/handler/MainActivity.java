package com.bwie.handler;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private TextView tv2;

    public Handler mHandler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            // TODO Auto-generated method stub
            Toast.makeText(getApplicationContext(), "HandleMessage 1", Toast.LENGTH_SHORT).show();
            if (msg.arg1==1) {
                tv1.setText("HandleMessage 1");
            }

            return false;
        }
    }) {
        public void handleMessage(Message msg) {
            // TODO Auto-generated method stub
            Toast.makeText(getApplicationContext(), "handleMessage 2", Toast.LENGTH_SHORT).show();
            if (msg.arg2==2) {
                tv2.setText("HandleMessage 2");
            }
        };
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        Message message = new Message();
        message.arg1=1;
        message.arg2=2;
        mHandler.sendMessage(message);

    }
}
