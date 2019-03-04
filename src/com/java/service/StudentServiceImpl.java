package com.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.bean.Page;
import com.java.bean.Student;
import com.java.mapper.StudentMapper;

public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentMapper studentMapper;
	
	public boolean add(Student t) {
		
		return studentMapper.add(t);
	}

	public void delete(String id) {
		
		studentMapper.delete(id);
	}

	public List<Student> getAll(String con) {
		
		return studentMapper.getAll(con);
	}

	public Student getById(String id) {
		
		return studentMapper.getById(id);
	}

	public void update(Student t) {
		studentMapper.update(t);
	}

	public List<Student> getByClassId(String classId) {
		
		return studentMapper.getByClassId(classId);
	}

	public List<Student> getByMajor(String major) {
		
		return studentMapper.getByMajor(major);
	}

	public List<Student> getBySex(String sex) {
		
		return studentMapper.getBySex(sex);
	}

	public int getAllCount() {
		
		return studentMapper.getAllCount();
	}

	public List<Student> getPage(Page page) {
		
		return studentMapper.getPage(page);
	}

}
