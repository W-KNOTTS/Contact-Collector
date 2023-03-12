package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import com.gcu.models.ContactModel;

public class ContactBusinessService implements ContactBusinessServiceInterface
{
    List<ContactModel> user = new ArrayList<ContactModel>();//Create user Contact Model
	private static ContactModel newContact1;//Create a static user Contact Model
	public static void getNewContact(ContactModel newContact) 
	{
		newContact1 = newContact;
	}
	
	@Override
	public List<ContactModel> getUser()//get user from the interface
	{
		
		user.add(newContact1);//add registered contact to the top of the list
		for(int i=0; i<10;i++)//iterate over the static item 10 times to make a fuller list
		{
			user.add(new ContactModel("William"+i, "Knotts"+i, "315-489-5555"+i, i+"wknotts1@my.gcu.edu", i+"1230 address"));//static list item with i for iterating and creating a unique 
			
		}
		return user; //return the list 
	}
	
	
	
	@Override
    public void init() //test functions to make sure the requirements are functioning
	{
		
        System.out.println("Hello from init()");
        
    }

    @Override
    public void destroy() //test functions to make sure the requirements are functioning
    {
        System.out.println("Hello from destroy()");
    }
}
