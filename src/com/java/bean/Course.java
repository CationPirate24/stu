package com.java.bean;
/**
 * 课程表
 * @author 沈兴财
 *
 */
public class Course {

	private String courseId;		//课程号
	private String courseName;		//课程名称
	private String gredit;			//学分
	
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getGredit() {
		return gredit;
	}
	public void setGredit(String gredit) {
		this.gredit = gredit;
	}
	
}
