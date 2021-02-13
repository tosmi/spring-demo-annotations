package at.stderr.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
// @ComponentScan("at.stderr.springdemo")
public class SportConfig {
	
	@Bean
	public FortuneService sadFortuneService () {
		return new SadFortuneService();
	}
	
	@Bean 
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
