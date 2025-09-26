package com.kt.practice.modernjava;

import java.util.ArrayList;

public class Variable {
	public static void main(String[] args) {
		//자바에서 변수는 어떤 방식으로 총 3단계가 있는데
		// 1. 선언
		// 2. 초기화
		// 3. 할당
		// 4. 사용

		int a = 1;
		int b; // 선언 + 초기화 int인 기본 자료형의 초기값은 0
		b = 2; // 할당
		Integer c = null; // 선언 + 초기화 Integer인 참조 자료형의 초기값은 null
		c = 4;

		// 앞뒤가 똑같아야한다. Type 변수명 = 값; 값의 타입
		// 롬복의 var, val
		// val, var => val(value) : final, var(variable)
		// jdk 12
		var ktCloudTechUpBackEndFirstTeam = new KTCloudTechUpBackEndFirstTeam();
		// val ktCloudTechUpBackEndFirstTeam = new KTCloudTechUpBackEndFirstTeam();
		ktCloudTechUpBackEndFirstTeam.teamName = "1팀";

		// 코틀린
		// val, var => val(value) : final, var(variable)
		var list1 = new ArrayList<KTCloudTechUpBackEndFirstTeam>();

		list1.add(new KTCloudTechUpBackEndFirstTeam());
	}
}
