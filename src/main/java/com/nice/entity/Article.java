package com.nice.entity;

import org.springframework.context.annotation.Bean;

/**
 * 文章实体类
 * @author nice
 */
public class Article {

    private Integer id;                 //主键，自增
    private Integer articleId;          //文章id
    private String  author;             //作者
    private String  originalAuthor;     //文章原作者
    private String  articleTitle;       //文章标题
    private String  articleContent;     //文章内容
    private String  articleTags;        //文章标签
    private String  articleType;        //文章类型
    private String  articleCategories;  //文章分类
    private String  publishDate;        //发布文章日期
    private String  updateDate;         //更新文章日期
    private String  articleUrl;         //文章url
    private String  articleTabloid;     //文章摘要
    private String  likes;              //文章喜欢数
    private String  lastArticleId;      //上一篇文章id
    private String  nextArticleId;      //下一篇文章id

    public Article() {
    }

    /**
     *
     * @param id
     * @param articleId
     * @param author
     * @param originalAuthor
     * @param articleTitle
     * @param articleContent
     * @param articleTags
     * @param articleType
     * @param articleCategories
     * @param publishDate
     * @param updateDate
     * @param articleUrl
     * @param articleTabloid
     * @param likes
     * @param lastArticleId
     * @param nextArticleId
     */
    public Article(Integer id, Integer articleId, String author, String originalAuthor, String articleTitle, String articleContent, String articleTags, String articleType, String articleCategories, String publishDate, String updateDate, String articleUrl, String articleTabloid, String likes, String lastArticleId, String nextArticleId) {
        this.id = id;
        this.articleId = articleId;
        this.author = author;
        this.originalAuthor = originalAuthor;
        this.articleTitle = articleTitle;
        this.articleContent = articleContent;
        this.articleTags = articleTags;
        this.articleType = articleType;
        this.articleCategories = articleCategories;
        this.publishDate = publishDate;
        this.updateDate = updateDate;
        this.articleUrl = articleUrl;
        this.articleTabloid = articleTabloid;
        this.likes = likes;
        this.lastArticleId = lastArticleId;
        this.nextArticleId = nextArticleId;
    }

    public Integer getId() {
        return id;
    }

    @Bean
    public void setId(Integer id) {
        this.id = id;
    }

    @Bean
    public Integer getArticleId() {
        return articleId;
    }

    @Bean
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    @Bean
    public String getAuthor() {
        return author;
    }

    @Bean
    public void setAuthor(String author) {
        this.author = author;
    }

    @Bean
    public String getOriginalAuthor() {
        return originalAuthor;
    }

    @Bean
    public void setOriginalAuthor(String originalAuthor) {
        this.originalAuthor = originalAuthor;
    }

    @Bean
    public String getArticleTitle() {
        return articleTitle;
    }

    @Bean
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    @Bean
    public String getArticleContent() {
        return articleContent;
    }

    @Bean
    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    @Bean
    public String getArticleTags() {
        return articleTags;
    }

    @Bean
    public void setArticleTags(String articleTags) {
        this.articleTags = articleTags;
    }

    @Bean
    public String getArticleType() {
        return articleType;
    }

    @Bean
    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    @Bean
    public String getArticleCategories() {
        return articleCategories;
    }

    @Bean
    public void setArticleCategories(String articleCategories) {
        this.articleCategories = articleCategories;
    }

    @Bean
    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    @Bean
    public String getUpdateDate() {
        return updateDate;
    }

    @Bean
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Bean
    public String getArticleUrl() {
        return articleUrl;
    }

    @Bean
    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

    @Bean
    public String getArticleTabloid() {
        return articleTabloid;
    }

    @Bean
    public void setArticleTabloid(String articleTabloid) {
        this.articleTabloid = articleTabloid;
    }

    @Bean
    public String getLikes() {
        return likes;
    }

    @Bean
    public void setLikes(String likes) {
        this.likes = likes;
    }

    @Bean
    public String getLastArticleId() {
        return lastArticleId;
    }

    @Bean
    public void setLastArticleId(String lastArticleId) {
        this.lastArticleId = lastArticleId;
    }

    @Bean
    public String getNextArticleId() {
        return nextArticleId;
    }

    @Bean
    public void setNextArticleId(String nextArticleId) {
        this.nextArticleId = nextArticleId;
    }
}
