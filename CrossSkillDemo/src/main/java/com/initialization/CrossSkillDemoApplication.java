package com.initialization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.daos","com.services","com.controllers"})
@EnableJpaRepositories(basePackages = "com.repos")
@EntityScan("com.entity")
public class CrossSkillDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrossSkillDemoApplication.class, args);
	}

}
