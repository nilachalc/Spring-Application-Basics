package com.example.spring.application.basics.springbasics.one;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "bubbleMethod")
public class BubbleSort implements SortingAlgorithem {

	@Override
	public void sort(Integer[] inputArray) {
		// Not Concentrating on the logic.
	}
}
