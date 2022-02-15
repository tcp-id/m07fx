package com.example.tcp.domain.model.projection;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;

public interface ProFollow {
    @JsonIgnoreProperties("followto")
    Set<ProFollow> getFollow();
}
