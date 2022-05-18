package com.dev.backend.movies.service;

import com.dev.backend.movies.domain.CharacterRequestDto;
import com.dev.backend.movies.domain.CharacterResponseDto;
import com.dev.backend.movies.entity.Figure;
import com.dev.backend.movies.repository.CharacterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class DisneyServiceImpl implements DisneyService {

    private final CharacterRepository characterRepository;

    /**
     * Este método permite consultar todos los personajes y traer la información
     * de cada uno junto con sus peliculas relacionadas
     *
     * @return lista de personasjes
     */
    @Override
    public ResponseEntity<List<CharacterResponseDto>> getCharacters() {
        log.debug("Init getCharacters");
        ResponseEntity<List<CharacterResponseDto>> responseEntityFigures = null;
        List<CharacterResponseDto> listCharacterResponseDto = new ArrayList<>();
        try {
            List<Figure> listFigures = this.characterRepository.findAll();
            if (listFigures.isEmpty()) {
                responseEntityFigures = ResponseEntity.notFound().build();
            } else {
                listFigures.forEach(f -> listCharacterResponseDto.add(
                        CharacterResponseDto.builder().id(f.getCharacterId())
                                .name(f.getName()).image(f.getImage()).age(f.getAge()).weigth(f.getWeigth())
                                .history(f.getHistory()).movieList(new ArrayList<>()).build()));
                responseEntityFigures = ResponseEntity.ok(listCharacterResponseDto);
            }
        } catch (Exception e) {
            log.debug("Error {}", e.getMessage());
            responseEntityFigures = ResponseEntity.internalServerError().build();
        }
        log.debug("Finish getCharacters");
        return responseEntityFigures;
    }

    /**
     * Método que sirve para guardar un personaje en base de datos
     *
     * @param characterRequestDto
     * @return dto con información del personaje incluida las peliculas o series asociadas
     */
    @Override
    public ResponseEntity<Figure> saveCharacter(CharacterRequestDto characterRequestDto) {
        log.debug("Init saveCharacter with request: {}", characterRequestDto);
        ResponseEntity<Figure> responseEntity = null;
        try {
            var optionalCharacter = this.characterRepository.findByNameIgnoreCase(characterRequestDto.getName());
            if (optionalCharacter.isEmpty()) {
                Figure character = Figure.builder().name(characterRequestDto.getName())
                        .image(characterRequestDto.getImage()).age(characterRequestDto.getAge())
                        .history(characterRequestDto.getHistory()).weigth(characterRequestDto.getWeigth()).build();

                responseEntity = new ResponseEntity<>(this.characterRepository.save(character), HttpStatus.CREATED);
            } else {
                responseEntity = ResponseEntity.ok().build();
            }
        } catch (Exception e) {
            log.debug("Error {}", e.getMessage());
            responseEntity = ResponseEntity.internalServerError().build();
        }
        log.debug("Finish saveCharacter");
        return responseEntity;
    }

    @Override
    public Figure UpdateCharacter() {
        return null;
    }

    @Override
    public void deleteCharacter() {

    }
}
