package com.dev.backend.movies.service;

import com.dev.backend.movies.domain.CharacterRequestDto;
import com.dev.backend.movies.entity.Figure;
import com.dev.backend.movies.repository.CharacterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class DisneyServiceImpl implements DisneyService{

    private final CharacterRepository characterRepository;

    @Override
    public List<Figure> getCharacters() {
        return null;
    }

    @Override
    public Figure saveCharacter(CharacterRequestDto characterRequestDto) {
        log.debug("Init saveCharacter with request: {}", characterRequestDto);
        Figure characterEntity = null;
        try {
            Figure character = Figure.builder().name(characterRequestDto.getName())
                    .image(characterRequestDto.getImage()).age(characterRequestDto.getAge())
                    .history(characterRequestDto.getHistory()).weigth(characterRequestDto.getWeigth()).build();

            characterEntity = this.characterRepository.save(character);
        } catch (Exception e){
            e.getMessage();
        }

        return characterEntity;
    }

    @Override
    public Figure UpdateCharacter() {
        return null;
    }

    @Override
    public void deleteCharacter() {

    }
}
