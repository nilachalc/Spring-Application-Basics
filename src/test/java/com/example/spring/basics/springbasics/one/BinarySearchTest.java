package com.example.spring.basics.springbasics.one;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.spring.application.basics.springbasics.SpringApplicationBasics;
import com.example.spring.application.basics.springbasics.one.BinarySearch;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringApplicationBasics.class)
public class BinarySearchTest {
	
	@Autowired
	private BinarySearch binarySearch; 
	
	@Test
	public void test_binarySearch() {
		Integer result = binarySearch.binarySearch(new Integer[] {1, 2, 10}, new Integer(10));
		assertEquals(new Integer(10), result);
	}
}
