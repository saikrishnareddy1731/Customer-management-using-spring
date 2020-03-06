package om.example.employee;

import java.util.Iterator;
import java.util.LinkedList;

import org.springframework.stereotype.Component;

@Component
public class EmployeeImplementation implements Employee{
	
	String empName;
	Employee objEmployee;
	
	
	public String toString()
	{
		return "Name:-"+empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	LinkedList<Employee> list = new LinkedList<>();
	
	public EmployeeImplementation()
	{
		//default
	}
	
	public EmployeeImplementation(String name) {
		
		this.empName=name;
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public void addEmployee(String name) {
		
	list.add(new EmployeeImplementation(name));	
	}

	
	
	@Override
	public void listEmployee() 
	{
		
		Iterator<Employee> iter = list.iterator();
		
		while(iter.hasNext())
		{
			objEmployee= (Employee)iter.next();
			System.out.println(objEmployee.toString());
		}
		System.out.println();System.out.println();
	}
	

	
}
