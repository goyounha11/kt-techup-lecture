package com.kt.practice.modernjava;

public class PatternMatching {
	public static void main(String[] args) {
		Object obj = "Hello, KT Cloud Tech Up Back-End First Team!";

		if (obj instanceof String s) {
			// String s = (String) obj;
			System.out.println("String length: " + s.length());
		} else {
			System.out.println("Not a string");
		}
		// 사람 - 이름 나이 주소 주민번호
		// 학생  - 학년 반 번호
		// 선생님 - 학년 반 번호 직급 담당과목
		// 관리자 - 부서 직급
		
		// 사람을 가져옴 너 학생이니? 선생님이니?
	}
}
