package com.dev.backend.movies.controller;

import com.dev.backend.movies.domain.CharacterRequestDto;
import com.dev.backend.movies.service.DisneyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.dev.backend.movies.entity.Figure;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DisneyController {

    private final DisneyService disneyService;

    @GetMapping(value = "/character")
    public List<Figure> getCharacters() {
        return null;
    }

    @PostMapping(value = "/character")
    public Figure saveCharacter(
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
