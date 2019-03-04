package com.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.bean.Page;
import com.java.bean.StuClass;
import com.java.mapper.StuClassMapper;

public class StuClassServiceImpl implements StuClassService{

	@Autowired
	private StuClassMapper stuClassMapper;
	
	public List<StuClass> getByClassGrade(String classGrade) {
		
		return stuClassMapper.getByClassGrade(classGrade);
	}

	public boolean add(StuClass t) {
		
		return stuClassMapper.add(t);
	}

	public void delete(String id) {
		
		stuClassMapper.delete(id);
	}

	public List<StuClass> getAll(String con) {
		
		return stuClassMapper.getAll(con);
	}

	public StuClass getById(String id) {
		
		return stuClassMapper.getById(id);
	}

	public void update(StuClass t) {
		
		stuClassMapper.update(t);
	}

	public int getAllCount() {
		
		return stuClassMapper.getAllCount();
	}

	public List<StuClass> getPage(Page page) {
		
		return stuClassMapper.getPage(page);
	}

}
