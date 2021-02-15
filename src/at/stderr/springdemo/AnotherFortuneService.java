package at.stderr.springdemo;

public class AnotherFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is just another fortune!";
	}
}
