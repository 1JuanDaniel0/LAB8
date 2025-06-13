package com.example.lab8.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "evento")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombreEvento", nullable = false)
    private String nombreEvento;

    @Column(name = "ciudad", nullable = false)
    private String ciudad;

    @Column(name = "fechaEvento", nullable = false)
    private LocalDate fechaEvento;

    @Column(name = "condicionClima", nullable = false)
    private String condicionClima;

    @Column(name = "tempMax", nullable = false)
    private Double tempMax;

    @Column(name = "tempMin", nullable = false)
    private Double tempMin;

}
