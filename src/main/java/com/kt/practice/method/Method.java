package com.kt.practice.method;

import java.util.Map;

public class Method {
	public static void main(String[] args) {
		// Method 함수 = ?? -> 심부름 => 메시지
		// 나 : 밥먹기, 잠자기, 심부름
		// 아빠

		// 인자 = 파라미터 = paremeter = 매개변수 => 엄마의 요구 조건을 전달 창구
		// 리턴 => 요구조건을 수행하고 엄마에게 결과를 전달함

		Map<String, String> 오른쪽주머니 = 심부름("사과", 10_000);

		System.out.println("사온물건 : " + 오른쪽주머니.get("product"));
		System.out.println("잔돈 : " + 오른쪽주머니.get("change"));
		System.out.println("엄마: " + 오른쪽주머니.get("product") + " 잘 사왔네~");
		System.out.println("-------------------");

		Map<String, String> 왼쪽주머니 = 심부름("바나나", 20_000);

		System.out.println("사온물건 : " + 왼쪽주머니.get("product"));
		System.out.println("잔돈 : " + 왼쪽주머니.get("change"));
		System.out.println("엄마: " + 왼쪽주머니.get("product") + " 잘 사왔네~");
		// 다음날
		// 엄마: 사과 한 팩

	}

	public static Map<String, String> 심부름(String product, int money) {
		// 사과 : 받은 만원, 바나나 : 받은 2만원
		// 사과는 5000원, 바나나는 7000원
		// 내 과자는 500원

		// if => 만약에

		// 만약에 사과면 5000을빼고
		// 아니면 7000을 뺀다.

		int change = 0;
		if (product.equals("사과")) {
			change = money - 5000;
		} else {
			change = money - 7000;
		}

		change = change - 500;

		System.out.println("돈 " + money + "원 줄테니까 요 앞에 마트 가서 " + product + " 한 팩사와");
		System.out.println("남는 돈으로 과자도 하나 사오렴");
		System.out.println("아주머니한테 인사 잘하고 횡단보도 건널 때 차 조심하고");
		System.out.println("알았지? 다녀와~");

		System.out.println("잔돈: " + change + "원 받았다~");

		return Map.of(
			"product", product,
			"change", change + "원"
		);
	}
	// Map -> Key, Value 로 이루어진 자료구조
	// Pair -> Tuple

	public static Map<String, String> 심부름1(String product, int money) {
		// 사과 : 받은 만원, 바나나 : 받은 2만원
		// 사과는 5000원, 바나나는 7000원
		// 내 과자는 500원

		// if => 만약에

		// 만약에 사과면 5000을빼고
		// 아니면 7000을 뺀다.

		int change = 0;
		if (product.equals("사과")) {
			change = money - 5000;
		} else {
			change = money - 7000;
		}

		change = change - 500;

		System.out.println("돈 " + money + "원 줄테니까 요 앞에 마트 가서 " + product + " 한 팩사와");
		System.out.println("남는 돈으로 과자도 하나 사오렴");
		System.out.println("아주머니한테 인사 잘하고 횡단보도 건널 때 차 조심하고");
		System.out.println("알았지? 다녀와~");

		System.out.println("잔돈: " + change + "원 받았다~");

		return Map.of(
			"product", product,
			"change", change + "원"
		);
	}
}
