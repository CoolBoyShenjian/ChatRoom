package com.shenjian.chatroom.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @ClassName:LoginInInterceptor
 * @description: 登录拦截器
 * @author: shen_jian
 * @date: 2019-03-08 15:58
 **/
public class LoginInInterceptor implements HandlerInterceptor{
	Logger logger = LoggerFactory.getLogger(LoginInInterceptor.class);
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		logger.info("This is LoginInInterceptor preHandle !");
		logger.info("This is LoginInInterceptor preHandle--> " + request.getRequestURI());
		return true;
	}
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
		logger.info("This is LoginInInterceptor postHandle !");
//		HttpSession session = request.getSession();
	}
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
	}
}
