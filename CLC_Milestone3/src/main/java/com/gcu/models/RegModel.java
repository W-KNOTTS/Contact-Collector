package com.gcu.models;

public class RegModel 
{
	//sets the variables for the registration form
  	private String username;
	private String password;
	public Long id;
	public String firstN;
	public String lastN;
	public String phone;
	public String email;
	public String address;
	
	//reg model strings
	public RegModel(String username, String password, Long id, String firstN, String lastN, String phone, String email, String address) 
	{
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstN = firstN;
		this.lastN = lastN;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}
	
	public RegModel() 
	{
		super();
	}
	
	@Override
	public String toString() //super string 
	{
		return "RegModel [id=" + id + ", firstN=" + firstN + ", lastN=" + lastN + ", phone=" + phone + ",email=" + email + ", address=" + address + "]";
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
	  //getter
	  public String getUsername() 
	  {
			return username;
	  }
		//setter
	  public void setUsername(String username) 
	  {
			this.username = username;
	  }
		//getter
	  public String getPassword() 
	  {
		  return password;
	  }
		//setter
	  public void setPassword(String password) 
	  {
			this.password = password;
	  }
	
}
