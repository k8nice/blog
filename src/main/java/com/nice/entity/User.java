package com.nice.entity;

import org.springframework.context.annotation.Bean;

/**
 * 用户实体类
 * @author nice
 */
public class User {
    private Integer id;             //主键,自增
    private String  phone;          //手机号
    private String  userName;       //用户名
    private String  password;       //密码
    private String  gender;         //性别
    private String  tureName;       //姓名
    private String  birthday;       //生日
    private String  email;          //邮箱
    private String  personBrief;    //个人简介
    private String  avatarImgUrl;   //头像url
    private String  recentlyLanded; //最近登陆时间

    public User() {
    }

    /**
     *
     * @param id
     * @param phone
     * @param userName
     * @param password
     * @param gender
     * @param tureName
     * @param birthday
     * @param email
     * @param personBrief
     * @param avatarImgUrl
     * @param recentlyLanded
     */
    public User(Integer id, String phone, String userName, String password,
                String gender, String tureName, String birthday, String email,
                String personBrief, String avatarImgUrl, String recentlyLanded) {
        this.id = id;
        this.phone = phone;
        this.userName = userName;
        this.password = password;
        this.gender = gender;
        this.tureName = tureName;
        this.birthday = birthday;
        this.email = email;
        this.personBrief = personBrief;
        this.avatarImgUrl = avatarImgUrl;
        this.recentlyLanded = recentlyLanded;
    }

    @Bean
    public Integer getId() {
        return id;
    }

    @Bean
    public void setId(Integer id) {
        this.id = id;
    }

    @Bean
    public String getPhone() {
        return phone;
    }

    @Bean
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Bean
    public String getUserName() {
        return userName;
    }

    @Bean
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Bean
    public String getPassword() {
        return password;
    }

    @Bean
    public void setPassword(String password) {
        this.password = password;
    }

    @Bean
    public String getGender() {
        return gender;
    }

    @Bean
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Bean
    public String getTureName() {
        return tureName;
    }

    @Bean
    public void setTureName(String tureName) {
        this.tureName = tureName;
    }

    @Bean
    public String getBirthday() {
        return birthday;
    }

    @Bean
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Bean
    public String getEmail() {
        return email;
    }

    @Bean
    public void setEmail(String email) {
        this.email = email;
    }

    @Bean
    public String getPersonBrief() {
        return personBrief;
    }

    @Bean
    public void setPersonBrief(String personBrief) {
        this.personBrief = personBrief;
    }

    @Bean
    public String getAvatarImgUrl() {
        return avatarImgUrl;
    }

    @Bean
    public void setAvatarImgUrl(String avatarImgUrl) {
        this.avatarImgUrl = avatarImgUrl;
    }

    @Bean
    public String getRecentlyLanded() {
        return recentlyLanded;
    }

    @Bean
    public void setRecentlyLanded(String recentlyLanded) {
        this.recentlyLanded = recentlyLanded;
    }
}
