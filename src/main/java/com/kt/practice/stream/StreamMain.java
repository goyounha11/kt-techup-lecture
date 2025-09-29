package com.kt.practice.stream;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
	public static void main(String[] args) {
		/**
		 * 스트림이란 우리가 앞서 배운 람다식을 이용한 기술 중 하나이다.
		 * 데이터들을 조작 및 가공해서 원하는 값으로 반환해주는 인터페이스이다.
		 * jdk8 부터 제공된다.
		 *
		 * 원본List = "a", "b", "c"
		 *
		 * 특징
		 * 1. Stream은 원본 데이터를 변경하지 않는다.
		 *    Stream API는 원본 데이터를 조회하여 별도의 Stream 객체로 생성한다.
		 *    따라서 정렬, 필터 등등 작업을 하더라도 원본데이터는 변경되지 않는다.
		 * 2. Stream은 재사용이 불가능하다
		 *    람다식을 이용한 기술이기 때문에 일회성이다.
		 * 3. Stream은 내부 반복으로 작업을 처리한다.
		 *    반복문으로 처리한다. 따라서 순수 반복분 보다는 성능이 떨어지지만 개의치않아도 된다.
		 * Stream의 과정
		 * Stream은 생성 → 중간연산 → 최종연산 이 3가지의 과정을 통해 처리가 이루어진다.
		 * ex) 객체.stream생성().중간연산.최종연산()
		 */

		List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");

		//알파벳 e가 들어간 이름들만 모아서 출력 (filter)
		//jdk8부터 stream
		//jdk11부터
		var filteredNames = names.stream()
			.filter(name -> name.equals("Alice"))
			.toList();

		System.out.println(filteredNames);

		var mappedNames = names.stream()
			// .map(name -> name.toUpperCase())
			.filter(name -> name.contains("e"))
			.map(String::toUpperCase)
			.toList();

		System.out.println(names);
		System.out.println(mappedNames);

		var userRequests = List.of(
			new UserCreateRequest(
				"alice",
				1,
				LocalDate.now().minusYears(1)
			),
			new UserCreateRequest(
				"bob",
				5,
				LocalDate.now().minusYears(3)
			),
			new UserCreateRequest(
				"charlie",
				2,
				LocalDate.now().minusYears(1)
			),
			new UserCreateRequest(
				"eve",
				3,
				LocalDate.now().minusYears(2)
			)
		);

		var users = userRequests.stream()
			.filter(request -> request.age > 1)
			.map(request -> new User(
				request.name,
				request.age,
				request.birthday
			))
			.toList();

		System.out.println(users);

		// flatMap
		// 2차원배열일때 두개의 배열을 하나의 배열로 합치는 것
		var numbers = List.of(
			List.of(1, 2, 3),
			List.of(4, 5, 6),
			List.of(7, 8, 9)
		);

		var flatMapNumbers = numbers.stream()
			.flatMap(Collection::stream)
			.toList();

		System.out.println(numbers);
		System.out.println(flatMapNumbers);

		// limit 2개
		var limitedNames = names.stream().limit(2).toList();

		System.out.println(limitedNames);

		// skip

		var skipNames = names.stream().skip(2).toList();

		System.out.println(skipNames);

		List<String> names1 = List.of("Bob", "Alice", "David", "Charlie", "Eve");
		// sort
		var sortedNames = names1.stream().sorted().toList();

		System.out.println(sortedNames);

		var descNames = names1.stream()
			.sorted(Comparator.reverseOrder())
			.toList();

		System.out.println(descNames);

		var list1 = List.of(
			new Exam1(1),
			new Exam1(2),
			new Exam1(3),
			new Exam1(4),
			new Exam1(5)
		);

		var list2 = list1.stream()
			.sorted(Comparator.comparing(e -> e.id, Comparator.reverseOrder()))
			.toList();

		System.out.println("--------");
		System.out.println(list2);
		System.out.println("--------");

		names1.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(System.out::println);

		// distinct 중복제거
		var duplicatedNames = List.of("Alice", "Bob", "Alice", "Charlie", "Bob");

		var duplicatedNames1 = duplicatedNames.stream().distinct().toList();

		var duplicatedNames2 = duplicatedNames.stream().collect(Collectors.toSet());

		System.out.println(duplicatedNames1);
		System.out.println(duplicatedNames2);
	}
}
