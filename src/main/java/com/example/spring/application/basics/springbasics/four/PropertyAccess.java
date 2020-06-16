package com.example.spring.application.basics.springbasics.four;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyAccess {
	@Value(value = "${external.final.uri}")
	private String uri;

	public String getUri() {
		return uri;
	}
}
