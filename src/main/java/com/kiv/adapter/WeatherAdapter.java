package com.kiv.adapter;

public class WeatherAdapter {
    public int findTemperature(int zipCode){
        String city=null;
        if(zipCode==1){
            city="king of prussia";
        }
        WeatherFinder finder = new WeatherFinderImpl();
        return finder.find(city);
    }
}
