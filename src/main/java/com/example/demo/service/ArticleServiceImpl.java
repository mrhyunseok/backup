package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ArticleDao;
import com.example.demo.dto.Article;
import com.example.demo.util.CUtil;

@Service

public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleDao articleDao;

	@Override
	public List<Article> getList() {
		return articleDao.getList();
	}

	@Override
	public long add(Map<String, Object> param) {
		articleDao.add(param);
		return CUtil.getAsLong(param.get("id"));
	}

	@Override
	public Article getOne(long id) {
		return articleDao.getOne(id);
	}

	@Override
	public void doDelete(long id) {
		articleDao.doDelete(id);

	}

	@Override
	public void doModify(Map<String, Object> param) {
		articleDao.doModify(param);

	}

	@Override
	public void hitup(long id) {
		articleDao.hitup(id);

	}

}
