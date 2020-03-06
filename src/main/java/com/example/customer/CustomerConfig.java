package com.example.customer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class CustomerConfig {
	
	@Bean(name="customerBean")
	public Customer customer()
	{
		return new CustomerImplements();
	}

}
