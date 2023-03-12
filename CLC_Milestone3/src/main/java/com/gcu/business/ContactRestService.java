package com.gcu.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.models.ContactModel;
//import com.gcu.models.ContactList;

@RestController
@RequestMapping("/service")
public class ContactRestService 
{
	@Autowired
    public ContactBusinessServiceInterface service;//autowired back to the interface

    @GetMapping(path = "/getjson", produces = {MediaType.APPLICATION_JSON_VALUE})//Maps to temp JSON DB at /service/getjson
    public List<ContactModel> getOrdersAsJson()//function to get JSON
    {
        return service.getUser();//returns the client list with getUser function
    }

    //XML TEST MAPPING/FUNCTION 
    /*@GetMapping(path = "/getxml", produces = {MediaType.APPLICATION_XML_VALUE})
    public ContactList getOrdersAsXml()
    {
    	ContactList contactList = new ContactList();
        contactList.setUser(service.getUser());
        return contactList;
    }*/
}
