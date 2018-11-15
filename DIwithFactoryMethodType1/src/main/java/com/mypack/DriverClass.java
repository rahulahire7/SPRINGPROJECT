package com.mypack;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class DriverClass {  
	public static void main(String[] args) {  
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");  
		A a=(A)context.getBean("a");  
		a.msg();  
	}  
}