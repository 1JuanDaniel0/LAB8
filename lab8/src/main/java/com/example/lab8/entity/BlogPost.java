package com.example.lab8.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "blog_post")
public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false, unique = true)
    private Long id;
    @Column(name="titulo",nullable = false)
    private String titulo;
    @Column(name="contenido",nullable = false)
    @Lob
    private String contenido;
    @Column(name="autor",nullable = false)
    private String autor;
    @Column(name="fecha_publicacion")
    private LocalDateTime fechaPublicacion;
    @Column(name="categoria")
    private String categoria;

}
