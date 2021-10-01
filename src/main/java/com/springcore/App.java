package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");
        
       Student student1Object= (Student) applicationContext.getBean("student1");
       Student student2Object= (Student) applicationContext.getBean("student2");
       
       System.out.println(student1Object);
       System.out.println(student2Object);
        
       
    }
}
