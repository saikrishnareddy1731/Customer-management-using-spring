package com.example.invoice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;



public class InvoiceImplementation implements Invoice{
	
	int invoiceNumber;
	Invoice invoice;

	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public InvoiceImplementation()
	{}
	
	public InvoiceImplementation(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}


	LinkedList<Invoice> set = new LinkedList<>();
	
	
	@Override
	public void addInvoice(int number) {
		
	set.add(new InvoiceImplementation(number));	
	
	}

	public String toString()
	{
		return "Number:-"+invoiceNumber;
	}

	@Override
	public void listInvoice() {
Iterator<Invoice> iter = set.iterator();
		
		while(iter.hasNext())
		{
			invoice= (Invoice)iter.next();
			System.out.println(invoice.toString());
		}
		
		System.out.println();System.out.println();
	}
	

}
