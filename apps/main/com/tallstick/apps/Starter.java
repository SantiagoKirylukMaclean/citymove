package com.tallstick.apps;

import com.tallstick.shared.domain.Service;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan(
		includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class),
		value = {"com.tallstick.apps",
				 "com.tallstick.backoffice",
				"com.tallstick.rental",
				"com.tallstick.shared"}
)
public class Starter {
	public static void main(String[] args) {
		SpringApplication.run(Starter.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Let's inspect the beans provided by Spring Boot:");
			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}
}
