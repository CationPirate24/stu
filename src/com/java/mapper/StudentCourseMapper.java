package com.java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.java.bean.Page;
import com.java.bean.StudentCourse;

public interface StudentCourseMapper extends Dao<StudentCourse,String>{

	//����һѧ�꣬��һѧ�ڲ�ѯ
	public List<StudentCourse> getStudentsGrades(@Param("semester") String semester,@Param("schoolYear") String schoolYear);
	
	//��ѧ�Ų�ѯ
	public List<StudentCourse> getByStudentId(String studentId);
	//��ѯ���гɼ���¼
	public int getAllCount();
	//��ҳ��ѯ
	public List<StudentCourse> getPage(Page page);
}
