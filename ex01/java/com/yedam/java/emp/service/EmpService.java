package com.yedam.java.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface EmpService {
	//전체조회
		public List<EmpVO> getEmpList();
	//단건조회
		public EmpVO getEmp(EmpVO empVO);
	//등록
		public void insertEmp(EmpVO empVO);
	//수정
		public void updateEmp(EmpVO empVO);
	//삭제
		public void deleteEmp(EmpVO empVO);
}
