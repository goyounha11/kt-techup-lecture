package com.kt.practice.stream;

import java.time.LocalDate;

public class User {
	String name;
	int age;
	LocalDate birthday;

	public User(String name, int age, LocalDate birthday) {
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "User{" +
			"name='" + name + '\'' +
			", age=" + age +
			", birthday=" + birthday +
			'}';
	}
}
