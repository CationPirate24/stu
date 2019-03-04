package com.java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.java.bean.Cood;

public interface CoodMapper extends Dao<Cood,String>{

	//查询同一类型的记录
	public List<Cood> getCoodByType(String coodType);
	//利用键和类型查记录
	public Cood getValueByKeyAndType(@Param("coodKey") String coodKey,@Param("coodType") String coodType);
}
