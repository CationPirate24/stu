package com.java.bean;
/**
 * 班级表
 * @author 沈兴财
 *
 */
public class StuClass {

	private String classId;		//班级号
	private String classGrade;	//年级
	private String className;	//班级名称
	private String classNumber;	//班级人数
	
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getClassGrade() {
		return classGrade;
	}
	public void setClassGrade(String classGrade) {
		this.classGrade = classGrade;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}
	
}
