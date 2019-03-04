package com.java.service;

import java.util.List;

import com.java.bean.Course;
import com.java.bean.Page;

public interface CourseService extends Service<Course,String>{

	//��ѧ�ֲ�ѯ�γ�
	public List<Course> getByGredit(String gredit);
	//��ѯ���гɼ��ļ�¼
	public int getAllCount();
	//��ҳ��ѯ
	public List<Course> getPage(Page page);
}
