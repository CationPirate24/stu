package com.java.service;

import java.util.List;

import com.java.bean.Page;
import com.java.bean.StudentCourse;

public interface StudentCourseService extends Service<StudentCourse,String>{

	//按哪一学年，哪一学期查询
	public List<StudentCourse> getStudentsGrades(String semester,String schoolYear);
	
	//按学号查询
	public List<StudentCourse> getByStudentId(String studentId);
	//查询所有成绩记录
	public int getAllCount();
	//分页查询
	public List<StudentCourse> getPage(Page page);
}
