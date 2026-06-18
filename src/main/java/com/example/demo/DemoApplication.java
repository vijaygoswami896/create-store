package com.example.demo;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//Configuration of dotenv-java
		Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();

   		dotenv.entries().forEach(dotenvEntry -> System.setProperty(dotenvEntry.getKey(),dotenvEntry.getValue()));

		SpringApplication.run(DemoApplication.class, args);
	}

}
