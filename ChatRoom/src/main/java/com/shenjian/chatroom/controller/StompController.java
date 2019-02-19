package com.shenjian.chatroom.controller;

import com.shenjian.chatroom.entity.RequestMessageInfo;
import com.shenjian.chatroom.entity.ResponseMessageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @ClassName:StompController
 * @description: 接收用户发送的消息，并做相关处理
 * @author: shen_jian
 * @date: 2019-02-18 15:41
 **/
@Controller
public class StompController {
	private Logger logger = LoggerFactory.getLogger(StompController.class);

	/**
	 * @Author shen_jian
	 * @Description // 群聊
	 * @Date 15:52 2019/2/18 0018
	 * @Param [requestMessageInfo]
	 * @return com.shenjian.chatroom.entity.ResponseMessageInfo
	 **/
	@MessageMapping("/massRequest")// 类似于requestMapping
	@SendTo("/mass")
	public ResponseMessageInfo mass(RequestMessageInfo requestMessageInfo){
		logger.info("用户："+requestMessageInfo.getSenderId()+" 发送的信息是：" + requestMessageInfo.getSendInfo());
		ResponseMessageInfo responseMessageInfo = new ResponseMessageInfo();
		responseMessageInfo.setSenderId(requestMessageInfo.getSenderId());
		responseMessageInfo.setSendInfo(requestMessageInfo.getSendInfo());
		return responseMessageInfo;
	}

	/**
	 * @Author shen_jian
	 * @Description // 单人聊天
	 * @Date 15:52 2019/2/18 0018
	 * @Param [requestMessageInfo]
	 * @return com.shenjian.chatroom.entity.ResponseMessageInfo
	 **/
	@MessageMapping("/singleRequest")
	public ResponseMessageInfo singleChat(RequestMessageInfo requestMessageInfo){
		logger.info("用户："+requestMessageInfo.getSenderId()+" 发送的信息是："
				+ requestMessageInfo.getSendInfo() + "接收者是：" + requestMessageInfo.getReceiverId());
		ResponseMessageInfo responseMessageInfo = new ResponseMessageInfo();
		responseMessageInfo.setSenderId(requestMessageInfo.getSenderId());
		responseMessageInfo.setSendInfo(requestMessageInfo.getSendInfo());
		return responseMessageInfo;
	}
}
