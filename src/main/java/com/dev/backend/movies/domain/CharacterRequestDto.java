package com.dev.backend.movies.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@ToString
@NoArgsConstructor
public class CharacterRequestDto {

    @NotBlank(message = "El nombre es obligatorio")
    private String name;
    private String image;
    @NotNull
    @Min(value=0, message="La edad es requerida")
    private Integer age;
    @NotNull
    @Min(value=0, message="El peso es requerido")
    private Float weigth;
    @NotBlank(message = "La historia es obligatoria")
    private String history;

}
