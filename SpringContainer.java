package com.springBeansScopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringContainer {

	public static void main(String[] args) {

		//Spring IOC Container
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);

		//Employee employee = new Employee();

		Employee employee1 = (Employee)context.getBean("employee1");
		System.out.println(employee1.hashCode());

		//System.out.println(employee1.toString());	

		Employee employee2 = (Employee)context.getBean("employee1");
		System.out.println(employee2.hashCode());

		//System.out.println(employee2.toString());
		
		
	}

}
