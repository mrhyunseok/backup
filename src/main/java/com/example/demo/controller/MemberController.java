package com.example.demo.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.Member;
import com.example.demo.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;

	@RequestMapping("member/join")
	public String join() {
		return "member/join";
	}

	@RequestMapping("member/login")
	public String login() {
		return "member/login";
	}

	@RequestMapping("member/doJoin")
	public String doJoin(@RequestParam Map<String, Object> param, Model model) {
		Map<String, Object> checkLoginDupRs = memberService.checkLoginDupRs((String) param.get("loginId"));
		if (((String) checkLoginDupRs.get("resultCode")).startsWith("F-")) {
			model.addAttribute("alertMsg", checkLoginDupRs.get("msg"));
			model.addAttribute("historyBack", true);
			return "common/redirect";
		}
		Map<String, Object> joinRs = memberService.join(param);
		if (((String) joinRs.get("resultCode")).startsWith("F-")) {
			model.addAttribute("alertMsg", joinRs.get("msg"));
			model.addAttribute("historyBack", true);
			return "common/redirect";
		}
		model.addAttribute("alertMsg", joinRs.get("msg"));
		model.addAttribute("redirectUrl", "/member/login");
		return "common/redirect";

	}

	@RequestMapping("member/doLogin")
	public String doLogin(@RequestParam Map<String, Object> param, Model model, HttpSession session) {
		Member memberMatch = memberService.getMatchOne((String) param.get("loginId"), (String) param.get("loginPw"));

		if (memberMatch == null) {
			model.addAttribute("alertMsg", "일치하는 회원이 존재하지않습니다.");
			model.addAttribute("historyBack", true);
			return "common/redirect";

		}

		session.setAttribute("loginIdMemberId", memberMatch.getId());
		model.addAttribute("alertMsg", "로그인 성공");
		model.addAttribute("redirectUrl", "/");
		return "common/redirect";
	}

}
