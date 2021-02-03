package at.stderr.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
//	public FootballCoach(FortuneService theFortuneService) {
//		System.out.println(">> FootballCoach: inside default constructor");		
//		// fortuneService = theFortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Practice shooting";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
