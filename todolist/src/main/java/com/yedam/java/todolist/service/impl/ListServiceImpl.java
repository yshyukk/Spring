package com.yedam.java.todolist.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.yedam.java.todolist.mapper.ListMapper;
import com.yedam.java.todolist.service.ListService;
import com.yedam.java.todolist.service.ListVO;

@Service
@Repository
public class ListServiceImpl implements ListService {

	@Autowired
	ListMapper mapper;
	
	
	@Override
	public List<ListVO> getAllList() {
		return mapper.allList();
		
	}
	
	@Override
	public int insert(ListVO vo) {
		
		return mapper.insertList();
	}


	@Override
	public int update(ListVO vo) {
		return mapper.updateList();
	}


	@Override
	public int delete(int no) {
		return mapper.deleteList(no);
	}
	
}
