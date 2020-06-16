package com.example.spring.application.basics.springbasics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.basics.xmlconfig.XmlBasedTestDao;

public class XmlBasedSpringBasicsApplication {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext classPathXmlApplicationContext = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml")) {
			XmlBasedTestDao xmlBasedTestDao = classPathXmlApplicationContext.getBean(XmlBasedTestDao.class);
			System.out.println(xmlBasedTestDao);
			System.out.println(xmlBasedTestDao.getXmlBasedMyConnection());
			System.out.println("Bean present in the Application Context --> ");
			String[] beans = classPathXmlApplicationContext.getBeanDefinitionNames();
			for (int i = 0 ; i < classPathXmlApplicationContext.getBeanDefinitionCount(); i++) {
				System.out.println(beans[i]);
			}
			System.out.println("Total number of beans --> " + classPathXmlApplicationContext.getBeanDefinitionCount());
		}
	}
}