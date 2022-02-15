package com.example.tcp.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "image")
public class Images {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID imgid;
    public String imgtext;


    @ManyToMany(mappedBy = "images")
    @JsonIgnoreProperties("images")
    public Set<Anime> animes;
}
}
