package com.dev.backend.movies.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class CharacterRequestDto {

    private String name;
    private String image;
    private int age;
    private float weigth;
    private String history;
    private int movieId;

}
