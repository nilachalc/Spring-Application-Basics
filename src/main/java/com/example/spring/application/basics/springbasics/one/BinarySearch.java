package com.example.spring.application.basics.springbasics.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearch {
	
	@Autowired
	@Qualifier(value = "selectionMethod")
	private SortingAlgorithem sortingAlgorithem;
	
	public Integer binarySearch(Integer[] inputArray, Integer item) {
		sortingAlgorithem.sort(inputArray);
		System.out.println(sortingAlgorithem);
		// Not Concentrating on the logic.
		return 10;
	}
}
