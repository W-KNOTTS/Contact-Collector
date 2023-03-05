package com.gcu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		return "login.html";
	}
	
	@PostMapping("/processLogin")
	public String processLogin(LoginModel loginModel, Model model) {
		
		model.addAttribute("loginModel", loginModel);
		return "Dashboard.html";
	}
	
}
