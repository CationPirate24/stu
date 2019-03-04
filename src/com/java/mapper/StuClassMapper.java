package com.java.mapper;

import java.util.List;

import com.java.bean.Page;
import com.java.bean.StuClass;

public interface StuClassMapper extends Dao<StuClass,String>{

	//按年级查询
	public List<StuClass> getByClassGrade(String classGrade);
	//查询所有班级数量
	public int getAllCount();
	//分页查询
	public List<StuClass> getPage(Page page);
}
