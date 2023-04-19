package com.example.helloworld;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import org.w3c.dom.Text;

public class CustomActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_activity);
        TextView textView1=(TextView) findViewById(R.id.textView1);
        textView1.setText(getIntent().getData().toString());
    }
}
