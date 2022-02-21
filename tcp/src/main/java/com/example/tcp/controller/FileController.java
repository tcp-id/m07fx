package com.example.tcp.controller;

import com.example.tcp.domain.dto.ResponseList;
import com.example.tcp.domain.model.File;
import com.example.tcp.domain.model.projection.ProFile;
import com.example.tcp.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/files")
public class FileController {

    @Autowired
    private FileRepository fileRepository;

    //FileController(FileRepository fileRepository) {this.fileRepository = fileRepository;}

    @PostMapping
    public String upload(@RequestParam("file") MultipartFile uploadedFile) {
        try {
            File file = new File();
            file.contenttype = uploadedFile.getContentType();
            file.data = uploadedFile.getBytes();

            return fileRepository.save(file).fileid.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/")
    public ResponseEntity<?> findAllFile(){
        return ResponseEntity.ok().body(new ResponseList(fileRepository.findBy(ProFile.class)));
    }
}
