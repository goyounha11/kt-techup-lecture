package com.kt.practice.oop.solid;

public class MailService implements NotificationService, NotificationReceiveService {
	@Override
	public void send(String message) {
		throw new UnsupportedOperationException("MailService는 메시지 전송 기능을 지원하지 않습니다.");
	}

	@Override
	public void receive(String message) {
		System.out.println("Mail 메시지 수신: " + message);
	}
}
