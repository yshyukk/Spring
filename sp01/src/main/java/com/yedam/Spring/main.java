package com.yedam.Spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class main {
	
	public static void main(String[] args) {
		
		//container에 저장해놓은 bean을 호출해서 사용.
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:aplicationContext.xml");
		Tv tv = ctx.getBean(SamsungTv.class);
		tv.on();
	}
}
