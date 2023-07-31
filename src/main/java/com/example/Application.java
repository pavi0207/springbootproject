package com.example;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.catalog.CatalogConfig;
import com.example.catalog.CatalogData;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CatalogConfig.class);
		SpringApplication.run(Application.class, args);

		CatalogData catalog = context.getBean("catalogBean", CatalogData.class);
		
		
	catalog.test();

		
	}
	}


