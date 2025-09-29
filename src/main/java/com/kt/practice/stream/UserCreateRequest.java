package com.kt.practice.stream;

import java.time.LocalDate;

public class UserCreateRequest {
	String name;
	int age;
	LocalDate birthday;

	public UserCreateRequest(String name, int age, LocalDate birthday) {
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}
}
