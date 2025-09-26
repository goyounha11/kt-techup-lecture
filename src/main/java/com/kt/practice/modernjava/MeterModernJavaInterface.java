package com.kt.practice.modernjava;

public interface MeterModernJavaInterface {
	double measure();

	default String unit() {
		return "ms";
	}

	static MeterModernJavaInterface of(double v) {
		return () -> v;
	}
}
