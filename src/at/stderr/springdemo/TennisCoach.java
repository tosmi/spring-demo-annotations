package at.stderr.springdemo;


import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Scope("prototype")
public class TennisCoach implements Coach {
	
	@Value("${foo.email}")
	private String email;

	@Autowired
	// @Qualifier("fileRandomFortuneService")
	private FortuneService fortuneService;

//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}

	public TennisCoach() {
		System.out.println(">> TennisCoach: " + this.getEmail());
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

	@PostConstruct
	private void printEmail() {
		
		System.out.println(">> @PostConstruct: " + this.email);
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public String getEmail() {
		return email;
	}
}
