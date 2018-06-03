package com.example.test.weather.common;

import android.support.annotation.NonNull;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {

    public static String API_KEY = "4c13bf49662148de0a5948ee916f1e41";
    public static String API_LINK = "http://api.openweathermap.org/data/2.5/weather";

    @NonNull
    public static String api_Request (String lat, String lng){

        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat-%s&lon-%s&APPID-&s&units-metric",lat,lng,API_KEY));
        return sb.toString();

    }

    public static String unixTimeStumpToDateTime(double unixTimeStump){

        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long) unixTimeStump*1000);
        return dateFormat.format(date);

    }

    public static String getImage (String icon){
        return String.format("http://openweathermap.org/img/w/%s.png",icon);  // can be problem with %s.png
    }

    public static String getDateNow(){
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }
}


