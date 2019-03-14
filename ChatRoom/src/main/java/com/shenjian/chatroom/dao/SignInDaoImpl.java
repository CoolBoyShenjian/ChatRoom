package com.shenjian.chatroom.dao;

import com.shenjian.chatroom.common.ResultData;
import com.shenjian.chatroom.entity.UserInfo;
import com.shenjian.chatroom.mapper.UserInfoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;


/**
 * @ClassName:RegisteDaoImpl
 * @description: 注册用户实现类
 * @author: shen_jian
 * @date: 2019-02-26 16:47
 **/
@Repository
public class SignInDaoImpl implements ISignInDao {
	private static Logger logger = LoggerFactory.getLogger(SignInDaoImpl.class);
	@Autowired
	UserInfoMapper userInfoMapper;
	@Autowired
	ResultData result;
	@Override
	public ResultData signIn(UserInfo userInfo) {
		result = new ResultData("false","","");
		UserInfo existUserInfo = userInfoMapper.selectByLoginName(userInfo.getLoginName());
		if (StringUtils.isEmpty(existUserInfo) ){
			logger.info("existUserInfo 为空");
			result.setReason("existUserInfo 为空");
			return result;
		}
		if (existUserInfo.getUserPassword().equals(userInfo.getUserPassword())){
			logger.info("登录成功");
			result.setLoginName(existUserInfo.getLoginName());
			result.setUserId(existUserInfo.getUserId());
			result.setResult("success");
		} else {
			result.setReason("密码错误");
			logger.info("密码错误");
		}
		return result;
	}
}
