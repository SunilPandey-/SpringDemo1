package com.sunil.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// add new literal fields email and team
	private String emailAddress;
	private String team;
	
	// create no-arg constructor
	public CricketCoach() {
		System.out.println("Cricket Coach: inside no-org constructor");
	}
	// our setter method which will be called by spring while injecting dependency
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}


	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket Coach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println("Cricket Coach: inside setter method - setTeam");
		this.team = team;
	}
	@Override
	public String getDailyWorkout() {
		return "Pracise fast bowling for 15 minute a day ";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
