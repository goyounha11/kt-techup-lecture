package com.kt.practice.oop;

public class HighValueCar extends Brand {
	private String uniqueFeature;

	public HighValueCar(String brand, String model, Long price, String uniqueFeature) {
		super(brand, model, price);
		this.uniqueFeature = uniqueFeature;
	}

	@Override
	void deal() {
		System.out.println("벤츠의 서비스 : 틴팅, 블랙박스");
	}

	public HighValueCar(String model, Long price, String uniqueFeature) {
		super("벤츠", model, price);
		this.uniqueFeature = uniqueFeature;
	}

	public HighValueCar(Long price, String uniqueFeature) {
		super("벤츠", "sclass", price);
		this.uniqueFeature = uniqueFeature;
	}
}
