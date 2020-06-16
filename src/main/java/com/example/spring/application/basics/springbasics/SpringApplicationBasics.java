package com.example.spring.application.basics.springbasics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.spring.application.basics.springbasics.four.PropertyAccess;

@Configuration
@ComponentScan(value = "com.example.spring.application.basics")
@PropertySource(value = "App.properties")
public class SpringApplicationBasics {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext(SpringApplicationBasics.class)) {
			PropertyAccess propertyAccess = annotationConfigApplicationContext.getBean(PropertyAccess.class);
			System.out.println(propertyAccess.getUri());
		}
	}
}