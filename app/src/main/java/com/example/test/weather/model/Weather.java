package com.example.test.weather.model;

public class Weather {

    private int id;
    private String main;
    private String description;
    private String icon;

    public Weather(int id, String main, String description, String iong) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = iong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIong() {
        return icon;
    }

    public void setIong(String iong) {
        this.icon = iong;
    }
}
