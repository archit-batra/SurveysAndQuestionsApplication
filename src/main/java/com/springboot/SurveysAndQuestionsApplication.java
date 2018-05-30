package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class SurveysAndQuestionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurveysAndQuestionsApplication.class, args);
	}

	@Profile("prod")
	  @Bean
	  public String dummy() {
	    return "something";
	  }
}
