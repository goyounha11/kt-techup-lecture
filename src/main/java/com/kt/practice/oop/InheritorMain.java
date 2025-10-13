package com.kt.practice.oop;

public class InheritorMain {
	// 상속
	// 이미 정의된 상위클래스(부모클래스)의 모든 속성과 연산을 하위클래스가 물려 받는 것
	// 물려받는다 => 내꺼다
	// 자식클래스는 부모의 모든 속성을 내꺼처럼 사용할 수 있어야한다.
	// 내부에서 접근이 가능해야함

	// 상속에는 2가지 종류가 있음
	// 1. is-a 관계 : ~은 ~이다. => 추상화를 진행
	// 2. has-a 관계 : ~은 ~을 가지고 있다. => 추상화하면안됨
	// has-a composition(구성) => 포함관계
	// 상속자체의 장점 => 코드의 재사용성 증가

	public static void main(String[] args) {
		var car = new HighValueCar("벤츠", "S클래스", 1_000_000_000L, "자율주행");
		var benz = new HighValueCar("E클래스", 70_000_000L, "자율주행");
		var hyundai = new HyunDai("현대", "그랜저", 30_000_000L);

		benz.deal();
		hyundai.deal();

		// 다형성
		// 하나의 변수 또 함수가 상황에따라 다르게 동작하는 방식
		// overloading => 과하게 많이 불러오는 것
		// override => 다시 덮어쓰기
	}
}
