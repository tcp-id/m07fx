package com.example.tcp.domain.dto;

import com.example.tcp.domain.model.Grup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface GrupRepository extends JpaRepository<Grup, UUID> {
    <T> List<T> findBy(Class<T> type);
    <T> List<T> findByGrupid(UUID id, Class<T> type);

}