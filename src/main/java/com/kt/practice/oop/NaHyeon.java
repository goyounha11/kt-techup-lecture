package com.kt.practice.oop;

public class NaHyeon extends Person {
	// 멤버변수 , 프로퍼티(속성)
	private String student;
	private String glass;

	public NaHyeon(int age, String name, String identity, String student, String glass) {
		super(age, name, identity);
		this.student = student;
		this.glass = glass;
	}

	// 기본생성자 (생략)
	// 생성자

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
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
