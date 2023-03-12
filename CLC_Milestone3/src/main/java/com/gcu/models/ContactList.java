package com.gcu.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;


//TEST CLASS FOR XML MOCK DB
@XmlRootElement(name = "user")
public class ContactList 
{
	List<ContactModel> user = new ArrayList<ContactModel>();
	
	@XmlElement(name = "user")
	public List<ContactModel> getUser()
	{
		return user;
	}
	
	public void setUser(List<ContactModel> user)
	{
		this.user = user;
	}
}
