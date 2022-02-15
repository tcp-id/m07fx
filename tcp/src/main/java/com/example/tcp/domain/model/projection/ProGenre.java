package com.example.tcp.domain.model.projection;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;
import java.util.UUID;

public interface ProGenre {
    UUID getGenreid();
    String getLabel();
    String getImageurl();
    @JsonIgnoreProperties("genres")
    Set<ProAnime> getAnime();
}
