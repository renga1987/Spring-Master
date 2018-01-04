package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;
	
	public int binarysearch(int[] numbers,int numberToSearch){		
		int[] bubbleSort = sortAlgorithm.sort(numbers);
		return 3;
	}
}
