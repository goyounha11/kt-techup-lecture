package com.kt.practice.immutable.thread.immutable;

public class ThreadSafe {
	public static void main(String[] args) {
		Point immutablePoint = new Point(1, 2);
		
		new Thread(() -> {
			for (int i = 0; i < 1_000_000; i++) {
				String msg = immutablePoint.x + "," + immutablePoint.y;
				System.out.println("일꾼1" + msg);
			}
		}).start();

		new Thread(() -> {
			for (int i = 0; i < 1_000_000; i++) {
				String msg = immutablePoint.x + "," + immutablePoint.y;
				System.out.println("일꾼2" + msg);
			}
		}).start();

		new Thread(() -> {
			for (int i = 0; i < 1_000_000; i++) {
				String msg = immutablePoint.x + "," + immutablePoint.y;
				System.out.println("일꾼3" + msg);
			}
		}).start();
	}
}
