package com.spring.core.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringConstructorMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configConstructor.xml");
		Student student1 = (Student) context.getBean("student1");
		System.out.println(student1);
		
		Student student2 = (Student) context.getBean("student2");
		System.out.println(student2);
		
		Teacher teacher = (Teacher) context.getBean("teacher");
		System.out.println(teacher);
	}

}
                        