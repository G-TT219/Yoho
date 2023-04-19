package com.example.helloworld;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.pm.ShortcutManagerCompat;
import androidx.fragment.app.Fragment;


import android.app.SearchManager;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ShortcutManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.bottomNav);
        bottomNavigationView.setOnItemSelectedListener(
                new NavigationBarView.OnItemSelectedListener(){

                    /**
                     * Called when an item in the navigation menu is selected.
                     *
                     * @param item The selected item
                     * @return true to display the item as the selected item and false if the item should not be
                     * selected. Consider setting non-selectable items as disabled preemptively to make them
                     * appear non-interactive.
                     */
                    @Override
                    public boolean onNavigationItemSelected(MenuItem item) {
                        Fragment fragment;
                        if (item.getItemId() == R.id.navigation_Page1) {
                            fragment = new Fragment_Page1();
                        } else {
                            fragment = new Fragment_Home();
                        }
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragment).commit();
                        return true;
                    }
                }
        );
    }
    /** 当活动不再可见时调用 */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Android","Resume");
    }
    @Override
    protected void onStart() {
        super.onStart();
        BroadcastReceiver broadcastReceiver=new MyBroadcastReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_WEB_SEARCH);
        this.registerReceiver(broadcastReceiver, filter);

    }
    public void enterIncomeAnalyzeActivity(View view){
        Intent intent=new Intent(this,IncomeAnalyzeActivity.class);
        startActivity(intent);
    }
}