package com.example.tcp.domain.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "img_grup")
public class Images {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID imgid;
    public String imgtext;


    //@ManyToMany(mappedBy = "images")
    //@JsonIgnoreProperties("images")
    //public Set<Anime> animes;
}

