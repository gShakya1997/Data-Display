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

public class GraphTenFragment extends Fragment {
    GraphView graphView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_graph_ten, container, false);
        graphView = rootView.findViewById(R.id.graphview10);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[]{
                new DataPoint(0,0.975),
                new DataPoint(70,0.98),
                new DataPoint(120,1),
                new DataPoint(160,1.02),
                new DataPoint(205,1.03),
                new DataPoint(265,1.05),
                new DataPoint(310,1.08),
                new DataPoint(355,1.10),
                new DataPoint(405,1.13),
                new DataPoint(455,1.15),
                new DataPoint(505,1.18)
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