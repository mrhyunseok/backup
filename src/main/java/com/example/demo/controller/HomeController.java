package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("home/main")
	public String showMain() {
		return "home/main";
	}

	@RequestMapping("/")
	public String showMain2() {
		return "redirect:/home/main";
	}
}
