package com.yedam.java.emp.service;

import lombok.Data;

@Data
public class EmpVO {
	String employeeId;
	String firstName;
	String lastName;
	String jobId;
	String email;
	String salary;
	String hireDate;
	String phoneNumber;
	String commissionPct;
	String managerId;
	String departmentId;
}
