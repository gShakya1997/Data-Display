package com.example.datadisplay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.datadisplay.fragments.GraphEightFragment;
import com.example.datadisplay.fragments.GraphFiveFragment;
import com.example.datadisplay.fragments.GraphFourFragment;
import com.example.datadisplay.fragments.GraphNineFragment;
import com.example.datadisplay.fragments.GraphOneFragment;
import com.example.datadisplay.fragments.GraphSevenFragment;
import com.example.datadisplay.fragments.GraphSixFragment;
import com.example.datadisplay.fragments.GraphTenFragment;
import com.example.datadisplay.fragments.GraphThreeFragment;
import com.example.datadisplay.fragments.GraphTwoFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Fragment> list = new ArrayList<>();
        list.add(new GraphOneFragment());
        list.add(new GraphTwoFragment());
        list.add(new GraphThreeFragment());
        list.add(new GraphFourFragment());
        list.add(new GraphFiveFragment());
        list.add(new GraphSixFragment());
        list.add(new GraphSevenFragment());
        list.add(new GraphEightFragment());
        list.add(new GraphNineFragment());
        list.add(new GraphTenFragment());

        viewPager = findViewById(R.id.pager);
        pagerAdapter = new SlidePagerAdapter(getSupportFragmentManager(), list);

        viewPager.setAdapter(pagerAdapter);
    }
}