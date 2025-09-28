package com.kt.practice.lambda;

public class LambdaMain {
	public static void main(String[] args) {
		// 람다식
		// 기본 생김새 () -> {}
		// 순수함수 - 입력값이 같으면 출력값이 같다. (부수효과가 없다.)
		// 순수함수 - 일급시민 : (FP 함수형프로그래밍)

		/**
		 * 람다 함수는 프로그래밍 언어에서 사용되는 개념으로**익명 함수(Anonymous functions) - 일회성 를 지칭**하는 용어
		 * 현재 사용되고 있는 람다의 근간은 수학과 기초 컴퓨터과학 분야에서의람다 대수이다. 람다 대수는 간단히 말하자면 수학에서 사용하는 함수를 보다**단순하게 표현하는 방법**입니다.
		 * 두 개 이상의 입력이 있는 함수는 최종적으로 1개의 입력만 받는 람다 대수로 단순화 될 수 있다. - 커링 (Curring)
		 * **익명함수?**
		 * 익명함수란 말그대로 함수의 이름이 없는 함수입니다.익명함수들은공통으로**일급객체(First Classcitizen)라는 특징**을 가지고 있다.
		 * 이 일급 객체란 일반적으로 다를 객체들에 적용 가능한 연산을 모두 지원하는 개체를 가르키고, 함수를 값으로 사용 할 수도 있으며 파라메터로 전달 및 변수에 대입 하기와 같은연산들이 가능하다.
		 * 람다식의 장점
		 * 1. 코드의 간결성
		 * 2. 지연연산 수행
		 * 3. 병렬처리 가능
		 *  람다식의 단점
		 * 디버깅이 까다롭다.
		 * 람다 stream 사용 시 단순 for문 혹은 while문 사용 시 성능이 떨어짐
		 * 불필요하게 너무 사용하게 되면 오히려 가독성을 떨어 수 있음
		 * 기본 문법
		 * 1. 람다는 매개변수 화살표(->) 함수몸체로 이용하여 사용 할 수 있다.
		 * 2. 함수몸체가 단일 실행문이면 괄호{}를 생략 할 수 있다.
		 * 3. 함수몸체가 return문으로만 구성되어 있는 경우 괄호{}를 생략 할 수 없다.
		 */

		//기본 생김새 () -> {} => () 매개변수 -> {} 함수 몸체

		// () -> { system.out.println("Hello Lambda") };
		// () -> system.out.println("Hello Lambda");
		// () -> { return "Hello Lambda"; };
		// () -> "Hello Lambda";

		AddInterface addFunctionBasic = new AddInterface() {
			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};

		AddInterface addFunctionLambda = (a, b) -> a + b;

		// 람다에는 메서드 리퍼런스
		addFunctionLambda.add(10, 20);
		AddInterface methodRef = Integer::sum;

		System.out.println(addFunctionLambda.add(10, 20));
		System.out.println(methodRef.add(10, 20));

		// 성장하는 사람과 그렇지 못한 사람의 차이
	}
}
