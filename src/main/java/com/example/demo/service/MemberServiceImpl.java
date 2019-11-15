package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MemberDao;
import com.example.demo.dto.Member;
import com.example.demo.util.CUtil;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao memberDao;

	@Override
	public Map<String, Object> checkLoginDupRs(String loginId) {
		int count = memberDao.getLoginIdDupCount(loginId);
		String resultCode = "";
		String msg = "";
		if (count == 0) {
			resultCode = "S-1";
			msg = "사용 가능한 로그인 Id 입니다.";

		} else {
			resultCode = "F-1";
			msg = "사용중인 로그인 Id 입니다.";
		}
		Map<String, Object> rs = new HashMap<String, Object>();
		rs.put("resultCode", resultCode);
		rs.put("msg", msg);
		return rs;
	}

	@Override
	public Map<String, Object> join(Map<String, Object> param) {
		memberDao.join(param);
		long newId = CUtil.getAsLong(param.get("id"));
		log.info("newId = " + newId);
		String resultCode = "";
		String msg = "";
		if (newId != 0) {
			resultCode = "S-1";
			msg = "회원가입 완료";
		} else {
			resultCode = "F-1";
			msg = "회원가입 실패";
		}
		Map<String, Object> rs = new HashMap<String, Object>();
		rs.put("resultCode", resultCode);
		rs.put("msg", msg);
		rs.put("newId", newId);
		return rs;

	}

	@Override
	public Member getMatchOne(String loginId, String loginPw) {

		return memberDao.getMatchOne(loginId, loginPw);
	}
}
