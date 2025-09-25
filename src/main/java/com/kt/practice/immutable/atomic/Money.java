package com.kt.practice.immutable.atomic;

public class Money {
	final int amount;

	public Money(int amount) {
		this.amount = amount;
	}

	public int amount() {
		return amount;
	}

	// amount : 1000,
	// targetAmount : 2000
	// 1000 - 2000 = -1000
	public Money minus(int targetAmount) {
		if (this.amount < targetAmount) {
			throw new IllegalArgumentException("잔액이 부족합니다.");
		}

		return new Money(this.amount - targetAmount);
	}

	@Override
	public String toString() {
		return "Money(" + amount + ")";
	}
}
