package com.kt.practice.oop.solid;

public class ProdBFunction implements BFunction {
	@Override
	public int add(int a, int b) {
		System.out.println("ProdBFunction의 add 기능");
		return 1;
	}
}
