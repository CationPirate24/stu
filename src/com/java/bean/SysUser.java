package com.java.bean;
/**
 * 用户表
 * @author 沈兴财
 *
 */
public class SysUser {

	private String userId;		//用户账号
	private String userName;	//用户名
	private String password;	//密码
	private String userRole;	//用户角色
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
}
