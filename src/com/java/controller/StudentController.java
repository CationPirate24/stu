package com.java.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.bean.Student;
import com.java.service.StudentService;
import com.java.util.VoUtil;
import com.java.vo.StudentVo;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	//学生列表
	@RequestMapping("/student/toList.do")
	public ModelAndView toList(HttpServletRequest request){
		ModelAndView mav = new ModelAndView();
		
		String con = request.getParameter("con");
		if(con==null||con==""){
			con = "";
		}
		
		List<Student> sList = studentService.getAll(con);
		List<StudentVo> svList = VoUtil.getStuList(sList);
		int totalRecode = svList.size();
		
		request.setAttribute("totalRecode", totalRecode);
		request.setAttribute("svList",svList);
		
		mav.setViewName("student/list");
		return mav;
	}
}


























