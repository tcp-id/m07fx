package com.example.tcp.domain.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;
import java.util.UUID;

public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID genreid;
    public String label;

   // @ManyToMany(mappedBy = "genres")
   // @JsonIgnoreProperties("genres")
    public Set<Anime> animes;
}
