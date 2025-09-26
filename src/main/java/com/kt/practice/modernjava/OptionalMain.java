package com.kt.practice.modernjava;

import java.util.Optional;

public class OptionalMain {
	public static void main(String[] args) {
		// Optional = Null을 다루는 기술
		// NPE = Null Pointer Exception

		Optional<String> optionalString =
			Optional.of("Hello, KT Cloud Tech Up Back-End First Team!");

		// 나이를 가져오는데 null 이면 0
		Optional<Person> optionalPerson = Optional.ofNullable(null);

		// Person p = null;
		// System.out.println(p.age);

		Person p1 = optionalPerson.orElseGet(() -> {
			Person p3 = new Person(0, "초기값");
			p3.age = 100;
			return p3;
		});
		Person p2 = optionalPerson.orElse(new Person(0, "초기값"));

		System.out.println(p1.age);

		optionalPerson.ifPresent(person -> {
			System.out.println("값이 존재합니다.");
		});

		optionalPerson.ifPresentOrElse(person -> {
				System.out.println("값이 존재합니다.");
			}, () -> {
				System.out.println("값이 존재하지 않습니다.");
			}
		);

		Optional<Person> optionalPerson2 = Optional.empty();

		// optionalPerson2.orElseThrow();
		optionalPerson2.orElseThrow(() -> {
			return new IllegalArgumentException();
		});
		// orElseGet - 값이 없으면 기본값을 제공
		// orElse
		// ifPresent
		// ifPresentOrElse
		// orElseThrow

	}
}
