package com.shenjian.chatroom.service;

import com.shenjian.chatroom.common.ResultData;
import com.shenjian.chatroom.dao.ISignInDao;
import com.shenjian.chatroom.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName:SignInServiceImpl
 * @description: TODO
 * @author: shen_jian
 * @date: 2019-03-11 15:05
 **/
@Service
public class SignInServiceImpl implements ISignInService {
	@Autowired
	ISignInDao signInDaoImpl;
	@Autowired
	ResultData result;
	@Override
	public ResultData signIn(UserInfo userInfo) {
		result = signInDaoImpl.signIn(userInfo);
		return result;
	}
}
