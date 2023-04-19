package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class LoginAndRegisterActivity extends AppCompatActivity {
    private Fragment loginFragment;
    private Fragment registerFragment;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_or_register);
        loginFragment=new Fragment_Login();
        registerFragment=new Fragment_Register();
    }
    public void enterMainActivity(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void toLoginFragment(View view){
        Log.d("123","123");
        getSupportFragmentManager().beginTransaction().replace(R.id.login_or_register_fragmentContainerView,loginFragment).commit();
    }
    public void toRegisterFragment(View view){
        getSupportFragmentManager().beginTransaction().replace(R.id.login_or_register_fragmentContainerView,registerFragment).commit();
    }
}
