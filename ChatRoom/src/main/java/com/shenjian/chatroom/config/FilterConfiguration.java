package com.shenjian.chatroom.config;

import com.shenjian.chatroom.filter.AccessFilter;
import com.shenjian.chatroom.filter.SingleChatAccessFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName:WebConfiguration
 * @description: 页面配置信息
 * @author: shen_jian
 * @date: 2018-11-16 10:21
 **/
@Configuration
public class FilterConfiguration {

	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}
	@Bean
	public FilterRegistrationBean filterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new AccessFilter());
		registration.addUrlPatterns("/*");
		registration.addInitParameter("paramName", "paramValue");
		registration.setName("AccessFilter");
		registration.setOrder(1);
		return registration;
	}
	@Bean
	public FilterRegistrationBean singleChatAccessFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new SingleChatAccessFilter());
		registration.addUrlPatterns("/html/single_chat.html");
		registration.addInitParameter("paramName", "paramValue");
		registration.setName("singleChatAccessFilter");
		registration.setOrder(2);
		return registration;
	}
}
