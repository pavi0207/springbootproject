package com.example.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "BeanAnnotation")
public class ServiceConfig {
	@Bean
	public ServiceData serviceBean()
	{
	 
	return new ServiceData();
	
	}
	
	
	
}
