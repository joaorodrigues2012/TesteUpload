package com.example.TesteDeUpload.service;

import java.util.List;

import com.example.TesteDeUpload.model.Usario;

public interface UserService {

	List<Usario> getAllUsers();

	Usario save(Usario usario);

}
