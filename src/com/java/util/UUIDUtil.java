package com.java.util;

import java.util.UUID;
/**
 * ��������
 * @author ���˲�
 *
 */
public class UUIDUtil {

	public static String getId(){
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replaceAll("-", "");
	}
}
