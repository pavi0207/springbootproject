package com.example.enterprise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "BeanAnnotation")

public class EnterpriseConfig {
	@Bean
	public EnterpriseData enterpriseBean()
	{
	 
	return new EnterpriseData();
	
	}
}
