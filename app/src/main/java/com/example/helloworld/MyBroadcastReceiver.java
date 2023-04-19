package com.example.helloworld;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "MyBroadcastReceiver";
    public static final String CUSTOM_ACTION="com.example.INTENT";
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Android","have receive");
        Toast.makeText(context,"检测到意图！",Toast.LENGTH_LONG).show();
        context.startActivity(intent);
    }
}
