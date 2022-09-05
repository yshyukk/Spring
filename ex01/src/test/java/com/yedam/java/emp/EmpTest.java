package com.yedam.java.emp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/*-context.xml")

public class EmpTest {
	@Autowired
	EmpMapper empMapper;

	
	public void empListTest() {
		List<EmpVO> findList = empMapper.getEmpList();
		for(EmpVO vo : findList) {
			System.out.println(vo);
		}
	}
	@Test
	public void empInfoTest() {
		
		EmpVO info = new EmpVO();
		info.setEmployeeId("149");
		EmpVO findVO = empMapper.getEmp(info);
		
		assertNotNull(findVO.getEmail());
	}
	
	public void empInsertTest() {
		
		EmpVO info = new EmpVO();
		info.setFirstName("IWant");
		info.setLastName("goHome");
		info.setEmail("gohome@naver.com");
		info.setJobId("IT_PROG");
		info.setSalary("1");
		empMapper.insertEmp(info);
		assertEquals(info.getEmployeeId(), "208");
		
	}
	
	
	public void updateSalaryTest() {
		int result = empMapper.updateSalary(149);
		assertEquals(result, 1);
	}
	//하나의 값이라도 없으면 실행X
	public void updateInfo() {
		
		EmpVO info = new EmpVO();
		
		info.setFirstName("lol");
		info.setLastName("lol");
		info.setEmail("lol@naver.com");
		info.setEmployeeId("149");
		
		int result = empMapper.updateInfo(info);
		assertEquals(result, 1);
	}
	
	
	// 수정하고자 하는 값이 하나만 있어도 그게 무엇인지 알아서 판단하고 그 값만 업데이트함
	public void updateRandomInfo() {
		EmpVO info = new EmpVO();
		info.setEmployeeId("149");
		info.setFirstName("길길길동");
		info.setLastName("반");
		info.setEmail("dongdong@naver.com");
		
		int result = empMapper.updateInfo(info);
		assertEquals(result, 1);
		
	}
}
