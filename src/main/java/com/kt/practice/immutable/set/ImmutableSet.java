package com.kt.practice.immutable.set;

import java.util.HashSet;
import java.util.Set;

public class ImmutableSet {
	public static void main(String[] args) {
		final Set<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(2);
		
		Set<Integer> unmodifiableSet = Set.of(1, 2);

		unmodifiableSet.add(3);

		System.out.println(numbers);
	}
}
