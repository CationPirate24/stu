package com.java.service;

import java.util.List;

import com.java.bean.Page;
import com.java.bean.Student;

public interface StudentService extends Service<Student,String>{

	//按性别查询
	public List<Student> getBySex(String sex);
	//查看某个班的学生
	public List<Student> getByClassId(String classId);
	//查看某个专业的学生
	public List<Student> getByMajor(String major);
	//查询所有学生的数量
	public int getAllCount();
	//分页查询
	public List<Student> getPage(Page page);
}
