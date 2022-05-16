package com.dev.backend.movies.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "character", schema = "movieschallenge")
public class Character {

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
