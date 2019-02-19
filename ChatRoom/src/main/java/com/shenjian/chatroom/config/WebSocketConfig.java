package com.shenjian.chatroom.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * @ClassName:WebSocketConfig
 * @description: WebSocket配置
 * @author: shen_jian
 * @date: 2019-02-18 14:49
 **/
@Configuration
/**
 *  开启使用Stomp协议来传输基于消息broker的消息，
 *  这是控制器支持使用@MessageMapping,就像@RequestMapping一样
 **/
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer{
	private Logger logger = LoggerFactory.getLogger(WebSocketConfig.class);
	/**
	 * @Author shen_jian
	 * @Description //注册Stomp协议的结点，并映射指定的url，
	 * @Date 15:03 2019/2/18 0018
	 * @Param [registry]
	 * @return void
	 **/
	public void registerStompEndpoints(StompEndpointRegistry registry){
		// 注册Stomp协议的结点(endpoint)，并映射指定的url，
		// 添加一个访问端点，客户端打开双通道时需要的url
		registry.addEndpoint("/endpointMark")
				.setAllowedOrigins("*")// 允许跨域访问
				.withSockJS();// 指定使用SockJS协议
	}

	/**
	 * @Author shen_jian
	 * @Description 配置消息代理
	 * @Date 15:20 2019/2/18 0018
	 * @Param [registry]
	 * @return void
	 **/
	public void configureMessageBroker(MessageBrokerRegistry registry){
		registry.enableSimpleBroker("/mass");
	}
}
