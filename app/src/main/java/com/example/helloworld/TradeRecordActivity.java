package com.example.helloworld;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class TradeRecordActivity extends AppCompatActivity {
    List<TradeRecord> recordList=new ArrayList<TradeRecord>();
    ListView listView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trade_record_activity);
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        setTitle("Trade Record");
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        listView=(ListView)findViewById(R.id.trade_record_list);
        initData();
        TradeRecordAdapter tradeRecordAdapter=new TradeRecordAdapter(this,R.layout.trade_record_list_item,recordList);
        listView.setAdapter(tradeRecordAdapter);
    }
    private void initData(){
        int[] imageId={
                R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground
        };
        String[] userName={
                "Li Hua","Zhang San","Li Hua","Zhang San","Li Hua","Zhang San","Li Hua","Zhang San","Li Hua","Zhang San"
        };
        String[] tradeType={
                "SELL","PAY", "SELL","PAY", "SELL","PAY", "SELL","PAY", "SELL","PAY"
        };
        String[] moneyCount={
                "100","30","100","30","100","30","100","30","100","30"
        };
        for(int i=0;i<imageId.length;i++){
            recordList.add(new TradeRecord(imageId[i],userName[i],tradeType[i],moneyCount[i]));
        }
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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.income_action_bar,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
