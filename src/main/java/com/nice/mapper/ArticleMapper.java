package com.nice.mapper;

import com.nice.entity.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author nice
 */
@Mapper
public interface ArticleMapper {

    @Insert("        INSERT into `ARTICLE`(`ID`,`ARTICLEID`,`AUTHOR`,`ORIGINALAUTHOR`,`ARTICLETITLE`,`ARTICLECONTENT`,`ARTICLETAGS`,\n" +
            "        `ARTICLETYPE`,`ARTICLECATEGORIES`,`PUBLISHDATE`,`UPDATEDATE`,`ARTICLEURL`,`ARTICLETABLOID`,`LIKES`" +
            "        ,`LASTARTICLEID`,`NEXTARTICLEID`) VALUES(#{id},#{articleId},#{author},#{originalAuthor},#{articleTitle},#{articleContent},#{articleTags},#{articleType},\n" +
            "        #{articleCategories},#{publishDate},#{updateDate},#{articleUrl},#{articleTabloid},#{likes},#{lastArticleId},#{nextArticleId})")
    Integer addArticle(Article article);

}
