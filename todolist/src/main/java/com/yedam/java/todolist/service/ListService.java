package com.yedam.java.todolist.service;

import java.util.List;

public interface ListService {
	public List<ListVO> getAllList();
	
	public int insert(ListVO vo);
	
	public int update(ListVO vo);
	
	public int delete(int no);
}
