package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm quickSortAlgorithm;
	
	public int binarysearch(int[] numbers,int numberToSearch){		
		int[] bubbleSort = quickSortAlgorithm.sort(numbers);
		return 3;
	}
}
