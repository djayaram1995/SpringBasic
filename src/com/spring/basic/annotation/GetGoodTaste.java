package com.spring.basic.annotation;

import org.springframework.stereotype.Component;

@Component
public class GetGoodTaste implements GetTaste {
	@Override
	public String replyTaste() {
		return "GoodTaste";		
	}
}
