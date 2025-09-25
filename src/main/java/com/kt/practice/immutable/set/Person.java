package com.kt.practice.immutable.set;

import java.util.Objects;

public class Person {
	final String name;
	final int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		// == 객체의 메모리 주소값이 똑같으면 true
		if (this == obj)
			return true;
		// instanceof => typeOf
		if (obj instanceof Person p) {
			return this.name.equals(p.name) && this.age == p.age;
		}

		return false;
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + "}";
	}
}
