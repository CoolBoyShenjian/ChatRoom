package com.shenjian.chatroom.dao;

import com.shenjian.chatroom.entity.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * @Author shen_jian
 * @Description //注册用户
 * @Date 16:45 2019/2/26 0026
 * @Param
 * @return
 **/
@Repository
public interface IRegisteDao {
    String registeUser(UserInfo userInfo);
}