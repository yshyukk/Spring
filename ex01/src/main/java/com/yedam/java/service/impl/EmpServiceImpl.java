package com.yedam.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

@Service
public class EmpServiceImpl implements EmpService {
	//데이터 연산은 여기서	
		@Autowired
		EmpMapper empMapper;
	   //전체조회
		@Override
		public List<EmpVO> getEmpList(){
			
			return empMapper.getEmpList();
		}
		
		//단건조회
		@Override
		public EmpVO getEmp(EmpVO empVO) {
			return empMapper.getEmp(empVO);
		}
		
		//등록
		@Override
		public void insertEmp(EmpVO empVO) {
			
		}
		//수정
		public void updateEmp(EmpVO empVO) {
			empMapper.updateInfo(empVO);
		}
		//삭제
		public void deleteEmp(EmpVO empVO) {
			empMapper.deleteEmpInfo(Integer.parseInt(empVO.getEmployeeId()));
		}
	
}
