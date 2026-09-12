package com.spring.core.springInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInterfaceMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("configSpringInterface.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);

		context.registerShutdownHook(); // This method is not present in ApplicationContext interface
		
		
	}

}
