package com.dev.backend.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dev.backend.movies.entity.Figure;

@Repository
public interface CharacterRepository extends JpaRepository<Figure, Integer> {

}
