package com.example.spring.application.basics.componentscantest;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.spring.application.basics.springbasics.two.MyConnection;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ComponentScanTestDao {

	@Autowired
	private MyConnection myConnection;

	public MyConnection getMyConnection() {
		return myConnection;
	}

	public void setMyConnection(MyConnection myConnection) {
		this.myConnection = myConnection;
	}
	
	@PostConstruct
	public void actionAfterBeanConstruction() {
		System.out.println("actionAfterBeanConstruction");
	}
	
	@PreDestroy
	public void actionBeforeBeanDestruction() {
		System.out.println("actionBeforeBeanDestruction");
	}
}
