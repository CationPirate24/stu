package com.java.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���ڹ���
 * @author ���˲�
 *
 */
public class DateUtil {

	public static String getDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String dateStr = sdf.format(date);
		return dateStr;
	}
}















