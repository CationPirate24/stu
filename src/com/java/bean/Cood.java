package com.java.bean;
/**
 * 码表
 * @author 沈兴财
 *
 */
public class Cood {

	private String coodId;		//码表号
	private String coodKey;		//键
	private String coodValue;	//值
	private String coodType;	//需要转码的类型
	
	public String getCoodId() {
		return coodId;
	}
	public void setCoodId(String coodId) {
		this.coodId = coodId;
	}
	public String getCoodKey() {
		return coodKey;
	}
	public void setCoodKey(String coodKey) {
		this.coodKey = coodKey;
	}
	public String getCoodValue() {
		return coodValue;
	}
	public void setCoodValue(String coodValue) {
		this.coodValue = coodValue;
	}
	public String getCoodType() {
		return coodType;
	}
	public void setCoodType(String coodType) {
		this.coodType = coodType;
	}
	
}
