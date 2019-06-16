package com.spring.basic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitialApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		FoodStall food = cxt.getBean("indian", FoodStall.class);
		System.out.println(food.getFood());
		System.out.println(food.getFeedback());
		
		FoodStall Chinesefood = cxt.getBean("chinese", FoodStall.class);
		FoodStall Chinesefood2 = cxt.getBean("chinese", FoodStall.class);
		System.out.println(Chinesefood);
		System.out.println(Chinesefood2);
		System.out.println(Chinesefood.getFood());
		System.out.println(Chinesefood.getFeedback());
		cxt.close();
	}
}
