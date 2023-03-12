package com.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gcu.business.ContactBusinessService;
import com.gcu.business.ContactBusinessServiceInterface;

@Configuration
public class SpingConfig 
{
	@Bean(name = "contactBusinessService", initMethod = "init", destroyMethod = "destroy")//bean with test methods and working method
    public ContactBusinessServiceInterface getClientBusiness()
	{
        return new ContactBusinessService();
	}
}
