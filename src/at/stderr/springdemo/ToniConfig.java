package at.stderr.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToniConfig {
	
	@Bean
	public FortuneService anotherFortuneService() {
		return new AnotherFortuneService(); 
	}
	
	@Bean
	public Coach toniCoach() {
		return new ToniCoach(anotherFortuneService());
	}

}
