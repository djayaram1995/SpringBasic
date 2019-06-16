package com.spring.basic.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.spring.feedback.FeedbackBean;

@Configuration
@ComponentScan("com.spring.basic")
@PropertySource("classpath:chinese.properties")
public class ApplicationConfig {

	@Bean
	public FeedbackBean feedback() {
		return new FeedbackBean();
	}
}
