package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		
		PersonDAO bean1 = applicationContext.getBean(PersonDAO.class);
		
		PersonDAO bean2 = applicationContext.getBean(PersonDAO.class);

		System.out.println(bean1);
		System.out.println(bean1.getJdbcConnection());
		
		System.out.println(bean2);
		System.out.println(bean2.getJdbcConnection());
	}
}
