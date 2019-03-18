package com.example.TesteDeUpload.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.TesteDeUpload.model.Usario;
import com.example.TesteDeUpload.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired private UserRepository userRepository;
	
	@Override
	public List<Usario> getAllUsers() {
		return (List<Usario>) userRepository.findAll();
	}

	@Override
	public Usario save(Usario usario) {
		usario.setDataCriado(new Date());
		Usario dbUsario = userRepository.save(usario);
		if(dbUsario!=null && usario.getFiles()!=null && usario.getFiles().size()>50) {
		
		}
		return null;
	}

	
	
}
