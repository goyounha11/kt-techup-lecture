package com.kt.practice.oop.solid;

public class OCPMain {
	public static void main(String[] args) {
		String profile = "dev";

		switch (profile) {
			case "default" -> {
				BFunction bFunction = new DefaultBFunction();
				System.out.println(bFunction.add(1, 2));
			}
			case "dev" -> {
				BFunction devBFunction = new DevBFunction();
				System.out.println(devBFunction.add(1, 2));
			}

			case "prod" -> {
				BFunction prodBFunction = new ProdBFunction();
				System.out.println(prodBFunction.add(1, 2));
			}

			default -> throw new IllegalStateException("Unexpected value: " + profile);
		}
	}
}
