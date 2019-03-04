package com.java.util;

import java.util.ArrayList;
import java.util.List;

import com.java.bean.Student;
import com.java.vo.StudentVo;

/**
 * 视图工具
 * @author 沈兴财
 *
 */
public class VoUtil {

	public static List<StudentVo> getStuList(List<Student> sList){
		List<StudentVo> svList = new ArrayList<StudentVo>();
		
		for(Student stu:sList){
			StudentVo sv = new StudentVo();
			sv.setStudentId(stu.getStudentId());
			sv.setName(stu.getName());
			sv.setBirthDate(stu.getBirthDate());
			sv.setSex(stu.getSex());
			sv.setClassId(stu.getClassId());
			sv.setEntranceDate(stu.getEntranceDate());
			sv.setNation(stu.getNation());
			sv.setHomeAddress(stu.getHomeAddress());
			sv.setPolitics(stu.getPolitics());
			sv.setId(stu.getId());
			sv.setMajor(stu.getMajor());
			
			sv.setSexVo(CoodUtil.getValueByKeyAndType(stu.getSex(), "SEX"));
			
			svList.add(sv);
		}
		return svList;
	}
}















