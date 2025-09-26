package com.kt.practice.modernjava;

public class MeterMain {
	public static void main(String[] args) {
		MeterInterface defaultMeter = new DefaultMeter();
		System.out.println("Default Meter Measurement: " + defaultMeter.measure());
		System.out.println("Default Meter Result: " + defaultMeter.result());

		MeterModernJavaInterface meter = MeterModernJavaInterface.of(250.5);

		System.out.println("Modern Java Meter Measurement: " + meter.measure());
	}
}
