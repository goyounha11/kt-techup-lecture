package com.kt.practice.spring;

import java.util.HashMap;
import java.util.Map;

public class MemberDB {
	private final Map<Long, String> db = new HashMap<>();

	public void save(Long id, String name) {
		db.put(id, name);
	}

	public String get(Long id) {
		return db.get(id);
	}
}
