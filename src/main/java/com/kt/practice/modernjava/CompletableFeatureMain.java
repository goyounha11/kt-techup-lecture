package com.kt.practice.modernjava;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFeatureMain {
	public static void main(String[] args) {
		// 비동기 처리
		// 쓰레드를 여러개 해서
		// 하나의 쓰레드에서 작업하다가 다른 쓰레드하나 만들어서 거기서도 어떤 작업을
		// 처리하도록
		// 동기 : 순차적으로

		// 여자화장실 줄이 엄청 김
		// 남자화장실 줄이 비교적 덜 함

		// 동기: 앞사람의 작업이 끝날때까지 나도 대기
		// 비동기: 앞사람의 작업이 끝나든 말든 그냥 나는 내할거함

		// 위에서아래로 시간순으로 왼쪽에서 오른쪽으로

		// 비동기처리를하기위한 서비스객체 제공
		ExecutorService pool = Executors.newFixedThreadPool(4);

		var feature1 = CompletableFuture.supplyAsync(() -> heavy(1), pool);
		var feature2 = CompletableFuture.supplyAsync(() -> heavy(2), pool);

		int sum = feature1.thenCombine(feature2, Integer::sum).join();

		System.out.println("sum=" + sum);
	}

	static int heavy(int i) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException ignored) {
		}
		return i * 10;
	}
}
