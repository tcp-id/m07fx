package com.example.tcp.repository;

import com.example.tcp.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FollowUserRepository extends JpaRepository<User, UUID> {
}
