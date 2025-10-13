package com.kt.practice.oop.solid;

public class LSPMain {
	// LSP (Liskov Substitution Principle) - 상속 관계에서 자식 클래스는 부모 클래스의 역할을 대체할 수 있어야 한다.
	public static void main(String[] args) {
		NotificationService slackService = new SlackService();
		slackService.send("Hello, Slack!");

		NotificationService mailService = new MailService();
		mailService.send("Hello, Mail!");
	}
}
