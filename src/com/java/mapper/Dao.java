package com.java.mapper;

import java.util.List;

public interface Dao<T,ID> {

	public boolean add(T t);			//增
	public void delete(ID id);			//删
	public void update(T t);			//改
	
	public T getById(ID id);			//通过id查找对象
	public List<T> getAll(String con);	//根据条件查询所有，并进行分页
}
