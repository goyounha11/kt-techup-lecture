package com.kt.practice.immutable.atomic;

public class ImmutableAtomic {
	// 어떤 객체를 만들고 오류를 내보고 실패 원자성이 보장되는가?
	public static void main(String[] args) {
		Money money1 = new Money(10_000);
		Money money2 = new Money(20_000);

		System.out.println("money1 = " + money1);

		try {
			// money1.minus(20_000);
			Money changeMoney = money1.minus(5_000);

			System.out.println("changeMoney = " + changeMoney);
		} catch (IllegalArgumentException e) {
			// 비정상적일 때 작동하길 기대하는 코드
			System.out.println(e.getMessage());
		}

		System.out.println("money1 = " + money1); // 5_000원
	}
}
