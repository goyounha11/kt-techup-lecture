package com.kt.practice.spring;

public class AOPMain {
	public static void main(String[] args) {
		// ### AOP (Aspect Oriented Programming) 관점 지향 프로그래밍
		// AOP는 Spring의 핵심기술 중 하나인데, 이건 Spring에서 시작된 개념일까?
		// AspectJ라는 AOP 전용 프레임워크가 존재
		// Spring Team에서 AspectJ를 가져와서 스프링에 통합한 것

		// AOP는 OOP의 한계를 보완하기 위해 등장

		// OOP는 객체의 행동과 상태가 중심이 되는 프로래밍방법
		// 사람이라면 무조건 먹고 자고 싸고
		// 항상 같은자세로 잔다
		// 그러면 이거 자는거 분리할 수 있지 않나?
		// Sleep를 어떤 클래스에 분리함
		// joinpoint
		// 어노테이션들과 같이 활용을 쉽게 할 수 있도록 설계해둠

		/**
		 * AOP 관련해서 질문이 있습니다.
		 *
		 * - 예를 들면, 다음과 같은 상황에서 ( -> 는 의존성 혹은 관심사 방향)
		 * - [비즈니스 로직 담당]UserService -> [데이터 접근 및 관리] **ProductRepository**, UserRepository
		 * - [비즈니스 로직 담당]ProductService -> [데이터 접근 및 관리]**ProductRepository**
		 * - UserService와 ProductService의 공통 관심사인 ProductRepository를 분리해서 모듈화하여 재사용할 수 있도록 하는것? 이라고 생각하면된까요?
		 */
	}
}
