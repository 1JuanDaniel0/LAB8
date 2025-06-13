package com.example.lab8.controller;

import com.example.lab8.service.ApiService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    private ApiService apiService;


}
