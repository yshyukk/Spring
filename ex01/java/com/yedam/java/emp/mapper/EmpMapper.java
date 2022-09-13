package com.yedam.java.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.java.emp.service.EmpVO;

public interface EmpMapper {
	//전체조회
	public List<EmpVO> getEmpList();
	
	//단건조회 : 조회조건 - EmpVO
	public EmpVO getEmp(EmpVO empVO);
	
	//등록
	public int insertEmp(EmpVO empVO);
	
	//수정 : 연봉 10% 인상
	public int updateSalary(@Param("empId")int employeeId);
	
	//수정 : 사원정보를 넘겨받아서 이름과 성, 이메일을 수정할 수있는 메서드
	public int updateInfo(EmpVO empVO);
	
	//수정 : 	// 수정하고자 하는 값이 하나만 있어도 그게 무엇인지 알아서 판단하고 그 값만 업데이트함(Dynamic SQL 이용)
	public int updateRandomInfo(EmpVO empVO);
	
	//삭제
	public int deleteEmpInfo(int employeeId);
}
