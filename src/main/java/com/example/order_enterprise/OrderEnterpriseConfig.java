package com.example.order_enterprise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "BeanAnnotation")

public class OrderEnterpriseConfig {
	@Bean
	public OrderEnterpriseData orderenterpriseBean()
	{
	 
	return new OrderEnterpriseData();
	
	}
}
