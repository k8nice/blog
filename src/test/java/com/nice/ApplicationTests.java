package com.nice;

import com.nice.entity.Article;
import com.nice.mapper.ArticleMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private ArticleMapper articleMapper;

    @Test
    public void test(){
        articleMapper.addArticle(new Article(null,1,"1","1","1","","1","1","1","1","1","1","1",1,1,1));
    }


}
