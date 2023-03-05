package com.gcu.models;

public class ContactModel 
{
	public Long id;
	public String firstN;
	public String lastN;
	public String phone;
	public String email;
	public String address;
	
	public ContactModel(long id, String firstN, String lastN, String phone, String email, String address) 
	{
		setid(id);
		setfirstN(firstN);
		setlastN(lastN);
		setphone(phone);
		setemail(email);
		setaddress(address);
		
		String client = getid() + ", " + getfirstN() + ", " + getlastN() + ", " + getphone() + ", " + getemail() + ", " + getaddress();
		System.out.println("Profile Information: " + client);
	}
	
	  //Getters and setters for client profile
	  public Long getid() 
	  {		  
	      return id;
	  }
	
	  // Setter
	  public void setid(Long id) 
	  { 
	    this.id = id;
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
}