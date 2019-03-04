package com.java.service;

import java.util.List;

import com.java.bean.Page;
import com.java.bean.StudentCourse;

public interface StudentCourseService extends Service<StudentCourse,String>{

	//����һѧ�꣬��һѧ�ڲ�ѯ
	public List<StudentCourse> getStudentsGrades(String semester,String schoolYear);
	
	//��ѧ�Ų�ѯ
	public List<StudentCourse> getByStudentId(String studentId);
	//��ѯ���гɼ���¼
	public int getAllCount();
	//��ҳ��ѯ
	public List<StudentCourse> getPage(Page page);
}
