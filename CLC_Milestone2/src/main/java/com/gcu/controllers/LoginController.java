package com.gcu.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.models.LoginModel;

@Controller
@RequestMapping("/login")
public class LoginController {

	@GetMapping("/")
	public String displayLogin(Model model) {
		
		model.addAttribute("loginModel", new LoginModel());
		return "Login.html";
	}
	
	@PostMapping("/processLogin")
	public String processLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
		
		
		if(bindingResult.hasErrors()) 
		{
			model.addAttribute("loginModel", loginModel);
			return "Login.html";
		}
		
		
		model.addAttribute("loginModel", loginModel);
		return "Dashboard.html";
	}
	
}