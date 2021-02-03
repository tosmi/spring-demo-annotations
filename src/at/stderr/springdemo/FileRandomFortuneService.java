package at.stderr.springdemo;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FileRandomFortuneService implements FortuneService {

	private Random myRandom = new Random();
	
	private String fortuneFile;
	
	public FileRandomFortuneService() {
		this.fortuneFile  = this.getClass().getResource("/fortunes").getFile();
	}
	
	private String[] readFortunes(String filename) {
		List<String> fortunes = Collections.emptyList();
		
		try {
			fortunes = Files.readAllLines(Path.of(fortuneFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return fortunes.toArray(new String[0]);
	}
			
	@Override
	public String getFortune() {
		Class clazz = FileRandomFortuneService.class;
		URL url = clazz.getResource("/fortunes");
		
		System.out.println(">>> Class: " + clazz); 
		System.out.println(">>> URL: " + url.getFile());
		
		String[] data = readFortunes(fortuneFile);
		
		var index = myRandom.nextInt(data.length); 
		String theFortune = data[index];
		
		return theFortune;
	}
	
	@PostConstruct
	private void numberOfFortunes() {
		Class clazz = FileRandomFortuneService.class;
		URL url = clazz.getResource("/fortunes");
		
		System.out.println(">>> Class: " + clazz); 
		System.out.println(">>> URL: " + url);
		
		String[] data = readFortunes(fortuneFile);

		System.out.println(">>> Number of fortunes: " + data.length);
	}
}
