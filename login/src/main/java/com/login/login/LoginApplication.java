package com.login.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
//automatically configure spring application base on their jar 
//dependencies that u have added
@EnableJpaRepositories(basePackages = "com.login.login.repositories")
//enable jpa repository.scan the package of annoted configuration class of spring data
//repository by default
@SpringBootApplication
public class LoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
		//run actually start whole spring framework
	}

}
