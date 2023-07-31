package com.example.catalog;

import org.springframework.context.annotation.Bean;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "BeanAnnotation")
public class CatalogConfig {
	@Bean
	public CatalogData catalogBean()
	{
	 
	return new CatalogData();
	
	}


}
