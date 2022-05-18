package com.dev.backend.movies.entity;

import lombok.*;

import javax.persistence.*;

/**
 * Clase que sirve para mapear los datos de la tabla personaje
 */
@Getter
@Setter
@Entity
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
