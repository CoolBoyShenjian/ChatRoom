package com.shenjian.chatroom.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class UserInfo {
    @Id
    @Column(name = "sequence_no")
    private Integer sequenceNo;
    @Basic
    @Column(name = "user_id")
    private String userId;
    @Basic
    @Column(name = "login_name")
    private String loginName;
    @Basic
    @Column(name = "user_name")
    private String userName;
    @Basic
    @Column(name = "user_password")
    private String userPassword;
    @Basic
    @Column(name = "user_phone_no")
    private String userPhoneNo;
    @Basic
    @Column(name = "user_sex")
    private String userSex;
    @Basic
    @Column(name = "user_fix_line_phone_no")
    private String userFixLinePhoneNo;
    @Basic
    @Column(name = "user_qq_no")
    private String userQqNo;
    @Basic
    @Column(name = "user_wx_no")
    private String userWxNo;
    @Basic
    @Column(name = "user_address")
    private String userAddress;
    @Basic
    @Column(name = "user_identity_card")
    private String userIdentityCard;
    @Basic
    @Column(name = "user_birthday")
    private String userBirthday;
    @Basic
    @Column(name = "user_level")
    private String userLevel;
    @Basic
    @Column(name = "user_irregularities")
    private String userIrregularities;
    @Basic
    @Column(name = "creaete_date")
    private Date creaeteDate;
    @Basic
    @Column(name = "update_date")
    private Date updateDate;
    @Basic
    @Column(name = "reserve_coloum1")
    private String reserveColoum1;
    @Basic
    @Column(name = "reserve_coloum2")
    private String reserveColoum2;
    @Basic
    @Column(name = "reserve_coloum3")
    private String reserveColoum3;

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserPhoneNo() {
        return userPhoneNo;
    }

    public void setUserPhoneNo(String userPhoneNo) {
        this.userPhoneNo = userPhoneNo == null ? null : userPhoneNo.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserFixLinePhoneNo() {
        return userFixLinePhoneNo;
    }

    public void setUserFixLinePhoneNo(String userFixLinePhoneNo) {
        this.userFixLinePhoneNo = userFixLinePhoneNo == null ? null : userFixLinePhoneNo.trim();
    }

    public String getUserQqNo() {
        return userQqNo;
    }

    public void setUserQqNo(String userQqNo) {
        this.userQqNo = userQqNo == null ? null : userQqNo.trim();
    }

    public String getUserWxNo() {
        return userWxNo;
    }

    public void setUserWxNo(String userWxNo) {
        this.userWxNo = userWxNo == null ? null : userWxNo.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserIdentityCard() {
        return userIdentityCard;
    }

    public void setUserIdentityCard(String userIdentityCard) {
        this.userIdentityCard = userIdentityCard == null ? null : userIdentityCard.trim();
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday == null ? null : userBirthday.trim();
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel == null ? null : userLevel.trim();
    }

    public String getUserIrregularities() {
        return userIrregularities;
    }

    public void setUserIrregularities(String userIrregularities) {
        this.userIrregularities = userIrregularities == null ? null : userIrregularities.trim();
    }

    public Date getCreaeteDate() {
        return creaeteDate;
    }

    public void setCreaeteDate(Date creaeteDate) {
        this.creaeteDate = creaeteDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getReserveColoum1() {
        return reserveColoum1;
    }

    public void setReserveColoum1(String reserveColoum1) {
        this.reserveColoum1 = reserveColoum1 == null ? null : reserveColoum1.trim();
    }

    public String getReserveColoum2() {
        return reserveColoum2;
    }

    public void setReserveColoum2(String reserveColoum2) {
        this.reserveColoum2 = reserveColoum2 == null ? null : reserveColoum2.trim();
    }

    public String getReserveColoum3() {
        return reserveColoum3;
    }

    public void setReserveColoum3(String reserveColoum3) {
        this.reserveColoum3 = reserveColoum3 == null ? null : reserveColoum3.trim();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UserInfo{");
        sb.append("sequenceNo=").append(sequenceNo);
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", loginName='").append(loginName).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", userPassword='").append(userPassword).append('\'');
        sb.append(", userPhoneNo='").append(userPhoneNo).append('\'');
        sb.append(", userSex='").append(userSex).append('\'');
        sb.append(", userFixLinePhoneNo='").append(userFixLinePhoneNo).append('\'');
        sb.append(", userQqNo='").append(userQqNo).append('\'');
        sb.append(", userWxNo='").append(userWxNo).append('\'');
        sb.append(", userAddress='").append(userAddress).append('\'');
        sb.append(", userIdentityCard='").append(userIdentityCard).append('\'');
        sb.append(", userBirthday='").append(userBirthday).append('\'');
        sb.append(", userLevel='").append(userLevel).append('\'');
        sb.append(", userIrregularities='").append(userIrregularities).append('\'');
        sb.append(", creaeteDate=").append(creaeteDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", reserveColoum1='").append(reserveColoum1).append('\'');
        sb.append(", reserveColoum2='").append(reserveColoum2).append('\'');
        sb.append(", reserveColoum3='").append(reserveColoum3).append('\'');
        sb.append('}');
        return sb.toString();
    }
}