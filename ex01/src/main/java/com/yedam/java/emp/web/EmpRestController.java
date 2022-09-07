package com.yedam.java.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

//서버가 클라이언트에게 요청
@RestController
@CrossOrigin(origins ="http://192.168.0.83:8090")
public class EmpRestController {
	@Autowired
	EmpService service;
	
	//@RequestMapping("/empSelect")
	@GetMapping("/emp")
	public List<EmpVO> empSelect(){
		return service.getEmpList();
	}
	
	@GetMapping("/emp/{employeeId}")
	public EmpVO empFind(@PathVariable String employeeId) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(employeeId);
		return service.getEmp(empVO);
		
	}
	//사원등록
	@PostMapping("/emp")
	public EmpVO empInsert(@RequestBody EmpVO empVO) {
		service.insertEmp(empVO);
		return empVO;
	}
	//사원수정
	@PutMapping("/emp/{employeeId}")
	public EmpVO empUpdate(@PathVariable String employeeId, @RequestBody EmpVO empVO) {
		empVO.setEmployeeId(employeeId);
		service.updateEmp(empVO);
		return empVO;
	}
	//사원삭제
	@DeleteMapping("/emp/{employeeId}")
	public EmpVO empDelete(@PathVariable String employeeId) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(employeeId);
		service.deleteEmp(empVO);
		return empVO;
		
	}
}
