package com.nice.service.impl;

import com.nice.dao.ArticleDao;
import com.nice.entity.Article;
import com.nice.service.ArticleService;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


/**
 * @author nice
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    private ArticleDao articleDao;

    @Override
    public List<Article> addArticle(Article article) {
        List<Article> list = new ArrayList<Article>();
        list.add(articleDao.addArticle(article));
        return list;
    }
}
