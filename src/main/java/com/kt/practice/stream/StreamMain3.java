package com.kt.practice.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain3 {
	public static void main(String[] args) {
		List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");

		// 최종연산 Collectors
		var nameList = names.stream().toList();
		var nameSet = names.stream().collect(Collectors.toSet());
		var nameMap = names.stream().collect(Collectors.toMap(
			name -> name,
			name -> name.length()));

		System.out.println(nameList);
		System.out.println(nameSet);
		System.out.println(nameMap);

		// 어떤배열의 총갯수

		var count1 = names.stream().count();
		var count2 = names.stream().collect(Collectors.counting());

		System.out.println(count1);
		System.out.println(count2);

		// joining -> String
		var joining1 = names.stream().collect(Collectors.joining());
		var joining2 = names.stream().collect(Collectors.joining(", "));
		var joining3 = names.stream().collect(Collectors.joining(", ", "[", "]"));

		System.out.println(joining1);
		System.out.println(joining2);
		System.out.println(joining3);

		// 평균, 합계
		var sumLength = names.stream().collect(Collectors.summingInt(n -> n.length()));

		System.out.println(sumLength);

		var averageLengthDouble = names.stream().collect(Collectors.averagingInt(n -> n.length()));

		var averageLength = names.stream()
			.collect(Collectors.averagingInt(n -> n.length()));

		System.out.println(averageLengthDouble);
		System.out.println(averageLength);

		// 최대값(max), 최소값(min)

		var min = names.stream().collect(Collectors.minBy(Comparator.comparingInt(n -> n.length()))).get();
		System.out.println(min);

		var max = names.stream().collect(Collectors.maxBy(Comparator.comparingInt(n -> n.length()))).get();
		System.out.println(max);

		var min1 = names.stream().min(Comparator.comparingInt(n -> n.length())).get();
		var max1 = names.stream().max(Comparator.comparingInt(n -> n.length())).get();

		System.out.println(min1);
		System.out.println(max1);

	}
}
