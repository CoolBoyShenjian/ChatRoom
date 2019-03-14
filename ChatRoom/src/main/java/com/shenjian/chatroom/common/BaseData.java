package com.shenjian.chatroom.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * @ClassName:BaseData
 * @description: TODO
 * @author: shen_jian
 * @date: 2019-03-05 17:14
 **/
@Component
public class BaseData {
	@Value("${base.data.userId-prefix}")
	public String userIdPrefix;
	@Value("${base.data.datacenterId}")
	public String datacenterId;
	@Value("${base.data.machineId}")
	public String machineId;
}
