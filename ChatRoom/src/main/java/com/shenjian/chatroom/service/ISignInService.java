package com.shenjian.chatroom.service;

import com.shenjian.chatroom.common.ResultData;
import com.shenjian.chatroom.entity.UserInfo;

public interface ISignInService {
	ResultData signIn(UserInfo userInfo);
}
