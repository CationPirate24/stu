package com.java.bean;
/**
 * ��ҳ��
 * @author ���˲�
 *
 */
public class Page {

	private int recordCount;		//�ܼ�¼����
	private int pageCount;			//��ҳ��
	private int paginalCount;		//ÿҳ�ļ�¼����
	private int currentPage;		//��ǰҳ
	private String con;				//��ѯ����
	
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































