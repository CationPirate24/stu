package com.java.service;

import java.util.List;

import com.java.bean.Page;
import com.java.bean.Student;

public interface StudentService extends Service<Student,String>{

	//���Ա��ѯ
	public List<Student> getBySex(String sex);
	//�鿴ĳ�����ѧ��
	public List<Student> getByClassId(String classId);
	//�鿴ĳ��רҵ��ѧ��
	public List<Student> getByMajor(String major);
	//��ѯ����ѧ��������
	public int getAllCount();
	//��ҳ��ѯ
	public List<Student> getPage(Page page);
}
