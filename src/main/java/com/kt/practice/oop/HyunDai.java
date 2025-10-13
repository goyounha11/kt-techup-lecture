package com.kt.practice.oop;

public class HyunDai extends Brand {
	public HyunDai(String brand, String model, Long price) {
		super(brand, model, price);
	}

	@Override
	void deal() {
		System.out.println("현대의 서비스 : 하이패스");
	}
}
