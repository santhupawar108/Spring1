package com.sun;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Employee emp = context.getBean("santhu",Employee.class);
		Project project = context.getBean("pawar",Project.class);
		System.out.println(emp.getEmployee());
		System.out.println(project.getProject());
		
		context.close();

	}

}
