package at.stderr.springdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;

//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}

	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}

	// define setter method
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		System.out.println(">> TennisCouch: inside setFortuneService() method");
//		fortuneService = theFortuneService;
//	}

//	@Autowired
//	public void doSomeCracyStuff(FortuneService theFortuneService) {
//		System.out.println(">> TennisCouch: inside doSomeCrazyStuff() method");
//		fortuneService = theFortuneService;
//	}


	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
