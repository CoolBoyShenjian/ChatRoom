package com.shenjian.chatroom.controller;

import com.shenjian.chatroom.entity.UserInfo;
import com.shenjian.chatroom.service.IRegisteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName:RegisteController
 * @description: 用户注册
 * @author: shen_jian
 * @date: 2019-02-25 14:06
 **/
@Controller
public class RegisteController {
	private static Logger logger = LoggerFactory.getLogger(RegisteController.class);

	@Autowired
	IRegisteService registeServiceImpl;
	@PostMapping(value="/registe")
	@ResponseBody
	public String registe(UserInfo userInfo){

		logger.info("userInfo--> " + userInfo.toString());
		//获取到客户信息，进行登记
		registeServiceImpl.registeUser(userInfo);
		return "success";
	}
}
