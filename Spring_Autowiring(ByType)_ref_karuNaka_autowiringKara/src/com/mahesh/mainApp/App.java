package com.mahesh.mainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahesh.modelByType.Employee;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/mahesh/resources/spring.xml");
		context.getBean("b1");
		context.getBean("c1");
		context.getBean("c2");
		Employee employee = (Employee) context.getBean("e1");
		employee.displayData();
	}

}
