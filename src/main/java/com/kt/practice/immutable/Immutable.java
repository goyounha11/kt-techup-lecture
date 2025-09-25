package com.kt.practice.immutable;

public class Immutable {
	// immutable: 불변의, 변경할 수 없는
	// mutable: 변경할 수 있는

	// 변경이라는 것은 변화하는 것

	public static void main(String[] args) {
		int a = 1;
		// 5000줄의 코드
		a = 2;
		// 5000줄의 코드
		System.out.println(a);
	}
}
