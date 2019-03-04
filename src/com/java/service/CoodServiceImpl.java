package com.java.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.bean.Cood;
import com.java.mapper.CoodMapper;

public class CoodServiceImpl implements CoodService{

	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");		 
	CoodMapper coodMapper = (CoodMapper) applicationContext.getBean("coodMapper");
	
	public List<Cood> getCoodByType(String coodType) {
		
		return coodMapper.getCoodByType(coodType);
	}

	public Cood getValueByKeyAndType(String coodKey, String coodType) {
		
		return coodMapper.getValueByKeyAndType(coodKey, coodType);
	}

	public boolean add(Cood t) {
		// TODO Auto-generated method stub
		return false;
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	public List<Cood> getAll(String con) {
		// TODO Auto-generated method stub
		return null;
	}

	public Cood getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Cood t) {
		// TODO Auto-generated method stub
		
	}

}
