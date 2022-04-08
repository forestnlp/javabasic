package com.annotation.junit;

public class TestCase01 {
	@MyBefore
	public void init() {
		System.out.println("初始化...");
	}

	@MyAfter
	public void destroy() {
		System.out.println("销毁...");
	}

	@MyTest
	public void testSave() {
		System.out.println("save...");
	}

	@MyTest
	public void testDelete() {
		System.out.println("delete...");
	}
}