package com.kt.practice.stream;

import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StreamMain4 {
	public static void main(String[] args) {
		List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");

		// groupingBy => 어떤 기준으로 그룹핑해서 Map형태로 반환
		// 기준의 값이 key, 그 값에 해당하는 컬렉션이 value
		var a = names.stream().collect(Collectors.groupingBy(n -> n.length()));
		System.out.println(a);

		// name, score

		var b = a.get(3);
		System.out.println(b);

		var examList = List.of(
			new Exam("철호", 50),
			new Exam("도현", 60),
			new Exam("의진", 10),
			new Exam("동현", 20),
			new Exam("무경", 30),
			new Exam("경호", 80),
			new Exam("종한", 90),
			new Exam("지민", 100),
			new Exam("정수", 60),
			new Exam("예은", 10),
			new Exam("승규", 30),
			new Exam("세현", 50),
			new Exam("슬기", 70),
			new Exam("신영", 90)
		);

		var groupedMap = examList.stream().collect(
			Collectors.groupingBy(exam -> exam.score)
		);

		System.out.println(groupedMap);
		//
		// var ab = groupedMap.entrySet().stream().filter(entry -> entry.getKey() >= 90)
		// 	.flatMap(r -> r.getValue().stream())
		// 	.toList();
		//
		// System.out.println(ab);

		var groupedMap1 = examList.stream().collect(
			Collectors.groupingBy(
				exam -> exam.score,
				Collectors.counting()
			)
		);

		System.out.println(groupedMap1);

		var groupedMap2 = examList.stream().collect(
			Collectors.groupingBy(
				exam -> exam.score,
				Collectors.mapping(exam -> exam.name, Collectors.toList())
			)
		);

		System.out.println(groupedMap2);

		var groupedMap3 = examList.stream().collect(
			Collectors.groupingBy(
				exam -> exam.score,
				TreeMap::new,
				Collectors.mapping(exam -> exam.name, Collectors.toList())
			)
		);

		System.out.println(groupedMap3);

		// partitioningBy
		var partitionedMap = examList.stream().collect(
			Collectors.partitioningBy(exam -> exam.score >= 60)
		);

		System.out.println(partitionedMap);

		var partitionedMap1 = examList.stream().collect(
			Collectors.partitioningBy(exam -> exam.score >= 60)
		);

		var passedPerson = partitionedMap1.entrySet().stream()
			.filter(entry -> entry.getKey())
			.flatMap(map -> map.getValue().stream())
			.map(exam -> {
				exam.isPass = true;
				return exam;
			})
			.toList();

		System.out.println(passedPerson);

		//summarizingInt
		var summarizingInt = names.stream().collect(Collectors.summarizingInt(String::length));
		System.out.println(summarizingInt);

	}
}
