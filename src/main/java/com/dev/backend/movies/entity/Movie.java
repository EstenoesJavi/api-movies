package com.dev.backend.movies.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "movie", schema = "movieschallenge")
public class Movie {

    @Id
    @Column(name = "movie_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;
    private String title;
    private String image;
    private LocalDateTime dateCreation;
    private int score;

}
