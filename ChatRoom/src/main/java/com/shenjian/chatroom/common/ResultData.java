package com.shenjian.chatroom.common;

import org.springframework.stereotype.Component;

/**
 * @ClassName:ResultData
 * @description: 返回结果实体类
 * @author: shen_jian
 * @date: 2019-03-12 15:10
 **/
@Component
public class ResultData {
	private String result;
	private String discription;
	private String reason;
	private String userId;
	private String loginName;

	public ResultData() {
	}

	public ResultData(String result, String discription, String reason) {
		this.result = result;
		this.discription = discription;
		this.reason = reason;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("ResultData{");
		sb.append("result='").append(result).append('\'');
		sb.append(", discription='").append(discription).append('\'');
		sb.append(", reason='").append(reason).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
