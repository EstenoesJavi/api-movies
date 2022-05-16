package com.dev.backend.movies.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "movie_gender", schema = "moviechallenge")
public class MovieGender {

    @Id
    @Column(name = "moviegender_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieGenderId;

    @Column(name = "movie_id")
    @JoinColumn(name="movie_id", nullable=false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Movie movie;

    @Column(name = "gender_id")
    @JoinColumn(name="gender_id", nullable=false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Gender gender;

}
