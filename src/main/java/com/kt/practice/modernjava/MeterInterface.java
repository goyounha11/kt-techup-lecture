package com.kt.practice.modernjava;

public interface MeterInterface {
	double measure(); // 측정값을 반환하는 메서드

	String result();

	default String unit() {
		return "ms";
	}
}
