package com.mvc.member.model.vo;

import java.sql.Date;

public class Member {
	
	private int userNo;
	private String userId;
	private String userPwd;
	private String userName;
	private String phone;
	private String email;
	private String address;
	private Date userEnrollDate;
	private Date userModifyDate;
	private String userStatus;
	private String userRole;
	private int userCoin;
	
	public Member() {
	}
	
	public Member(int userNo, String userId, String userPwd, String userName, String phone, String email,
			String address, Date userEnrollDate, Date userModifyDate, String userStatus, String userRole,
			int userCoin) {
		this.userNo = userNo;
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.userEnrollDate = userEnrollDate;
		this.userModifyDate = userModifyDate;
		this.userStatus = userStatus;
		this.userRole = userRole;
		this.userCoin = userCoin;
	}
	
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getUserEnrollDate() {
		return userEnrollDate;
	}
	public void setUserEnrollDate(Date userEnrollDate) {
		this.userEnrollDate = userEnrollDate;
	}
	public Date getUserModifyDate() {
		return userModifyDate;
	}
	public void setUserModifyDate(Date userModifyDate) {
		this.userModifyDate = userModifyDate;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public int getUserCoin() {
		return userCoin;
	}
	public void setUserCoin(int userCoin) {
		this.userCoin = userCoin;
	}

	@Override
	public String toString() {
		return "Member [userNo=" + userNo + ", userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName
				+ ", phone=" + phone + ", email=" + email + ", address=" + address + ", userEnrollDate="
				+ userEnrollDate + ", userModifyDate=" + userModifyDate + ", userStatus=" + userStatus + ", userRole="
				+ userRole + ", userCoin=" + userCoin + "]";
	}
	
	
}
