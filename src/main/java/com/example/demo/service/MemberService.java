package com.example.demo.service;

import java.util.Map;

public interface MemberService {

	Map<String, Object> checkLoginDupRs(String loginId);

	Map<String, Object> join(Map<String, Object> param);

}
