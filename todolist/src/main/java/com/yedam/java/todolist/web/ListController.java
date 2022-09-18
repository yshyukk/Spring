package com.yedam.java.todolist.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.java.todolist.service.ListService;
import com.yedam.java.todolist.service.ListVO;

@RestController
@RequestMapping
@ResponseBody
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ListController {
	@Autowired
	ListService service;

	@GetMapping("/list")
	public List<ListVO> getAllList(){
		return service.getAllList();
	}
	@PostMapping("/list")
	public ListVO insert(ListVO vo) {
		service.insert(vo);
		return vo;
	}
	@PutMapping("/list")
	public ListVO update(@RequestBody ListVO vo) {
		service.update(vo);
		return vo;
	}
	@DeleteMapping("/list/{no}")
	public int delete(@PathVariable int no) {
		service.delete(no);
		return no;
	}
}
