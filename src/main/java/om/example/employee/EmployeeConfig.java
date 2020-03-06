package om.example.employee;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
	@Bean(name="employeeBean")
	public Employee employee()
	{
		return new EmployeeImplementation();
	}

}

