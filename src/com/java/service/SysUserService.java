package com.java.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.java.bean.Page;
import com.java.bean.SysUser;

public interface SysUserService extends Service<SysUser,String>{

	//��¼
	public SysUser checkLogin(@Param("userName") String userName,@Param("password") String password);
	//��ѯ�����û�����
	public int getAllCount();
	//��ҳ��ѯ
	public List<SysUser> getPage(Page page);
}
