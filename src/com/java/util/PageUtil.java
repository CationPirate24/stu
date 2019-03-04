package com.java.util;

import com.java.bean.Page;

/**
 * ��ҳ����
 * @author ���˲�
 *
 */
public class PageUtil {

	private static ThreadLocal<Page> local = new ThreadLocal<Page>();
	
	public static Page getLocal(){
		return local.get();
	}
	
	public static void setLocal(Page page){
		local.set(page);
	}
	
	public static void cancelLocal(){
		local.remove();
	}
}


















