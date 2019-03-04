package com.java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.java.bean.Cood;

public interface CoodMapper extends Dao<Cood,String>{

	//��ѯͬһ���͵ļ�¼
	public List<Cood> getCoodByType(String coodType);
	//���ü������Ͳ��¼
	public Cood getValueByKeyAndType(@Param("coodKey") String coodKey,@Param("coodType") String coodType);
}
