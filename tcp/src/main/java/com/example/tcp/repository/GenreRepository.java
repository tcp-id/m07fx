package com.example.tcp.repository;

import com.example.tcp.domain.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface GenreRepository extends JpaRepository<Genre, UUID> {
    <T> List<T> findBy(Class<T> type);
    <T> List<T> findByGenreId(UUID id, Class<T> type);

}
