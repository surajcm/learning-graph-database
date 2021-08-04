package com.suraj.learning;

import com.suraj.learning.neo.NeoController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningGraphDatabaseApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LearningGraphDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String response = NeoController.playWithNeo();
		System.out.println(response);
	}
}
