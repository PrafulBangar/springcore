package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollections {

	public static void main(String[] args) {

		
		ApplicationContext applicationContext=new  ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		
		Emp emp1Objcet=(Emp) applicationContext.getBean("emp1");
		
		System.out.println(emp1Objcet.getEmployeeName());
		System.out.println(emp1Objcet.getAddresses());
		System.out.println(emp1Objcet.getPhones());
		System.out.println(emp1Objcet.getCourses());
		
		System.out.println("ends");
	}

}

