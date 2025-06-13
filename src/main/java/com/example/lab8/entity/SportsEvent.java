package com.example.lab8.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class SportsEvent {
    private String nombre;
    private String estadio;
    private LocalDateTime inicio;

    public SportsEvent(){
    }

    public SportsEvent(String nombre, String estadio, LocalDateTime inicio) {
        this.nombre = nombre;
        this.estadio = estadio;
        this.inicio = inicio;
    }

}
