package com.kt.practice.oop;

public class OOPMain {
	public static void main(String[] args) {
		// OOP: Object Oriented Programming => 객체지향 프로그래밍
		// OOP 이전에 Sequential Programming => 절차지향 프로그래밍

		// 절차지향프로그래밍 -> 시간 순서대로 함수를 중심으로
		// 코딩의 디폴트
		int a = 10;
		int b = 20;

		int result = a + b;

		System.out.println(result);
		// .... 하나의 main 함수에 모든 코드가 들어감
		// 3~4만줄 정도의 코드가 존재

		// 객체지향프로그래밍이란?
		// 현실세계를 모방하는 기법
		// 현실세계를 모방해서 새로운 세계를 창조하는 것

		// 객체지향프로그래밍에서 중요한 포인트
		// 1. 캡상추다 (캡슐화, 상속, 추상화, 다형성)
		// 2. 상태와 행위 (객체하나는 생명체이다)
		// 3. 협력하는 것
		// 4. 메세지

		// 캡슐화
		// 정보은닉 , 최소한의 정보만 알게한다(외부에 노출한다.)
		// 객체의 프라이버시를 중요시한다.
		// 접근제어자(Access Modifier)를 통해서 제어하는 방식을 사용한다.
		// public => 누구나 접근 가능
		// private => 클래스 내부에서만 접근 가능
		// protected => 같은 패키지 내에서는 모두 접근 가능 + 상속관계에 있는 자식 클래스는 다른 패키지에서도 접근 가능
		// default => 같은 패키지 내에서만 접근 가능 (아무것도 안쓰면 디폴트)
		var p1 = new CheolHo(40, "철호", "123456-1234567");
		p1.getName();
		p1.getAge();
		p1.walk();

		// 목적성이 불분명함
		// 이건 안씀
		p1.setAge(20);
		// 이건 씀
		p1.changeAge(30);

		// 추상화 -> abstract class, interface
		// 객체들의 공통적인 특징(행동, 속성)을 추출해서 정의하는 것
		// ex) 동물 -> 포유류 -> 개, 사람
		// ex) 탈것 -> 육상탈것 -> 자동차
		// ex) 가전제품 -> 영상가전 -> TV
		// ex) 가전제품 -> 생활가전 -> 세탁기

	}
}
