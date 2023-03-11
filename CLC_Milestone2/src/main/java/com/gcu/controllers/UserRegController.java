package com.gcu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.models.RegModel;

@Controller
@RequestMapping("/register")
public class UserRegController {

	@GetMapping("/")
	public String displayReg(Model model) 
	{
		
		model.addAttribute("regModel", new RegModel());
		return "UserReg.html";
	}
	
	@PostMapping("/processReg")
	public String processReg(RegModel regModel, Model model) 
	{
		return "redirect:/login/";
	}
	
}
