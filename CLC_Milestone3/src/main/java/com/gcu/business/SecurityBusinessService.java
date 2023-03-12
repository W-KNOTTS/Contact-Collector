package com.gcu.business;

import org.springframework.stereotype.Service;

@Service
public class SecurityBusinessService 
{

	public boolean authenticate(String username, String password)
	{
		//hardcoded login 
		String usernameTest = "Contact";//username is Contact
		String passwordTest = "Collector";//password is Collector
		
		if(username.equals(usernameTest) && password.equals(passwordTest))//if statement to see if user name and password match the statically assigned values
		{
			return true;//validate if values match
		}
		
		return false;//error is values do not match
	}
}
