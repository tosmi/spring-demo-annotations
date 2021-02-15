package at.stderr.springdemo;

public class ToniCoach implements Coach {
	
	private FortuneService fortuneService;

	public ToniCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Carry Toni 5km";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
