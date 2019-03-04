package com.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.bean.Course;
import com.java.bean.Page;
import com.java.mapper.CourseMapper;

public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseMapper courseMapper;
	
	public List<Course> getByGredit(String gredit) {
		
		return courseMapper.getByGredit(gredit);
	}

	public boolean add(Course t) {
		
		return courseMapper.add(t);
	}

	public void delete(String id) {
		
		courseMapper.delete(id);
	}

	public List<Course> getAll(String con) {
		
		return courseMapper.getAll(con);
	}

	public Course getById(String id) {
		
		return courseMapper.getById(id);
	}

	public void update(Course t) {
		
		courseMapper.update(t);
	}

	public int getAllCount() {
		
		return courseMapper.getAllCount();
	}

	public List<Course> getPage(Page page) {
		
		return courseMapper.getPage(page);
	}

}
