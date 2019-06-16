package com.spring.basic;

public class ChineseStall implements FoodStall {
	private Feedback feedback;
	private String emailAddress;
	private String specialDish;
	
	public ChineseStall() {
		System.out.println("Chinese food Constructor");
	}

	public void setFeedback(Feedback feedback) {
		System.out.println("Chinese food Setter"+ feedback.getFeedBack());
		this.feedback = feedback;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setSpecialDish(String specialDish) {
		this.specialDish = specialDish;
	}

	@Override
	public String getFood() {
		System.out.println(emailAddress);
		System.out.println(specialDish);
		return "Take yum yum noodles";
	}

	@Override
	public String getFeedback() {
		return feedback.getFeedBack();
	}
	
	private void doInit() {
		System.out.println("in init");
	}
	private void doDestroy() {
		System.out.println("in destroy");
	}
}
