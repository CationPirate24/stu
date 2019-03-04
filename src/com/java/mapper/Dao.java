package com.java.mapper;

import java.util.List;

public interface Dao<T,ID> {

	public boolean add(T t);			//��
	public void delete(ID id);			//ɾ
	public void update(T t);			//��
	
	public T getById(ID id);			//ͨ��id���Ҷ���
	public List<T> getAll(String con);	//����������ѯ���У������з�ҳ
}
