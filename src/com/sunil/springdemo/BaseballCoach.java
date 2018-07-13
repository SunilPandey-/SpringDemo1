package com.sunil.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public  BaseballCoach(FortuneService thefortuneService) {
		// TODO Auto-generated constructor stub
		fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spend 30 min on batting practise in baseball field";
	}

	@Override
	public String getDailyFortune() {
		
		// use my fortune service to give fortune
		return fortuneService.getFortune();
	}
	
	

}
