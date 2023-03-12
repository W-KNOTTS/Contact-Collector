package com.gcu.business;

import java.util.List;

import com.gcu.models.ContactModel;

public interface ContactBusinessServiceInterface 
{
	public List<ContactModel> getUser();//get contact list

    public void init();//init test function 

    public void destroy();//destroy test function
    
}
