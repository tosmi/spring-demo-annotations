package at.stderr.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		
		// get bean from spring container
		Coach theCoach = context.getBean("footballCoach", Coach.class);
		// call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		// close the context
		context.close();
	}

}
