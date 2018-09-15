package com.nice.dao.impl;

import com.nice.dao.UserDao;
import com.nice.entity.Article;

/**
 * @author nice
 */
public class UserDaoImpl implements UserDao {
    @Override
    public Article addArticle(Article article) {
        return article;
    }
}
