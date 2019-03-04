package com.java.service;

import java.util.List;

import com.java.bean.Page;
import com.java.bean.StuClass;

public interface StuClassService extends Service<StuClass,String>{

	//���꼶��ѯ
	public List<StuClass> getByClassGrade(String classGrade);
	//��ѯ���а༶����
	public int getAllCount();
	//��ҳ��ѯ
	public List<StuClass> getPage(Page page);
}
