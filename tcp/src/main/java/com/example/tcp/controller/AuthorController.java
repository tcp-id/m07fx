package com.example.tcp.controller;

import com.example.tcp.domain.dto.ErrorMessage;
import com.example.tcp.domain.dto.ResponseList;
import com.example.tcp.domain.dto.ResponseMessage;
import com.example.tcp.domain.model.Author;
import com.example.tcp.domain.model.projection.ProAuthor;
import com.example.tcp.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping("/")
    public ResponseEntity<?> findAllAuthor(Authentication authentication) {
        return ResponseEntity.ok().body(new ResponseList(authorRepository.findBy(ProAuthor.class)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findBy(@PathVariable UUID id){
        Author author = authorRepository.findById(id).orElse(null);
        if(author == null){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(ErrorMessage.message("Nos'ha trobat l'author amb id= " + id));
        }
        authorRepository.save(author);
        return ResponseEntity.ok().body(new ResponseList(authorRepository.findByAuthorid(id, ProAuthor.class)));
    }
    @PostMapping("/")
    public Author createAuthor(@RequestBody Author author){
        return authorRepository.save(author);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delAuthor (@PathVariable UUID id) {
        Author author = authorRepository.findById(id).orElse(null);
        if (author == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ErrorMessage.message("Author Not Found" + id));
        }
        authorRepository.delete(author);
        return ResponseEntity.ok().body(ResponseMessage.message("Author" + id + "Deleted, thx"));
    }

}

