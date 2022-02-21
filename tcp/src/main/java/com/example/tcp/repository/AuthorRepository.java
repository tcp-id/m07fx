package com.example.tcp.repository;

import com.example.tcp.domain.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface AuthorRepository extends JpaRepository<Author, UUID> {
    <T> List<T> findBy(Class<T> type);
    <T> List<T> findByAuthorid(UUID id, Class<T> type);
}