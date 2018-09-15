package com.nice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author nice
 */
@Controller
@RequestMapping("/save")
public class ArticleController {

    @GetMapping
    public String index(){
        return "index";
    }

    /**
     * 接收编写的文章
     * @param str
     * @return
     */
    @PostMapping("/saveArticle")
    @ResponseBody
    public String saveArticle(@RequestParam("article") String str){
        System.out.println(str);
        return str;
    }

}
