package com.yedam.java.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;
//실제연산은 serviceImpl에서
@Controller
@RequestMapping("/emp")
//경우에 따라서 @RequestMapping("/emp")로 클래스에 경로를 추가해서도 가능
public class EmpController {
	
	@Autowired
	EmpService empService;
	
	@GetMapping("/allList") //=> java/emp/allList
	public String getEmpList(Model model) {
		//model.addAttribute("view에서 사용될 이름", 실제값) <== 값 받아오기
		model.addAttribute("empList", empService.getEmpList());
		return "emp/empList";		
	}
	
	@GetMapping("/getInfo")
	public String getEmpInfo(Model model, EmpVO empVO) {
		model.addAttribute("empInfo", empService.getEmp(empVO));
		return "emp/empInfo";
	}
	//다시보기
	@PostMapping("/updateInfo")
	public String updateEmpInfo(EmpVO empVO) {
		empService.updateEmp(empVO);		
		//view를 호출하지않고 컨트롤러를 생성하는 방법
		return "redirect:/emp/allList";
	}
	
	@GetMapping("/deleteInfo/{employeeId}")
	public String deleteEmpInfo(@PathVariable String employeeId) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(employeeId);
		empService.deleteEmp(empVO);
		return "redirect:/emp/allList";
	}
	@GetMapping("/insertForm")
	public String insertForm(EmpVO empVO) {
		return "emp/inputForm";
		
	}
	
}
