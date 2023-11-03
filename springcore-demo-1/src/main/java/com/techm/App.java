package com.techm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] arg) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springconf.xml");
		
		Student stu = context.getBean(Student.class);
	    
		System.out.println(stu);
	
	}
}
