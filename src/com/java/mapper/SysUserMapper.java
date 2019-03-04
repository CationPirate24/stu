package com.java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.java.bean.Page;
import com.java.bean.SysUser;

public interface SysUserMapper extends Dao<SysUser,String>{

	//��¼
	public SysUser checkLogin(@Param("userName") String userName,@Param("password") String password);
	//��ѯ�����û�����
	public int getAllCount();
	//��ҳ��ѯ
	public List<SysUser> getPage(Page page);
}

