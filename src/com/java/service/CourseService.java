package com.java.service;

import java.util.List;

import com.java.bean.Course;
import com.java.bean.Page;

public interface CourseService extends Service<Course,String>{

	//按学分查询课程
	public List<Course> getByGredit(String gredit);
	//查询所有成绩的记录
	public int getAllCount();
	//分页查询
	public List<Course> getPage(Page page);
}
