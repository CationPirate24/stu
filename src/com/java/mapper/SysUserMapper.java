package com.java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.java.bean.Page;
import com.java.bean.SysUser;

public interface SysUserMapper extends Dao<SysUser,String>{

	//登录
	public SysUser checkLogin(@Param("userName") String userName,@Param("password") String password);
	//查询所有用户数量
	public int getAllCount();
	//分页查询
	public List<SysUser> getPage(Page page);
}

