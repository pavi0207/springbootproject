package com.example.order_consumer;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "BeanAnnotation")

public class OrderConsumerConfig {
	@Bean
	public OrderConsumerData OrderBean()
	{
	 
	return new OrderConsumerData();
	
	}

}
