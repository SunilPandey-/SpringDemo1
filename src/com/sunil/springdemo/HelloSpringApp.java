package com.sunil.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
	
		
		//retrieve bean from spring container
		//Coach theCoach1 = context.getBean("myCoach1", Coach.class);
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on bean
		System.out.println("The coach: "+theCoach.getDailyWorkout());
		System.out.println("The coach fortune: "+theCoach.getDailyFortune());
		
		//System.out.println("The coach: "+theCoach1.getDailyWorkout());
		//System.out.println("The coach fortune: "+theCoach1.getDailyFortune());
		
		
		//close the context
		context.close();
	}

}
