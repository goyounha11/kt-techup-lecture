package com.kt.practice.oop.solid;

public class SolidMain {
	public static void main(String[] args) {
		// SOLID 원칙 => 객체지향의 기본이되는 5가지 원칙

		// SRP(Single Responsibility Principle) 단일 책임 원칙
		// OCP(Open Closed Principle) 개방 폐쇄 원칙
		// LSP(Liskov's Substitution Principle) 리스코프 치환 원칙
		// ISP(Interface Segregation Principle) 인터페이스 분리 원칙
		// DIP(Dependency Inversion Principle) 의존관계 역전 원칙

		// SRP 단일 책임 원칙
		// 하나의 클래스는 하나의 책임만 가져야한다.
		// 클래스를 변경하는 이유는 단 하나여야한다.
		// 책임이 많아지면 변경의 이유도 많아진다.

		// 책임? => 기능
		//SRP 에서 이야기하는책임이란,
		// '기능' 정도로 생각하면 된다.
		// 만약한 클래스가 수행할 수 있는 기능 (책임) 이 여러 개라면,
		// 클래스 내부의 함수끼리 강한 결합을 발생할 가능성이 높아진다.
		// 응집도는 높고 결합도는 낮은 프로그램을 설계하는 것이 비로소 객체지향 설계의 핵심인데,
		// 이것이 위반되는 것이다.
		// 새로운 요구사항이나 프로그램 변경에 의해 클래스 내부의 동작들이 연쇄적으로 변경되어야 할 수도 있다.
		// 이는유지보수가 비효율적이므로, 책임을 잘게 쪼개어 분리시킬 필요가 있다.

		//예를 들어 어떤 클래스내에 **A 라는 메소드가 있고,
		// 이 A 메소드는 A 메소드의 결과를 기반으로 B 메소드를 호출하며,
		// B 메소드는 B 메소드의 결과를 기반으로
		// C 메소드를 호출하도록 구현**이 되어있다고 해보자.
		// 이 때 만약 A 메소드의 동작이 일부 수정된다고 할 때,
		// B 와 C 메소드를 전부 바꿔야 할 상황이 발생할 수 있다.
		// 유지보수가 매우 비효율적인 것이다.
		// 따라서 이들을 모두 분리할 필요가 있다.

		var aService = new AService();
		aService.a();
		var b = aService.b();

		var addService = new AddService();

		// OCP => 개방 폐쇄 원칙
		// 확장에는 열려있어야 하고, 변경에는 닫혀 있어야 함
		// 즉,기존의 코드를 변경하지 않고 기능을수정하거나 추가할 수 있도록 설계해야 함

		// Spring Framework => profile 기능
	}
}
