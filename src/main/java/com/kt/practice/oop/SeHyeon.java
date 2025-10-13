package com.kt.practice.oop;

// is-a 관계
public class SeHyeon extends Person {
	// 멤버변수 , 프로퍼티(속성)
	private String student;

	// 기본생성자 (생략)
	// 생성자

	public SeHyeon(int age, String name, String identity, String student) {
		super(age, name, identity);
		this.student = student;
	}

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
