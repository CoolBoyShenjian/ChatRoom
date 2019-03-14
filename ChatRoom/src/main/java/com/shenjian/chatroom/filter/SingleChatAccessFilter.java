package com.shenjian.chatroom.filter;

import com.shenjian.chatroom.entity.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @ClassName:MyFilter
 * @description: 过滤器
 * @author: shen_jian
 * @date: 2018-11-16 10:22
 **/
public class SingleChatAccessFilter implements Filter {
	Logger logger = LoggerFactory.getLogger(SingleChatAccessFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		String requestUrl = request.getRequestURI();
		logger.info("this is SingleChatAccessFilter getRequestURI:" + requestUrl);
		// 判断是否有请求地址没有则跳往首页
		if (StringUtils.isEmpty(requestUrl)){
			response.sendRedirect("index.html");
			return;
		}
		// 判断是否登录，未登录则跳转到登录页面
		HttpSession session = request.getSession();
		logger.info("session id -->" + session.getId());
		String loginName = (String) session.getAttribute("loginName");
		if (StringUtils.isEmpty(loginName)){
			logger.info("这是单人聊天室的Filter--> 没有登录所以跳转到首面");
			response.sendRedirect("/html/index.html");
			return;
		}
		response.setContentType("text/xml;charset=UTF-8");
		filterChain.doFilter(request, response);
	}
	@Override
	public void destroy() {

	}
}
