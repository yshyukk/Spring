package com.yedam.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.junit.Restaurant;

//Test하려는 대상이 container에 있는 bean이라서 필요함.
// SpringJUnit4ClassRunner라는 클래스를 지정해주면 ApplicationContext를 만들고 관리
@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations = "classpath:aplicationContext.xml")
//classpath : 경로를 미리 지정해놓는 것. 필요하면 변경
//		 	default : src/resources
public class TestClass {

	@Autowired
	ApplicationContext ctx;
	
	@Autowired
	Restaurant res;
	
	@Test
	public void beanTest() {
//		Restaurant res = ctx.getBean(Restaurant.class);
		res.open();
	}
}
