package com.example.spring.application.basics.springbasics.two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class TestDao {

	@Autowired
	private MyConnection myConnection;

	public MyConnection getMyConnection() {
		return myConnection;
	}

	public void setMyConnection(MyConnection myConnection) {
		this.myConnection = myConnection;
	}
}
