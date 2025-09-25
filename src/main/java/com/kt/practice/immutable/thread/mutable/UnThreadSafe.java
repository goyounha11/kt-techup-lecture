package com.kt.practice.immutable.thread.mutable;

public class UnThreadSafe {
	public static void main(String[] args) {
		MutablePoint mutablePoint = new MutablePoint(1, 2);

		new Thread(() -> {
			for (int i = 0; i < 100_000; i++) {
				mutablePoint.x++;
				mutablePoint.y++;
				String msg = mutablePoint.x + "," + mutablePoint.y;
				System.out.println("일꾼1" + msg);
			}
		}).start();

		new Thread(() -> {
			for (int i = 0; i < 100_000; i++) {
				mutablePoint.x++;
				mutablePoint.y++;
				String msg = mutablePoint.x + "," + mutablePoint.y;
				System.out.println("일꾼2" + msg);
			}
		}).start();

		new Thread(() -> {
			for (int i = 0; i < 100_000; i++) {
				mutablePoint.x++;
				mutablePoint.y++;
				String msg = mutablePoint.x + "," + mutablePoint.y;
				System.out.println("일꾼3" + msg);
			}
		}).start();
	}
}
