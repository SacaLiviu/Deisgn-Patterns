package com.kiv.adapter;

public class WeatherUI {
    public void showTemperature(int zipcode){
        WeatherAdapter adapter = new WeatherAdapter();
        System.out.println(adapter.findTemperature(1));
    }
}
