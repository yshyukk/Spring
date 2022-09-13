package com.yedam.java.todolist.mapper;

import java.util.List;

import com.yedam.java.todolist.service.ListVO;

public interface ListMapper {
	
	//전체조회
	public List<ListVO> allList();
	
	//등록
	public int insertList();
	
	//수정
	public int updateList();
	
	//삭제
	public int deleteList(int no);
}
