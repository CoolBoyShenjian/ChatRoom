package com.shenjian.chatroom.entity;
/**
 * @ClassName:SendMessageInfo
 * @description: 发送的消息相关信息实体类
 * @author: shen_jian
 * @date: 2019-02-18 15:37
 **/
public class RequestMessageInfo {

	private String senderId;
	private String sendInfo;
	private String receiverId;

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("SendMessageInfo{");
		sb.append("senderId='").append(senderId).append('\'');
		sb.append(", sendInfo='").append(sendInfo).append('\'');
		sb.append(", receiverId='").append(receiverId).append('\'');
		sb.append('}');
		return sb.toString();
	}

	public String getSenderId() {
		return senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getSendInfo() {
		return sendInfo;
	}

	public void setSendInfo(String sendInfo) {
		this.sendInfo = sendInfo;
	}

	public String getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}
}
