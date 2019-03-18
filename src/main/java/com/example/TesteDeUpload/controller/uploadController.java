package com.example.TesteDeUpload.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.TesteDeUpload.model.Usario;
import com.example.TesteDeUpload.model.UserFiles;
import com.example.TesteDeUpload.service.UserService;

@Controller
public class uploadController {

	@Autowired private UserService userService;
	
	@GetMapping(value="/")
	public String users(Model model) {
		List<Usario> users = userService.getAllUsers();
		model.addAttribute("users", users);
		model.addAttribute("usario", new Usario());
		model.addAttribute("userfiles", new ArrayList<UserFiles>());
		model.addAttribute("isAdd", true);
		return "user";
	}
	
	@PostMapping(value="/save")
	public String save(@ModelAttribute Usario usario, RedirectAttributes redirectAttributes) {
		Usario dbUsario = userService.save(usario);
	}
	
}
