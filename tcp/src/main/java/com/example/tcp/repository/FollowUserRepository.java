package com.example.tcp.repository;

import com.example.tcp.domain.model.UserFollow;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface FollowUserRepository extends JpaRepository<UserFollow, UUID> {

}