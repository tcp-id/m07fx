package com.example.tcp.controller;

import com.example.tcp.domain.dto.ErrorMessage;
import com.example.tcp.domain.dto.ResponseMessage;
import com.example.tcp.domain.model.Genre;
import com.example.tcp.domain.model.projection.ProGenre;
import com.example.tcp.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/genre")
public class GenreController {
    @Autowired
    private GenreRepository genreRepository;

    @GetMapping("/")
    public ResponseEntity findAllGenre(){
        return ResponseEntity.ok().body(genreRepository.findBy(ProGenre.class));
    }
    @GetMapping("/{id}")
    public ResponseEntity findBy(@PathVariable UUID id) {
        Genre genre = genreRepository.findById(id).orElse(null);
        if (genre == null) {
            return ResponseEntity.ok().body(genreRepository.findBy(ProGenre.class));
        }
        return ResponseEntity.ok().body(genreRepository.findByGenreId(id, ProGenre.class));
    }
    @PostMapping("/")
    public Genre createGenre(@RequestBody Genre genre){
        return genreRepository.save(genre);
    }

    @DeleteMapping("/{id}")
    public  ResponseEntity delGenre (@PathVariable UUID id){
        Genre genre = genreRepository.findById(id).orElse(null);
        if(genre == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ErrorMessage.message("Not found"+ id));
        }
        genreRepository.delete(genre);
        return  ResponseEntity.ok().body(ResponseMessage.message("Genere amb id: " + id + "s'ha eliminmat"));
    }

}
