package com.java.util;

import java.util.List;

import com.java.bean.Cood;
import com.java.service.CoodService;
import com.java.service.CoodServiceImpl;

/**
 * ת�빤��
 * @author ���˲�
 *
 */
public class CoodUtil {

	private static CoodService coodService = new CoodServiceImpl();
	/*
	 * ͨ���������Ͳ��Ҷ�Ӧ��ֵ
	 */
	public static String getValueByKeyAndType(String coodKey,String coodType){
		
		String coodValue = "";
		Cood cood = coodService.getValueByKeyAndType(coodKey, coodType);
		coodValue = cood.getCoodValue();
		
		return coodValue;
	}
	/*
	 * ͨ�����Ͳ��Ҷ�Ӧ��ֵ�ļ���
	 */
	public static List<Cood> getCoodByType(String coodType){
		
		List<Cood> list = coodService.getCoodByType(coodType);
		
		return list;
	}
}




























