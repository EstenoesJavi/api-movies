package com.dev.backend.movies.service;

import com.dev.backend.movies.domain.CharacterRequestDto;
import com.dev.backend.movies.domain.CharacterResponseDto;
import com.dev.backend.movies.entity.Figure;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DisneyService {

    ResponseEntity<List<CharacterResponseDto>> getCharacters();

    ResponseEntity<Figure> saveCharacter(CharacterRequestDto characterRequestDto);

    Figure UpdateCharacter();

    void deleteCharacter();

}
