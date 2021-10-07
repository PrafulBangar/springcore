package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestReferenceExample {

    public static void main(String[] args) {

	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/reference/referenceconfig.xml");
	DependentClass obj=(DependentClass) context.getBean("dependentbean");
	
	System.out.println(obj.getA());
	System.out.println(obj.getDepObj().getVariable_a());

    
    }

}
