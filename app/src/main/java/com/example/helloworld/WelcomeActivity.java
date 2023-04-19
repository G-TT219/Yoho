package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.example.helloworld.adapter.WelcomPageAdapter;

public class WelcomeActivity extends AppCompatActivity {
    private int[] welcomeFragments={R.layout.welcome_page1,R.layout.welcome_page2,R.layout.welcom_page3};
    private RadioGroup radioGroup;
    private ViewPager viewPager;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcom_page);
        ViewPager viewPager=(ViewPager) findViewById(R.id.welcome_viewPage);
        WelcomPageAdapter welcomPageAdapter=new WelcomPageAdapter(getSupportFragmentManager(),welcomeFragments);
        viewPager.setAdapter(welcomPageAdapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener(){
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                Log.d("Android",String.valueOf(position));
                switch (position){
                    case 0:radioGroup.check(R.id.radioButton1);break;
                    case 1:radioGroup.check(R.id.radioButton2);break;
                    case 2:radioGroup.check(R.id.radioButton3);break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
        radioGroup=(RadioGroup)findViewById(R.id.radio_group);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton1){
                    viewPager.setCurrentItem(0);
                }else if(checkedId==R.id.radioButton2){
                    viewPager.setCurrentItem(1);
                }else if(checkedId==R.id.radioButton3){
                    viewPager.setCurrentItem(2);
                }
            }
        });
    }
    public void enterRoleSelectActivity(View view){
        Intent intent=new Intent(WelcomeActivity.this,RoleSelectActivity.class);
        startActivity(intent);
        finish();
    }

}
