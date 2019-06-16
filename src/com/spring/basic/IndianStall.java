package com.spring.basic;

public class IndianStall implements FoodStall {
	private Feedback feedback;
	
	public IndianStall(Feedback feedback) {
		this.feedback = feedback;
	}

	@Override
	public String getFood() {
		return "Take yum yum idli";
	}
	@Override
	public String getFeedback() {
		return feedback.getFeedBack();
	}
}
