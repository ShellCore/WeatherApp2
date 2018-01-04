package com.shellcore.android.weatherapp;

/**
 * Created by MOGC on 04/01/2018.
 */

public class London implements Strategy {

    @Override
    public String reportCurrentWeather() {
        return "Terríblemente frío y húmedo";
    }
}
