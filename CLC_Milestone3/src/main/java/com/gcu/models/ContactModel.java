package com.gcu.models;

public class ContactModel 
{
	  //public  Long id;
	  public  String firstN;
	  public  String lastN;
	  public  String phone;
	  public  String email;
	  public  String address;
	

	  public ContactModel(String firstN, String lastN, String phone, String email, String address) //long id, 
	  {
		//this.id = id;
		this.firstN = firstN;
		this.lastN = lastN;
		this.phone = phone;
		this.email = email;
		this.address = address;
	  }
	
	  public ContactModel() 
	  {
		//this.id = (long)0;
		this.firstN = "";
		this.lastN="";
		this.phone="";
		this.email="";
		this.address = "";
	  }
	  
	  //Getter
	  public String getfirstN() 
	  {
	      return firstN;
	  }
	
	  // Setter	  
	  public void setfirstN(String firstN) 
	  { 
		  this.firstN = firstN;
	  }
	  
	  //Getter
	  public String getlastN() 
	  {  
	      return lastN;
	  }
	
	  // Setter	  
	  public void setlastN(String lastN) 
	  { 
	    this.lastN = lastN;
	  }
	  
	  //Getter
	  public String getphone() 
	  {
		  
	      return phone;
	  }
	
	  // Setter	  
	  public void setphone(String phone) 
	  { 
	    this.phone = phone;
	  }  
	  
	  //Getter
	  public String getemail() 
	  {
		  
	      return email;
	  }
	  //Setter
	  public void setemail(String email) 
	  { 
	    this.email = email;
	  }
	
	  //Getter  
	  public String getaddress() 
	  {
		  
	      return address;
	  }
	  //Setter
	  public void setaddress(String address) 
	  { 
	    this.address = address;
	  }
	  
	  //New contact model function
	  public ContactModel addContact(ContactModel newCon) 
	  {
		  return newCon;
	  }

}