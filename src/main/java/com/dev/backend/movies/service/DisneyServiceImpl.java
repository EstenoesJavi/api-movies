package com.dev.backend.movies.service;

import com.dev.backend.movies.domain.CharacterRequestDto;
import com.dev.backend.movies.entity.Figure;
import com.dev.backend.movies.repository.CharacterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    /**
     * Método que sirve para guardar un personaje en base de datos
     *
     * @param characterRequestDto
     * @return dto con información del personaje incluida las peliculas o series asociadas
     */
    @Override
    public ResponseEntity<Figure>  saveCharacter(CharacterRequestDto characterRequestDto) {
        log.debug("Init saveCharacter with request: {}", characterRequestDto);
        ResponseEntity<Figure> responseEntity = null;
        try {
            var optionalCharacter = this.characterRepository.findByNameIgnoreCase(characterRequestDto.getName());
            if (optionalCharacter.isEmpty()){
                Figure character = Figure.builder().name(characterRequestDto.getName())
                        .image(characterRequestDto.getImage()).age(characterRequestDto.getAge())
                        .history(characterRequestDto.getHistory()).weigth(characterRequestDto.getWeigth()).build();

                responseEntity= new ResponseEntity<>(this.characterRepository.save(character), HttpStatus.CREATED) ;
            }else {
                responseEntity= ResponseEntity.ok().build();
            }
        } catch (Exception e){
            log.debug("Error {}",e.getMessage());
            responseEntity= ResponseEntity.internalServerError().build() ;
        }
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
