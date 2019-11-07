package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.Article;
import com.example.demo.service.ArticleService;

@Controller
public class ArticleController {
	@Autowired
	private ArticleService articleService;

	@RequestMapping("article/list")
	public String showList(Model model) {
		List<Article> list = articleService.getList();
		model.addAttribute("list", list);
		return "article/list";
	}

	@RequestMapping("article/add")
	public String add() {
		return "article/add";

	}

	@RequestMapping("article/doAdd")
	@ResponseBody
	public String doAdd(@RequestParam Map<String, Object> param) {
		StringBuilder sb = new StringBuilder();
		long newId = articleService.add(param);
		String msg = newId + "번째 게시글이 추가되었습니다.";
		sb.append("alert('" + msg + "');");
		sb.append("location.replace('./detail?id=" + newId + "');");
		sb.insert(0, "<script>");
		sb.append("</script>");
		return sb.toString();

	}

	@RequestMapping("article/detail")
	public String detail(Model model, long id) {
		Article article = articleService.getOne(id);
		model.addAttribute("article", article);
		return "article/detail";
	}

	@RequestMapping("article/modify")
	public String moidfy(Model model, long id) {
		Article article = articleService.getOne(id);
		model.addAttribute("article", article);
		return "article/modify";
	}

	@RequestMapping("article/doDelete")
	@ResponseBody
	public String doDelete(long id) {
		StringBuilder sb = new StringBuilder();
		articleService.doDelete(id);
		String msg = id + "번째 게시글이 삭제되었습니다.";
		sb.append("alert('" + msg + "');");
		sb.append("location.replace('./list');");
		sb.insert(0, "<script>");
		sb.append("</script>");
		return sb.toString();

	}
}
