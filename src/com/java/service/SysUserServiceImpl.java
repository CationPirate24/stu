package com.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.bean.Page;
import com.java.bean.SysUser;
import com.java.mapper.SysUserMapper;

public class SysUserServiceImpl implements SysUserService{

	@Autowired
	private SysUserMapper sysUserMapper;
	
	public SysUser checkLogin(String userName, String password) {
		
		return sysUserMapper.checkLogin(userName, password);
	}

	public boolean add(SysUser t) {
		
		return sysUserMapper.add(t);
	}

	public void delete(String id) {
		
		sysUserMapper.delete(id);
	}

	public List<SysUser> getAll(String con) {
		
		return sysUserMapper.getAll(con);
	}

	public SysUser getById(String id) {
		
		return sysUserMapper.getById(id);
	}

	public void update(SysUser t) {
		
		sysUserMapper.update(t);
	}

	public int getAllCount() {
		
		return sysUserMapper.getAllCount();
	}

	public List<SysUser> getPage(Page page) {
		
		return sysUserMapper.getPage(page);
	}

}
