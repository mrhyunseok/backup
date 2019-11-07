package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;

	@RequestMapping("member/join")
	public String join() {
		return "member/join";
	}

}
