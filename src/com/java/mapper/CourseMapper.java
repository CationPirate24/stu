package com.java.mapper;

import java.util.List;

import com.java.bean.Course;
import com.java.bean.Page;
/**
 * �γ̱�Ĺ���
 * @author ���˲�
 *
 */
public interface CourseMapper extends Dao<Course,String>{

	//��ѧ�ֲ�ѯ�γ�
	public List<Course> getByGredit(String gredit);
	//��ѯ���гɼ��ļ�¼
	public int getAllCount();
	//��ҳ��ѯ
	public List<Course> getPage(Page page);
}





















