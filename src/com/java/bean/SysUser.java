package com.java.bean;
/**
 * �û���
 * @author ���˲�
 *
 */
public class SysUser {

	private String userId;		//�û��˺�
	private String userName;	//�û���
	private String password;	//����
	private String userRole;	//�û���ɫ
	
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
