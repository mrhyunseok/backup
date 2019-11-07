package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.dto.Article;

public interface ArticleService {

	public List<Article> getList();

	public long add(Map<String, Object> param);

	public Article getOne(long id);

	public void doDelete(long id);

}
