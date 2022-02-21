package com.example.tcp.repository;

<<<<<<< HEAD
import com.example.tcp.domain.model.UserFollow;
=======
import com.example.tcp.domain.model.User;
>>>>>>> fire/master
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

<<<<<<< HEAD
public interface FollowUserRepository extends JpaRepository<UserFollow, UUID> {
=======
public interface FollowUserRepository extends JpaRepository<User, UUID> {
>>>>>>> fire/master
}
