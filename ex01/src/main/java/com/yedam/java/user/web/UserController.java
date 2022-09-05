package com.yedam.java.user.web;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yedam.java.service.UserListVO;
import com.yedam.java.service.UserVO;
	//commend방식으로 요청받기
	//가장 기본 경로 지정 방법 : RequestMapping()
@Controller
public class UserController {
	
	//일반적으로 view 요청 받아오는 방법
	@RequestMapping("/inputForm")
		public String inputForm() {
		return "inputForm";
	}
	
	@RequestMapping("/users") //
	/*
	  public String process(UserVO userVO) {
		
		System.out.println(userVO.getName());
		System.out.println(userVO.getAge());
		return "";
	  }
	*/
	/* 
	 	받는 값이 몇개 안될때는 @RequestParam
	 	public String process(@RequestParam String name, int age) {
			
			System.out.println(name + ", " + age);
			return "";
		}
	*/
	
	/*
	 * Map으로 값 받아오기
	 */
 	public String process(@RequestParam Map<String, Object> map) {
		System.out.println(map.get("name")+","+map.get("age"));
		return "";
	}
	
	// 동일한 값을 여러번 받을 때
	@RequestMapping("/nameList")
	public String nameProcess(@RequestParam List<String> name) {
		for(String temp : name) {
			System.out.println(temp);
		}
		return "";
	}
	
	
	//list를 불러올때는 list[0].name처럼 작성
	@RequestMapping("/userList")
	public String listProcess(UserListVO userListVO) {
		List<UserVO> userList = userListVO.getList();
		for(UserVO vo : userList) {
			System.out.println(vo.getName() + "," + vo.getAge());
		}		
		return "";
	}
}
