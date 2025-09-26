package com.kt.practice.modernjava;

public class DefaultMeter implements MeterInterface {
	@Override
	public double measure() {
		return new Meter(100).value;
	}

	@Override
	public String result() {
		return new Meter(100).value + unit();
	}
}
