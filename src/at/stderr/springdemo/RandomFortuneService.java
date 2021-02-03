package at.stderr.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data = {
			"Beware of the wolf in the sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		var index = myRandom.nextInt(data.length); 
		// TODO Auto-generated method stub
		String theFortune = data[index];
		
		return theFortune;
	}

}
