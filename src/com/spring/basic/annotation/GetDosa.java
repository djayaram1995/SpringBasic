package com.spring.basic.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.spring.basic.Feedback;
import com.spring.feedback.FeedbackBean;

@Component("gettDosa")
public class GetDosa implements GetMenu {
	
	@Autowired
	@Qualifier("getBadTaste")
	private GetTaste getTaste;
	
	@Autowired
	@Qualifier("getBadTaste")
	private GetTaste getTaster;
	@Autowired
	public FeedbackBean feedBack;
	
	
	
	@PostConstruct
	public void doBad() {
		System.out.println(feedBack.goodFeedback());
		System.out.println(getTaste);
		System.out.println(getTaster);
	}
	@PreDestroy
	public void doBadder() {
		System.out.println(email);
	}
	@Value("${email}")
	private String email;
	
	// Constructor injection
//	@Autowired
//	public GetDosa(GetTaste getTaste) {
//		this.getTaste = getTaste;
//	}
	// Setter injection
//	@Autowired
//	public void setGetTaste(GetTaste getTaste) {
//		this.getTaste = getTaste;
//	}
	// Method injection
//	@Autowired
//	public String video(GetTaste getTaste) {
//		this.getTaste = getTaste;
//		return getTaste.replyTaste();
//		
//	}
	
	@Override
	public String getFood() {
		return "Have dosa "+email+ getTaste.replyTaste();
	}
	
	@Override
	public String getTasteDetails() {
		return getTaste.replyTaste();
	}
}
