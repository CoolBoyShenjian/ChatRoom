package com.shenjian.chatroom.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @ClassName:MyFilter
 * @description: 过滤器
 * @author: shen_jian
 * @date: 2018-11-16 10:22
 **/
public class AccessFilter implements Filter {
	Logger logger = LoggerFactory.getLogger(AccessFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		String requestUrl = request.getRequestURI();
		logger.info("this is AccessFilter getRequestURI:" + requestUrl);
		response.setContentType("text/xml;charset=UTF-8");
		if (StringUtils.isEmpty(requestUrl) || "/".equals(requestUrl)){
			logger.info("requestUrl 为空");
			response.sendRedirect("/html/index.html");
			return;
		}
		filterChain.doFilter(request, response);
	}
	@Override
	public void destroy() {

	}
}
