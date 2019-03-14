package com.shenjian.chatroom.dao;

import com.shenjian.chatroom.entity.UserInfo;
import com.shenjian.chatroom.mapper.UserInfoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * @ClassName:RegisteDaoImpl
 * @description: 注册用户实现类
 * @author: shen_jian
 * @date: 2019-02-26 16:47
 **/
@Repository
public class RegisteDaoImpl implements IRegisteDao {
	private static Logger logger = LoggerFactory.getLogger(RegisteDaoImpl.class);
	@Autowired
	UserInfoMapper userInfoMapper;
	@Override
	public String registeUser(UserInfo userInfo) {
		logger.info("this is RegisteDaoImpl !");
		int result = userInfoMapper.insert(userInfo);
		logger.info("result --> " + result);
		return "success";
	}
}
