package com.rbobko.jokes;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class JokesApplication {

	@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes(){
		return new ChuckNorrisQuotes();
	}

	public static void main(String[] args) {
		SpringApplication.run(JokesApplication.class, args);
	}
}
