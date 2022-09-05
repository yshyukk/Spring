package com.yedam.test;

import org.junit.Test;

import com.yedam.java.SamsungTv;
import com.yedam.java.Tv;

public class javaClass {

	@Test
	public void javaTest() {
		Tv tv = new SamsungTv();
		tv.on();	

	}
	
	@Test
	public void method() {
		System.out.println("단순테스트");
	}
}
