package com.kt.practice.spring;

public class MemberService {
	private final MemberDB memberDB;

	public MemberService(MemberDB memberDB) {
		this.memberDB = memberDB;
	}

	public void join(Long id, String name) {
		System.out.println("회원가입 처리");
		memberDB.save(id, name);
	}
}
