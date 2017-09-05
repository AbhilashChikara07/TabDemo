package com.example.okutech.tabdemo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        List<Fragment> mFragmentList = new ArrayList<>();
        List<String> mFragmentTitleList = new ArrayList<>();
        mFragmentList.add(new OneFragment());
        mFragmentTitleList.add("ONE");

        mFragmentList.add(new TwoFragment());
        mFragmentTitleList.add("TWO");

        mFragmentList.add(new ThreeFragment());
        mFragmentTitleList.add("THREE");

        mFragmentList.add(new FourFragment());
        mFragmentTitleList.add("FOUR");

        mFragmentList.add(new FiveFragment());
        mFragmentTitleList.add("FIVE");

        mFragmentList.add(new SixFragment());
        mFragmentTitleList.add("SIX");

        mFragmentList.add(new SevenFragment());
        mFragmentTitleList.add("SEVEN");

        mFragmentList.add(new EightFragment());
        mFragmentTitleList.add("EIGHT");

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(),
                mFragmentList, mFragmentTitleList);
        viewPager.setAdapter(adapter);
    }
}