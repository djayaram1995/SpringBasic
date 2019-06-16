package com.spring.basic.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitaialApp {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("annotate-context.xml");
		AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		GetMenu gm = cxt.getBean("gettDosa", GetMenu.class);
		System.out.println(gm.getFood());
		cxt.close();

	}

}
