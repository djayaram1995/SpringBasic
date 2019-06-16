package com.spring.basic;

import java.util.Random;

public class GoodFeedback implements Feedback {
	private String[] feedback = {"Super food", "Great food", "Ok food"};
	@Override
	public String getFeedBack() {
		Random rand =new Random();
		return feedback[rand.nextInt(3)];

	}
}
