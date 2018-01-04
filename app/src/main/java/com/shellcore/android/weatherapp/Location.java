package com.shellcore.android.weatherapp;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;

/**
 * Created by MOGC on 04/01/2018.
 */

public class Location {

    private Strategy strategy;

    public Location(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(Context context) {
        TextView textView = (TextView) ((Activity) context).findViewById(R.id.txt_view);
        textView.setText(strategy.reportCurrentWeather());
    }
}
