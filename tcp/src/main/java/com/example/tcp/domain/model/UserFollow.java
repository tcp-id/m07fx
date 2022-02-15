package com.example.tcp.domain.model;

import com.example.tcp.domain.compositekeys.KeyUserFollowUser;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
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
