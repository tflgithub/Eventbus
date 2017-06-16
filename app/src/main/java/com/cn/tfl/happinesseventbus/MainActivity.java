package com.cn.tfl.happinesseventbus;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EventBus.getDefault().register(this);
    }


    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void test(Message message) {
      Log.d(TAG, Looper.getMainLooper().getThread()+":"+message.toString());
    }


    public void gotoAct(View view) {
        Intent intent = new Intent(this, TestActivity.class);
        startActivity(intent);
    }


    public static class Message {
    }

    @Override
    protected void onDestroy() {
        EventBus.getDefault().unRegister(this);
        super.onDestroy();
    }
}
