package com.spring.basic.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class GetBadTaste implements GetTaste {
	@Override
	public String replyTaste() {
		return "Bad Taste";		
	}
}
