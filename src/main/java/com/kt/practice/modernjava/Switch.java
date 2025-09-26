package com.kt.practice.modernjava;

public class Switch {
	public static void main(String[] args) {
		int day = 2;
		String dayString = null;
		// 문법 -> 표현식
		switch (day) {
			case 1:
				dayString = "Monday";
				break;
			case 2:
				dayString = "Tuesday";
				break;
			case 3:
				dayString = "Wednesday";
				break;
			case 4:
				dayString = "Thursday";
				break;
		}

		System.out.println(dayString);

		String dayString2 = switch (day) {
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			case 3 -> "Wednesday";
			case 4 -> "Thursday";
			default -> "Invalid day";
		};

		// if문도 문법
		// kotlin -> 표현식

		// jdk14 이상이다
		// jdk8

		System.out.println(dayString2);
	}
}
