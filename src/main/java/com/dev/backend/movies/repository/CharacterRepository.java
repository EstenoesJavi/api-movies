package com.dev.backend.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dev.backend.movies.entity.Figure;

import java.util.List;
import java.util.Optional;

@Repository
public interface CharacterRepository extends JpaRepository<Figure, Integer> {

    /**
     * Consulta que sirve para buscar un personaje
     * por su nombre
     *
     * @param name
     * @return optional con la entidad
     */
    Optional<Figure> findByNameIgnoreCase(String name);

}
