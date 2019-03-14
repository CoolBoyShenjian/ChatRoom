package com.shenjian.chatroom.controller;

import com.shenjian.chatroom.common.ResultData;
import com.shenjian.chatroom.entity.UserInfo;
import com.shenjian.chatroom.service.IRegisteService;
import com.shenjian.chatroom.service.ISignInService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @ClassName:RegisteController
 * @description: 用户注册
 * @author: shen_jian
 * @date: 2019-02-25 14:06
 **/
@Controller
public class SignInController {
	private static Logger logger = LoggerFactory.getLogger(SignInController.class);

	@Autowired
	ISignInService signInServiceImpl;
	@Autowired
	ResultData result;

	@PostMapping(value="/signIn")
	@ResponseBody
	public ResultData signIn(UserInfo userInfo,HttpServletRequest request){

		logger.info("signIn userInfo--> " + userInfo.toString());
//		获取到客户信息，进行登记
		result = signInServiceImpl.signIn(userInfo);
		if (StringUtils.isEmpty(result)){
			result.setResult("false");
			result.setReason("service 返回值为空");
			return result;
		}
		if ("success".equals(result.getResult())){
			String loginName = userInfo.getLoginName();
			HttpSession session = request.getSession();
			session.setAttribute("loginName",loginName);
			logger.info("signIn loginName--> " + loginName);
		}
		return result;
	}
}
