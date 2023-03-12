package com.gcu.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LoginModel 
{

	@NotNull(message="User name is a required field")//with the HTML the username field will be checked if it is empty
	@Size(min=1, max=32, message="User Name must be between 1 and 32 characters")//another check is string size
	private String username;//username string
	
	@NotNull(message="Password is a required field")//with the HTML the password field will be checked if it is empty
	@Size(min=1, max=32, message="Password must be between 1 and 32 characters")//another check is string size
	private String password;//password string
	
	public String getUsername() //get username function 
	{
		return username;//return username value
	}
	public void setUsername(String username) //set username string function
	{
		this.username = username;//sets that usermane value
	}
	public String getPassword() //get password fucntion
	{
		return password;//return password value
	}
	public void setPassword(String password) //set password string function
	{
		this.password = password;//set that password value 
	}
	
}
