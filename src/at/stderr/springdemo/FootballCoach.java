package at.stderr.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public FootballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice shooting";
	}
	
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
