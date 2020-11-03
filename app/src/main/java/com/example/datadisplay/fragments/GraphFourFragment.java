package com.example.datadisplay.fragments;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.datadisplay.R;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;

public class GraphFourFragment extends Fragment {
    GraphView graphView;
    public static ArrayList<String> x_axis=new ArrayList<String>();
    public static ArrayList<String> y_axis=new ArrayList<String>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_graph_four, container, false);
        graphView = rootView.findViewById(R.id.graphview4);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[]{
                new DataPoint(0,0.975),
                new DataPoint(51,0.98),
                new DataPoint(108,1),
                new DataPoint(160,1.02),
                new DataPoint(215,1.03),
                new DataPoint(255,1.05),
                new DataPoint(312,1.08),
                new DataPoint(359,1.10),
                new DataPoint(410,1.13),
                new DataPoint(445,1.15),
                new DataPoint(515,1.18)
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