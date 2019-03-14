package com.shenjian.chatroom.service;

import com.shenjian.chatroom.common.BaseData;
import com.shenjian.chatroom.dao.IRegisteDao;
import com.shenjian.chatroom.entity.UserInfo;
import com.shenjian.chatroom.util.UniqueNoUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName:RegisteService
 * @description: TODO
 * @author: shen_jian
 * @date: 2019-02-26 15:39
 **/
@Service
public class RegisteServiceImpl implements IRegisteService {
	private static Logger logger = LoggerFactory.getLogger(RegisteServiceImpl.class);
	@Autowired
	IRegisteDao registeDaoImpl;

	@Autowired
	BaseData baseData;
	@Override
	public String registeUser(UserInfo userInfo){
		logger.info("this is RegisteServiceImpl !");
		String result = "false";
		// todo 先进行用户信息校验
		// 配置用户编号

		userInfo.setUserId(baseData.userIdPrefix + UniqueNoUtil.getUniqueNo(baseData.datacenterId,baseData.machineId));
		logger.info("userInfo--> " + userInfo.getUserId());
		// 登记用户信息
		registeDaoImpl.registeUser(userInfo);
		logger.info("用户入库成功");
		return result;
	}
}
