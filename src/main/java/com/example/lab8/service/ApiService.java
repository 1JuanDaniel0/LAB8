package com.example.lab8.service;

import com.example.lab8.entity.SportsEvent;
import com.example.lab8.entity.WeatherInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.time.LocalDate;

@Service
public class ApiService {
    private final String API_KEY = "88e12060abad41ab97212738250906";
    private final String ENDPOINT = "https://api.weatherapi.com/v1/sports.json?key=88e12060abad41ab97212738250906&q={ciudad}&days={dias}";

}
