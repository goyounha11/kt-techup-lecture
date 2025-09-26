package com.kt.practice.modernjava;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

public class TimeAPI {
	public static void main(String[] args) {
		// jdk 8
		// java.util.Date
		// java.util.Calendar

		Date date = new Date();

		System.out.println(date);
		// yyyy-MM-dd HH:mm:ss
		// 2024-06-20 14:30:00

		// LocalDate, LocalTime, LocalDateTime
		// ZonedDateTime, OffsetDateTime
		// Instant
		// Period, Duration

		// UTC -> KST - 9시간
		// yyyy-MM-dd HH:mm:ss -> 현지시간
		// yyyy-MM-dd HH:mm:ssZ -> UTC
		// yyyy-MM-dd HH:mm:ss+09 -> Offset

		Instant instant = Instant.now();
		System.out.println(instant);
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		OffsetDateTime offsetTime = OffsetDateTime.now();
		System.out.println(offsetTime);
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);

		Duration duration = Duration.ofHours(1);
		System.out.println(duration);
	}
}
