package com.kt.practice.spring;

public class SpringMain {
	public static void main(String[] args) {
		// Spring Framework
		// Spring Boot << 이걸 더 많이 들어봤을 가능성이 좀 있음.
		// Spring Framework랑 Boot는 다른건가요?
		// Boot가 Spring Framework를 더 쉽게 쓸 수 있게 도와주는 도구입니다.

		// Spring Framework를 대체 왜 쓸까?
		// 경호 : 빠르게 웹 서비스를 만들고 제공해주고 싶어서
		// 세현 : 정해진 틀 안에서 개발하기 위해서 ->
		// 정해진 틀 안에서 개발하다보면 개발자가 서버 개발 코드를 작성할때
		// 제약이 생기고 협업 과정에서 오류를 방지하거나 유지보수성과 가독성을 높일수 있을것같습니다
		// 정수 : 다른 개발자가 작성한 모듈을 손쉽게 적용할 수 있습니다.
		// 경호 : 예전에는 개발자가 직접 서블릿을 구현하고 이를 톰캣과 같은
		// 외부 WAS에 배포해야 했지만 지금은 스프링 부트가 내장 톰캣을 제공하기 때문에
		// 별도의 설정 없이 애플리케이션을 실행하기만 하면 자동으로 서버가 구동되는 부분들?
		// 인 것 같습니다

		// 스프링 프레임워크를 왜 사용할까?
		// 1. 프레임워크이기 때문에, 일정한 수준의 개발 퀄리티를 보장받을 수 있다.
		// 2. 개발 생산성이 높아진다. -> 개발자가 모든것을 다 만들어야함
		// 서블릿뿐만아니라 이 앞단에 어떤 CS적인 어떤 핸들러들, 필터들 다 하나하나 손수 만들어야 했음
		// 만들다보니 프로젝트에서 공통적으로 만들어놓고 계속 재사용하더라
		// 만드는 방식이 너무 다양하더라
		// -> 프레임워크화 시켜서 공통적인 요소들은 자동으로 돌아가게끔 만든 것
		// 3. IoC/AOP/PSA 라는 3가지 핵심기술을 통해서 상당히 유연한 구조를 제공한다.
		// 4. POJO(Plain Old Java Object)를 완벽하게 지원한다. -> 순수한 자바객체

		// 지금까지 우리가 개발한 내용을 바탕으로 한번 간단한 예시를
		// EJB(Enterprise Java Beans) -> 강사도 써보진 않음 <- Winter(겨울)
		// EJB -> 어떤 개발자가 -> 아.. 내가 하나 만들고 말지.. -> 3만줄짜리 IoC 컨테이너를 만듦
		// -> IoC 컨테이너가 지금의 Spring Framework의 시초

		// 경호 : service가 db에 의존적이다. -> new를 직접해서 사용해서 강결합
		// 정수 : 매번 DB객체를 새로 생성해서 자원낭비가 발생할거같습니다
		// -> 서비스 객체도 새로 생성해서 자원 낭비 발생
		// -> 디비를 매번 생성하기 때문에, new MemberDB() 하면 데이터가 초기화 됨
		MemberDB memberDB = new MemberDB();
		MemberService memberService = new MemberService(memberDB);
		memberService.join(1L, "철호");

		// memberDB = new 했음
		// 사용이끝나면 없어져라, 삭제해라, GC야 삭제해라

		// new를 쓴다 -> heap 메모리에 계속 쌓인다 -> 메모리 누수 -> OOM
		// 성능도 안좋아짐

		// spring에서는..
		// 1. new를 하지말자 -> 개발자가 하지말고, 프레임워크가 관리해주자 -> IoC
		// Inversion of Control (제어의 역전)
		// Spring Container (IoC Container / DI Container)
		// 2. 객체의 생명주기를 관리해줌 (생성 -> 사용 -> 소멸)

		// MemberDB memberDB1 = MemberDB();
		// MemberService memberService1 = MemberService(memberDB);
		// memberService1.join(1L, "철호");

		// 컴파일 오류나는데요?
		// 이건 어디서 가져오나요?
		// 순수 자바 프로젝트에서는 안됨 -> Spring Framework가 필요
	}
}
