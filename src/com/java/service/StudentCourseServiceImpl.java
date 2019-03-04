package com.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.bean.Page;
import com.java.bean.StudentCourse;
import com.java.mapper.StudentCourseMapper;

public class StudentCourseServiceImpl implements StudentCourseService{

	@Autowired
	private StudentCourseMapper studentCourseMapper;
	
	public List<StudentCourse> getByStudentId(String studentId) {
		
		return studentCourseMapper.getByStudentId(studentId);
	}

	public List<StudentCourse> getStudentsGrades(String semester,
			String schoolYear) {
		
		return studentCourseMapper.getStudentsGrades(semester, schoolYear);
	}

	public boolean add(StudentCourse t) {
		
		return studentCourseMapper.add(t);
	}

	public void delete(String id) {
		
		studentCourseMapper.delete(id);
	}

	public List<StudentCourse> getAll(String con) {
		
		return studentCourseMapper.getAll(con);
	}

	public StudentCourse getById(String id) {
		
		return studentCourseMapper.getById(id);
	}

	public void update(StudentCourse t) {
		
		studentCourseMapper.update(t);
	}

	public int getAllCount() {
		
		return studentCourseMapper.getAllCount();
	}

	public List<StudentCourse> getPage(Page page) {
		
		return studentCourseMapper.getPage(page);
	}

}
