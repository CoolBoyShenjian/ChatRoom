package com.shenjian.chatroom.config;

import com.shenjian.chatroom.interceptor.LoginInInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName:WebConfiguration
 * @description: 页面配置信息
 * @author: shen_jian
 * @date: 2018-11-16 10:21
 **/
@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInInterceptor()).addPathPatterns("/signIn");
	}
}
