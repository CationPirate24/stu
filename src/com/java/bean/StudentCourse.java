package com.java.bean;
/**
 * �ɼ���
 * @author ���˲�
 *
 */
public class StudentCourse {

	private String courseId;		//�γ̺�
	private String studentId;		//ѧ��
	private String grade;			//����
	private String semester;		//ѧ��
	private String schoolYear;		//ѧ��
	
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(String schoolYear) {
		this.schoolYear = schoolYear;
	}
	
}
