package com.kt.practice.stream;

import java.util.List;

public class StreamMain2 {
	public static void main(String[] args) {
		List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");

		//findFirst -> Optional<T>
		// orElse, orElseGet, orElseThrow
		// ifPresent, ifPresentOrElse

		var findFirstName = names.stream().findFirst().get();
		System.out.println(findFirstName);

		//findAny
		var findAnyName = names.stream().findAny().get();
		System.out.println(findAnyName);

		// match
		// allMatch, anyMatch, noneMatch

		var name = names.stream().allMatch(n -> n.equals("Alice"));
		var name1 = names.stream().anyMatch(n -> n.equals("Alice"));
		var name2 = names.stream().noneMatch(n -> n.equals("Tom"));
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name2);

		var numbers = List.of(1, 2, 3, 4, 5);

		var sum = numbers.stream()
			.reduce(1, (x, y) -> x + y);

		System.out.println(sum);
	}
}
