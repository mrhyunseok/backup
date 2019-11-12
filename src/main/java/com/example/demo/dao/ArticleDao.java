package com.example.demo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.Article;

@Mapper
public interface ArticleDao {

	public List<Article> getList();

	public void add(Map<String, Object> param);

	public Article getOne(long id);

	public void doDelete(long id);

	public void doModify(Map<String, Object> param);

	public void hitup(long id);

}
