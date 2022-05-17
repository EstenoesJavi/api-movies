package com.dev.backend.movies.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "gender", schema = "moviechallenge")
public class Gender {

    @Id
    @Column(name = "gender_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int genderId;
    private String name;
    private String image;
}
