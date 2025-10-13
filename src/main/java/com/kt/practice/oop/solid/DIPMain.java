package com.kt.practice.oop.solid;

public class DIPMain {
	public static void main(String[] args) {
		NotificationService notificationService = new SlackService();
		//### DIP (Dependency Inversion Principle) 의존관계 역전 원칙
		//- 의존 관계를 맺을 때,**변하기 쉬운 것 (구체적인 것) 보다는 변하기 어려운 것 (추상적인 것)에 의존**해야 함
		//     
		// 구체화된 클래스에 의존하기 보다는추상 클래스나 인터페이스에 의존해야 한다는 뜻
		// - 즉,**고수준 모듈은 저수준 모듈의 구현에 의존해서는 안 됨**
		// - 저수준 모듈이 고수준 모듈에서 정의한 추상 타입에 의존해야 함
		// - **저수준 모듈이 변경되어도 고수준 모듈은 변경이 필요없는 형태가 이상적**
	}
}
