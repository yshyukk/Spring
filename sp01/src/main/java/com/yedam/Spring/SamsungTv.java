package com.yedam.Spring;

import org.springframework.stereotype.Component;

@Component("tv")
public class SamsungTv implements Tv{
	public void on() {
		System.out.println("Spring형식으로");
	}
}
