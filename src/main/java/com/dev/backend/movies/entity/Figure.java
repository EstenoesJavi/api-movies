package com.dev.backend.movies.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Builder
@Table(name = "figure", schema = "movieschallenge")
public class Figure {

    @Id
    @Column(name = "character_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer characterId;
    private String name;
    private String image;
    private int age;
    private float weigth;
    private String history;

}
