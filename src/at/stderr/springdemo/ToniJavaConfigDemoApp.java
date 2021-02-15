package at.stderr.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ToniJavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ToniConfig.class);

		Coach theCoach = context.getBean("toniCoach", ToniCoach.class);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();
	}
}
