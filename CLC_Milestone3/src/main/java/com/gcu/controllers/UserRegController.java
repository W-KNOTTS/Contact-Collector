package com.gcu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gcu.business.ContactBusinessService;
import com.gcu.models.ContactModel;
import com.gcu.models.RegModel;

@Controller
@RequestMapping("/register")
public class UserRegController 
{
	@GetMapping("/")
	public String displayReg(Model model) 
	{
		
		model.addAttribute("regModel", new RegModel());
		return "UserReg.html";
	}
	
	@PostMapping("/processReg")
	public String processReg(RegModel regModel, Model model, @RequestParam("firstN") String firstN, @RequestParam("lastN") String lastN, @RequestParam("phone") String phone, @RequestParam("email") String email, @RequestParam("address") String address) 
	{
		//Test block to validate that the value from the html form is passed to the spring boot program by printing the values to the terminal
		System.out.println("The First Name is: " + firstN);
		regModel.setfirstN(firstN);
        System.out.println("The Last Name is: " + lastN);
        regModel.setfirstN(lastN);
        System.out.println("The Phone Number is: " + phone);
        regModel.setfirstN(phone);
        System.out.println("The Emaile is: " + email);
        regModel.setfirstN(email);
        System.out.println("The Address is: " + address);
        regModel.setfirstN(address);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        ContactModel newContact = new ContactModel(firstN, lastN, phone, email, address);//new list with string
        ContactBusinessService.getNewContact(newContact);
		return "redirect:/login/";

	}
	
}
