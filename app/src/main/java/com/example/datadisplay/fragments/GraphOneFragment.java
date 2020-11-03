package com.example.datadisplay.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.datadisplay.R;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;
import java.util.List;

public class GraphOneFragment extends Fragment {
    GraphView graphView;
    public static ArrayList<String> x_axis=new ArrayList<String>();
    public static ArrayList<String> y_axis=new ArrayList<String>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_graph_one,container,false);
        graphView = rootView.findViewById(R.id.graphview);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[]{
                new DataPoint(0,0.975),
                new DataPoint(50,0.98),
                new DataPoint(100,1),
                new DataPoint(150,1.02),
                new DataPoint(200,1.03),
                new DataPoint(250,1.05),
                new DataPoint(300,1.08),
                new DataPoint(350,1.10),
                new DataPoint(400,1.13),
                new DataPoint(450,1.15),
                new DataPoint(500,1.18)
        });
        graphView.addSeries(series);
        series.setColor(Color.RED);
        series.setDrawDataPoints(true);
        series.setTitle("pressure sensors vs capacitor");
        series.setDataPointsRadius(8);
        graphView.setTitle("pressure sensors vs capacitance");
        graphView.setTitleTextSize(90);
        graphView.getGridLabelRenderer().setVerticalAxisTitle("capacitance");
        graphView.getGridLabelRenderer().setHorizontalAxisTitle("pressure sensors");
        graphView.setTitleTextSize(80);
        graphView.setTitleColor(android.R.color.holo_blue_light);
        return rootView;
    }
}