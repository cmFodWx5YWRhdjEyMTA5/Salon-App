package com.example.sampat.brillsalon;

import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Weeklyinex extends AppCompatActivity {

    ViewPager view;
    TabLayout tab;
    TabItem itm,itm1;
    Pageweekinex page;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weeklyinex);
        view=findViewById(R.id.view);
        tab=findViewById(R.id.tab);
        itm=findViewById(R.id.itm);
        itm1=findViewById(R.id.itm1);
        page=new Pageweekinex(getSupportFragmentManager(),tab.getTabCount());
        view.setAdapter(page);
        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tabb) {
                view.setCurrentItem(tabb.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tabb) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tabb) {

            }
        });
        view.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab));

    }


}

