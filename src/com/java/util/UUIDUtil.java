package com.java.util;

import java.util.UUID;
/**
 * 主键工具
 * @author 沈兴财
 *
 */
public class UUIDUtil {

	public static String getId(){
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replaceAll("-", "");
	}
}
