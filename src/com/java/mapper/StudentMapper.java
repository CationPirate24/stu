package com.java.mapper;

import java.util.List;

import com.java.bean.Page;
import com.java.bean.Student;
/**
 * ѧ����Ĺ���
 * @author ���˲�
 *
 */
public interface StudentMapper extends Dao<Student,String> {

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























