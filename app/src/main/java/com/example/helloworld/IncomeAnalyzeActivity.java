package com.example.helloworld;

import android.annotation.SuppressLint;



import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IncomeAnalyzeActivity extends AppCompatActivity {
    MyLineChartView chartView;
    List<String> xValues;   //x轴数据集合
    List<Integer> yValues;  //y轴数据集合
    @SuppressLint("RestrictedApi")
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.income_analyze);
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Income");
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        initViewID();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.income_action_bar,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
            default:return super.onOptionsItemSelected(item);
        }
    }

    private void initViewID() {
        MyLineChartView chartView=(MyLineChartView) findViewById(R.id.my_line_chart_view);
        xValues = new ArrayList<>();
        yValues = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            Random random = new Random();
            xValues.add(i + "号");
            yValues.add(random.nextInt(1000));
        }
        // xy轴集合自己添加数据
        chartView.setXValues(xValues);
        chartView.setYValues(yValues);
        chartView.setLegendTitle("收入");
    }
}
