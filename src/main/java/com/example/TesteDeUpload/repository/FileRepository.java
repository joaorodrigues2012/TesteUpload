package com.example.TesteDeUpload.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.TesteDeUpload.model.UserFiles;

@Repository
public interface FileRepository extends CrudRepository<UserFiles, Long> {

}
