package com.kt.practice.oop;

// has-a 관계
// 차는 ~ 이다.
// 벤츠는 차이다
public abstract class Car {
	private Engine engine = new Engine();
	private Break aBreak = new Break();

	public void pushBreak() {
		aBreak.push();
	}

	public void pushStartButton() {
		System.out.println("시동버튼을 눌렀습니다.");
		engine.start();
		//.... 부품들 작용
	}

	// d r n p
	public void drive() {
		System.out.println("앞으로 갑니다.");
	}

	public void reverse() {
		System.out.println("뒤로 갑니다.");
	}

	public void neutral() {
		System.out.println("중립입니다.");
	}

	public void park() {
		System.out.println("주차합니다.");
	}
}
