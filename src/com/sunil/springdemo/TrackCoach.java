package com.sunil.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}
	
	public TrackCoach(FortuneService thefortuneService) {
		//
		fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "spend time 30 min in Track";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do it !"+fortuneService.getFortune();
	}

	
	// add an init method
	public void doMyStartupStuff(){
		System.out.println("Track Coach: inside method doMyStartupStuff ");
	}
	
	// add an destroy method
	public void doMyCleanupStuffYoYo(){
		System.out.println("Track Coach: inside method doMyCleanupStuff ");
	}
	
	
	
}
