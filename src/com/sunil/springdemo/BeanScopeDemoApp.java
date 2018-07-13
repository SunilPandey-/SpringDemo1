package com.sunil.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration files
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve beans from spring container
		Coach  theCoach = context.getBean("myCoach",Coach.class);
		Coach  alphaCoach = context.getBean("myCoach",Coach.class);
		
		boolean result =(theCoach == alphaCoach);// checks object reference
		System.out.println("\nPointing to same object: "+result);
		
		System.out.println("\nThe coach hashcode: "+ theCoach.hashCode());
		System.out.println("\nAlpha coach hashcode: "+ alphaCoach.hashCode()+"\n");
		
		// close the context
		context.close();

	}

}
