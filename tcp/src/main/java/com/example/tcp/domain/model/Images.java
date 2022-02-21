package com.example.tcp.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;


@Entity
@Table(name = "img_group")
public class Images {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID imgid;
    public String imgtext;



    //@ManyToMany(mappedBy = "images")
    //@JsonIgnoreProperties("images")
    //public Set<Anime> animes;


    @ManyToMany(mappedBy = "images")
    @JsonIgnoreProperties("images")
    public Set<Anime> animes;

}

