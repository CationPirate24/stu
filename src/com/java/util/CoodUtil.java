package com.java.util;

import java.util.List;

import com.java.bean.Cood;
import com.java.service.CoodService;
import com.java.service.CoodServiceImpl;

/**
 * 转码工具
 * @author 沈兴财
 *
 */
public class CoodUtil {

	private static CoodService coodService = new CoodServiceImpl();
	/*
	 * 通过键和类型查找对应的值
	 */
	public static String getValueByKeyAndType(String coodKey,String coodType){
		
		String coodValue = "";
		Cood cood = coodService.getValueByKeyAndType(coodKey, coodType);
		coodValue = cood.getCoodValue();
		
		return coodValue;
	}
	/*
	 * 通过类型查找对应的值的集合
	 */
	public static List<Cood> getCoodByType(String coodType){
		
		List<Cood> list = coodService.getCoodByType(coodType);
		
		return list;
	}
}




























