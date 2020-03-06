package com.example.invoice;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InvoiceConfig {
	
	@Bean(name="invoiceBean")
	public Invoice invoice()
	{
		return new InvoiceImplementation();
	}

}
