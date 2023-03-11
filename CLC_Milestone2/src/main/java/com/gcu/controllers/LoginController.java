package com.gcu.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.business.SecurityBusinessService;
import com.gcu.models.ContactModel;
import com.gcu.models.LoginModel;
import com.gcu.models.RegModel;

import jakarta.validation.Valid;
//import com.gcu.models.RegModel;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	//Dependency injection for security
	@Autowired
	private SecurityBusinessService security;

	@GetMapping("/")
	public String displayLogin(Model model) {
		
		model.addAttribute("loginModel", new LoginModel());
		return "login.html";
	}
	/*
	@GetMapping("/register")
	public String displayReg(Model model1) 
	{
		
		model1.addAttribute("regModel", new RegModel());
		return "UserReg.html";
	}
	*/
	@PostMapping("/processLogin")
	public String processLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) 
	{
		
		//Dependency injection for security
		if(security.authenticate(loginModel.getUsername(), loginModel.getPassword()) == true)
		{
			List<ContactModel> user = new ArrayList<ContactModel>();
			user.add(new ContactModel(0L, "William1", "Knotts", "315-489-9107", "wknotts1@my.gcu.edu", "1230 address"));
			user.add(new ContactModel(1L, "William2", "Knotts", "315-489-9107", "wknotts2@my.gcu.edu", "1231 address"));
			user.add(new ContactModel(2L, "William3", "Knotts", "315-489-9107", "wknotts3@my.gcu.edu", "1232 address"));
			user.add(new ContactModel(3L, "William4", "Knotts", "315-489-9107", "wknotts4@my.gcu.edu", "1233 address"));
			user.add(new ContactModel(4L, "William5", "Knotts", "315-489-9107", "wknotts5@my.gcu.edu", "1234 address"));
	
			
			//model.addAttribute("loginModel", loginModel);
			model.addAttribute("user", user);
			
			return "user";
		}
		else 
		{
			model.addAttribute("errorMessage", "Invalid username or password");
			return "Login";
		}
	}
	
	@PostMapping("/processReg")
	public String processReg(RegModel regModel, Model model1) 
	{
		return "redirect:/register/";
	}
	
	
}
