package com.example.TesteDeUpload.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.TesteDeUpload.model.Usario;

@Repository
public interface UserRepository extends CrudRepository<Usario, Long> {

}
