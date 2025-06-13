package com.example.lab8.entity;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherInfo {
    private String condicion;
    private Double tempMax;
    private Double tempMin;

    public WeatherInfo(){
    }

    public WeatherInfo(String condicion, Double tempMax, Double tempMin) {
        this.condicion = condicion;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
    }
}
