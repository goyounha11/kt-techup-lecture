package com.kt.practice.oop;

public class CheolHo extends Person {
	private String job;
	private String married;

	public CheolHo(int age, String name, String identity) {
		super(age, name, identity);
	}

	// 기본생성자 (생략)
	// 생성자

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void changeAge(int age) {
		this.age = age;
	}

	@Override
	public void eat() {

	}

	@Override
	public void sleep() {

	}

	@Override
	public void walk() {

	}

	// 자바의 관례
}
