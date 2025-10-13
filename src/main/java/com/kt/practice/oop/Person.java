package com.kt.practice.oop;

// abstract => class, interface
// 추상 클래스 => 미완성 클래스 -> 확장해서 마저 구현 -> extends
// 속성을 공유하기 위해서 사용
// 인터페이스 -> 규격(행동)을 정의 -> implements -> 실행하다(구현)
// 일관성 코드 작성
// 객체 하나하나가 가벼워지기 때문에 유지보수에도 용이하다.
public abstract class Person implements PersonFunction {
	protected int age;
	protected String name;
	protected String identity;

	public Person(int age, String name, String identity) {
		this.age = age;
		this.name = name;
		this.identity = identity;
	}

	public String getName() {
		return name;
	}

	// new ... 사용하기위해서
}
