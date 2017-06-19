package com.hp.workflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class HumanTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumanTaskApplication.class, args);
	}
}
