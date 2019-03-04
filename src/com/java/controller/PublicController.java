package com.java.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.bean.SysUser;
import com.java.service.SysUserService;

@Controller
public class PublicController {
	
	@Autowired
	private SysUserService sysUserService;
	
	//登录界面
	@RequestMapping("/public/toLogin.do")
	public ModelAndView toLogin(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("public/login");
		return mav;
	}
	
	//登录操作
	@RequestMapping("/public/login.do")
	public String login(HttpServletRequest request){
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		SysUser sysUser = sysUserService.checkLogin(userName, password);
		if(sysUser!=null){
			request.getSession().setAttribute("sysUser", sysUser);
		}
		
		return "forward:/public/toMain.do";
	}

	//管理界面
	@RequestMapping("/public/toMain.do")
	public ModelAndView toMain(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("public/main");
		return mav;
	}
}
























