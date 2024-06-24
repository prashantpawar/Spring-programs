package com.springBeansScopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EmployeeConfig {

	@Bean(name="employee1")
	@Scope("prototype")
	public Employee getEmployee(){
		
		return new Employee();
	}
	
}
