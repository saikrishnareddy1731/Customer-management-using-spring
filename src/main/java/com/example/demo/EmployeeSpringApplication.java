package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.example.customer.Customer;
import com.example.customer.CustomerConfig;
import com.example.invoice.Invoice;
import com.example.invoice.InvoiceConfig;

import om.example.employee.Employee;
import om.example.employee.EmployeeConfig;



@SpringBootApplication
@ComponentScan({"com.example"})
@Import({EmployeeConfig.class,CustomerConfig.class,InvoiceConfig.class})
@EnableAutoConfiguration
public class EmployeeSpringApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		ApplicationContext ctxemployee = SpringApplication.run(EmployeeConfig.class);
		ApplicationContext ctxcustomer = SpringApplication.run(CustomerConfig.class);
		ApplicationContext ctxinvoice = SpringApplication.run(InvoiceConfig.class);
		
		Employee objEmployee = (Employee)ctxemployee.getBean("employeeBean");
		Customer objCustomer = (Customer)ctxcustomer.getBean("customerBean");
		Invoice objInvoice =(Invoice)ctxinvoice.getBean("invoiceBean");
		
		int choice  = 0;
		
		while(choice!=7)
		{
			System.out.println("Enter your choice");
			System.out.println(" 1) store employee \n 2) load employee \n 3) store customer \n 4) load customer \n5 store invoice \n6) load invoice \n 7) Exit ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the employee name");
				String name=sc.next();
				objEmployee.addEmployee(name);
				System.out.println("employee stored");

				break;
			
			case 2:
				System.out.println("Employee details are");
				objEmployee.listEmployee();
				break;
			
			case 3:
				System.out.println("Enter the customer name");
				String cname=sc.next();
				objCustomer.addCustomer(cname);
				System.out.println("customer stored");

				break;
			
			case 4:
				System.out.println("Customer details are");
				objCustomer.listCustomer();
				break;
			
			case 5:
				System.out.println("Enter the invoice number");
				int invoiceNumber=sc.nextInt();
				objInvoice.addInvoice(invoiceNumber);
				System.out.println("invoice stored");

				break;
			
			case 6:
				System.out.println("invoice details are");
				objInvoice.listInvoice();;
				
				break;
			
			default:
				
				break;
				
			}
			
			
		}
		


	}

}
