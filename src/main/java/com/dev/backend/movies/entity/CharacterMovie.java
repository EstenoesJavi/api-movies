package com.dev.backend.movies.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "character_movie", schema = "moviechallenge")
public class CharacterMovie {

    @Id
    @Column(name = "charactermovie_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int characterMovieId;

    @JoinColumn(name="character_id", nullable=false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Figure character;

    @JoinColumn(name="movie_id", nullable=false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Movie movie;

}
