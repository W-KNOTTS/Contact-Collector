package com.gcu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.business.ContactBusinessServiceInterface;
import com.gcu.business.SecurityBusinessService;
//import com.gcu.models.ContactModel;
import com.gcu.models.LoginModel;
import com.gcu.models.RegModel;

import jakarta.validation.Valid;
//import com.gcu.models.RegModel;

@Controller
@RequestMapping("/login")
public class LoginController 
{
	//private static ContactModel newContact1;

	 @Autowired
	  private ContactBusinessServiceInterface service;
	
	//Dependency injection for security
	@Autowired
	private SecurityBusinessService security;

	@GetMapping("/")
	public String displayLogin(Model model) // login page displayed using model
	{
		
		model.addAttribute("loginModel", new LoginModel());
		return "login.html";//return the login.html page
	}
	
	@PostMapping("/processLogin")
	public String processLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) 
	{
		
		//Dependency injection for security
		if(security.authenticate(loginModel.getUsername(), loginModel.getPassword()) == true)
		{
			
			model.addAttribute("user", service.getUser());// uses ContactBusinessServiceInterface 
			
			return "user.html";//return this html page
		}
		else 
		{
			model.addAttribute("errorMessage", "Invalid username or password");//error message
			return "Login";
		}
	}
	
	@PostMapping("/processReg")//mapping for registration
	public String processReg(RegModel regModel, Model model1) 
	{
		return "redirect:/register/";//redirect to the register page
	}
	
	
}
