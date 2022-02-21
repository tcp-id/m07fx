package com.example.tcp.controller;

import com.example.tcp.domain.dto.ErrorMessage;
import com.example.tcp.domain.dto.ResponseMessage;
import com.example.tcp.domain.model.Grup;
import com.example.tcp.domain.model.projection.ProGrup;
import com.example.tcp.repository.GrupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/grup")
public class GrupController {
    @Autowired
    private GrupRepository grupRepository;

    @GetMapping("/")
    public ResponseEntity<?> findAllGrup(){
        return ResponseEntity.ok().body(grupRepository.findBy(ProGrup.class));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findBy(@PathVariable UUID id){
        Grup grup = grupRepository.findById(id).orElse(null);
        if(grup == null){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(ErrorMessage.message("Nos'ha trobat el grup amb id= " + id));
        }
        return ResponseEntity.ok().body(grupRepository.findByGrupid(id, ProGrup.class));
    }

    @PostMapping("/")
    public Grup creategrup(@RequestBody Grup grup){
        return grupRepository.save(grup);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delGrup(@PathVariable UUID id){
        Grup grup = grupRepository.findById(id).orElse(null);
        if(grup == null){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(ErrorMessage.message("Nos'ha trobat el grup amb id= " + id));
        }
        grupRepository.delete(grup);
        return ResponseEntity.ok().body(ResponseMessage.message("Grup amb id: " + id + " s'ha elimminat"));
    }
}