package com.example.demo.service;

import java.util.Map;

import com.example.demo.dto.Member;

public interface MemberService {

	public Map<String, Object> checkLoginDupRs(String loginId);

	public Map<String, Object> join(Map<String, Object> param);

	public Member getMatchOne(String loginId, String loginPw);

}
