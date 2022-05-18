package com.dev.backend.movies.controller;

import com.dev.backend.movies.domain.CharacterRequestDto;
import com.dev.backend.movies.domain.CharacterResponseDto;
import com.dev.backend.movies.service.DisneyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.dev.backend.movies.entity.Figure;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class DisneyController {

    private final DisneyService disneyService;

    /**
     * Endpoint que permite consultar todos los personajes
     */
    @GetMapping(value = "/character")
    public ResponseEntity<List<CharacterResponseDto>> getCharacters() {
        return this.disneyService.getCharacters();
    }

    /**
     * Endpoint que permite guardar un personaje y devuelve
     * el personaje guardado y sus peliculas asociadas
     */
    @PostMapping(value = "/character")
    public ResponseEntity<Figure> saveCharacter(@Valid
                                                @RequestBody(required = true) CharacterRequestDto characterRequestDto) {
        return this.disneyService.saveCharacter(characterRequestDto);
    }

    @PutMapping(value = "/character")
    public Figure updateCharacter() {
        return null;
    }

    @DeleteMapping(value = "/character")
    public void deleteCharacter() {

    }

}
