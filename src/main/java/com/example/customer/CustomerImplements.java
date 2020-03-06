package com.example.customer;

import java.util.Iterator;
import java.util.LinkedList;

public class CustomerImplements implements Customer{
	
	String customerName;
	Customer objCustomer;
	public CustomerImplements() 
	{
		
	}

	public CustomerImplements(String name)
	{
		this.customerName=name;
	}
	LinkedList<Customer> set = new LinkedList<>();
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public void addCustomer(String name) {
		
		set.add(new CustomerImplements(name));	
		
	}

	public String toString()
	{
		return "Name:-"+customerName;
	}

	@Override
	public void listCustomer() {
Iterator<Customer> iter = set.iterator();
		
		while(iter.hasNext())
		{
			objCustomer= (Customer)iter.next();
			System.out.println(objCustomer.toString());
			
		}
		System.out.println();
		System.out.println();
	
		
	}

}

