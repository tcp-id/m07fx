package com.example.tcp.repository;

import com.example.tcp.domain.model.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AnimeRepository extends JpaRepository<Anime, UUID> {
public <T>List<T> findBy(Class<T> type);
public <T>List<T> findByAnimeId(UUID id, Class<T> type);
}
