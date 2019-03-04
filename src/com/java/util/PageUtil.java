package com.java.util;

import com.java.bean.Page;

/**
 * 分页工具
 * @author 沈兴财
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


















