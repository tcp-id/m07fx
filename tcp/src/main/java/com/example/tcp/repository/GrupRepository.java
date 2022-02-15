package com.example.tcp.repository;

import com.example.tcp.domain.model.Grup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface GrupRepository extends JpaRepository<Grup, UUID> {
    <T> List<T> findBy(Class<T> type);
    <T> List<T> findGrupid (UUID id, Class<T> type);
}
