package com.example.tcp.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "grup")
public class Grup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID grupid;
    public String grupname;

    @ManyToMany
    @JoinTable(name = "user_grup", joinColumns = @JoinColumn(name = "grupid"), inverseJoinColumns = @JoinColumn(name = "userid"))
    @JsonIgnoreProperties("grups")
    public Set<User> users;

}
