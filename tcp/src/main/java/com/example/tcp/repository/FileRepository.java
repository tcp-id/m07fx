package com.example.tcp.repository;

import com.example.tcp.domain.model.File;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface FileRepository extends JpaRepository<File, UUID> {
    //@Query("select fileid from File")
    //List<String> getFileIds();
    <T> List<T> findBy(Class<T> type);

    //List<FileResult> findBy();
}
