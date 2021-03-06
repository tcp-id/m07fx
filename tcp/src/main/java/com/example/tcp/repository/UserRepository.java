package com.example.tcp.repository;

import com.example.tcp.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    User findByUsername(String username);
    <T> List<T> findByUsername(String username, Class<T> type);

    <T> List<T> findByUserid(UUID id, Class<T> type);

    <T> List<T> findBy(Class<T> type);
}

