package com.kt.practice.oop;

public abstract class Brand extends Car {
	private String brand;
	private String model;
	private Long price;

	// 딜러들한테 받는 서비스가 다 틀릴거라 그때 그때 덮어쓰기
	abstract void deal();

	protected Brand(String brand, String model, Long price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
}
