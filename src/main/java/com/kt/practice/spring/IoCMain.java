package com.kt.practice.spring;

public class IoCMain {
	public static void main(String[] args) {
		//### IoC (Inversion of Control) 제어의 역전
		//
		// - 제어의 역전은 객체의 생성과 사용에 대한 제어권을 개발자가 아닌 외부에서 관리하는 것을 의미
		// - 즉, 객체의 생성, 구성, 생명주기 관리 등을 개발자가 직접 하지 않고, 프레임워크나 컨테이너가 대신 처리
		// - IoC를 통해 애플리케이션의 구성 요소들이 느슨하게 결합되고, 재사용성과 테스트 용이성이 향상
		//
		// > IoC는 객체지향 설계 원칙 중 하나로, 객체 간의 의존성을 줄이고 유연한 구조를 만들기 위해 사용된다.
		// SOLID 원칙 중 DIP, OCP

		// 왠만한거는 다 IoC 컨테이너에게 제어를 맡긴다
		// 어떻게 맡길 수 있을까..?
		// 스프링에서는 IoC 컨테이너에게 제어를 맡기는 몇가지 방법이 존재
		// 1. XML 설정 파일 -> Spring Framework
		// 2. 어노테이션을 활용한 방식 -> @Bean -> Spring Boot (이걸 많이씀)
		// 3. ApplicationContext(IoC컨테이너)를 주입받아서 거기에 직접 등록하는 방식

		// 위의 3개를 아무것도 하지 않은 자바 객체 A가 있다 -> Spring Bean일까? -> POJO
	}
}
