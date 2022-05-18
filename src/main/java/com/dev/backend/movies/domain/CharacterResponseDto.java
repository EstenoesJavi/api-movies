package com.dev.backend.movies.domain;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CharacterResponseDto {

    private Integer id;
    private String name;
    private String image;
    private Integer age;
    private Float weigth;
    private String history;
    private List<String> movieList;

}
