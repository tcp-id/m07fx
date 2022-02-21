package com.example.tcp.domain.model;

import com.example.tcp.domain.compositekeys.KeyUserFollowUser;
<<<<<<< HEAD
=======
import org.hibernate.annotations.Table;
>>>>>>> fire/master

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
<<<<<<< HEAD
import javax.persistence.Table;
=======
>>>>>>> fire/master
import java.util.UUID;

@Entity
@Table(name = "follow")
@IdClass(KeyUserFollowUser.class)
public class UserFollow {
    @Id
    public UUID userid;
    @Id
    public UUID useridfollowed;
}
