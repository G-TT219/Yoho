package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RoleSelectActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.role_select);
    }
    public void enterLoginAndRegisterActivity(View view){
        Intent intent=new Intent(this,LoginAndRegisterActivity.class);
        startActivity(intent);
        finish();
    }
}
