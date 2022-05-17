package com.dev.backend.movies.service;

import com.dev.backend.movies.domain.CharacterRequestDto;
import com.dev.backend.movies.entity.Figure;

import java.util.List;

public interface DisneyService {

    List<Figure> getCharacters();

    Figure saveCharacter(CharacterRequestDto characterRequestDto);

    Figure UpdateCharacter();

    void deleteCharacter();

}
