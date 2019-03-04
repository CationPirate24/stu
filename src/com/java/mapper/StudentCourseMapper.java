package com.java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.java.bean.Page;
import com.java.bean.StudentCourse;

public interface StudentCourseMapper extends Dao<StudentCourse,String>{

	//按哪一学年，哪一学期查询
	public List<StudentCourse> getStudentsGrades(@Param("semester") String semester,@Param("schoolYear") String schoolYear);
	
	//按学号查询
	public List<StudentCourse> getByStudentId(String studentId);
	//查询所有成绩记录
	public int getAllCount();
	//分页查询
	public List<StudentCourse> getPage(Page page);
}
