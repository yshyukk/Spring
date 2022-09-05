package com.yedam.java.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpVO;

@Controller
public class EmpController {
	@Autowired
	EmpMapper empMapper;
	
	@GetMapping("/emp")
	public String emp(Model model, EmpVO empVO) {	
		
		EmpVO findVO = empMapper.getEmp(empVO);
	/*
	 * model.addAttribute("emp", findVO) 
	 * -> jsp로 보냄
	 * -> jsp에서 ${emp.~}로 데이터 받아오게
	 */
		model.addAttribute("emp", findVO);
		return "emp";
			
	}
}
