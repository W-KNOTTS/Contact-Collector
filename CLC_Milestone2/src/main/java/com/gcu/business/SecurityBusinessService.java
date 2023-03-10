package com.gcu.business;

import org.springframework.stereotype.Service;

@Service
public class SecurityBusinessService {

	public boolean authenticate(String username, String password)
	{
		//hardcoded login 
		String usernameTest = "Contact";
		String passwordTest = "Collector";
		
		if(username.equals(usernameTest) && password.equals(passwordTest))
		{
			return true;
		}
		
		return false;
	}
}
