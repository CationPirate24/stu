package com.java.bean;
/**
 * 分页类
 * @author 沈兴财
 *
 */
public class Page {

	private int recordCount;		//总记录条数
	private int pageCount;			//总页数
	private int paginalCount;		//每页的记录条数
	private int currentPage;		//当前页
	private String con;				//查询条件
	
	public int getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}
	public int getPageCount() {
		
		if(this.recordCount%this.paginalCount==0){
			this.pageCount = this.recordCount/this.paginalCount;
		}else{
			this.pageCount = this.recordCount/this.paginalCount+1;
		}
		
		return pageCount;
	}
	
	public int getPaginalCount() {
		return paginalCount;
	}
	public void setPaginalCount(int paginalCount) {
		this.paginalCount = paginalCount;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public String getCon() {
		return con;
	}
	public void setCon(String con) {
		this.con = con;
	}
	
}































