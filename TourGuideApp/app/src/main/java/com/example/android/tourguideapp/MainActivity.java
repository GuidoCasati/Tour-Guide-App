package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set content view to activity_main.xml layout file
        setContentView(R.layout.activity_main);
        // Declare object ViewPager from the ID
        ViewPager viewpager = (ViewPager) findViewById(R.id.viewpager);
        // Declare object adapter and link to viewpager
        MenuAdapter menuAdapter = new MenuAdapter(this, getSupportFragmentManager());
        viewpager.setAdapter(menuAdapter);
        // Declare object TabLayout from the ID and link to viewpager
        TabLayout tablayout = (TabLayout) findViewById(R.id.menu);
        tablayout.setupWithViewPager(viewpager);
    }
}

