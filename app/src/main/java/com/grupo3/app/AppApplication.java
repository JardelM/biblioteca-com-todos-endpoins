package com.grupo3.app;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class AppApplication {

	@Bean
	public ModelMapper modelMap(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}