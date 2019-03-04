package com.java.mapper;

import java.util.List;

import com.java.bean.Course;
import com.java.bean.Page;
/**
 * 课程表的管理
 * @author 沈兴财
 *
 */
public interface CourseMapper extends Dao<Course,String>{

	//按学分查询课程
	public List<Course> getByGredit(String gredit);
	//查询所有成绩的记录
	public int getAllCount();
	//分页查询
	public List<Course> getPage(Page page);
}





















